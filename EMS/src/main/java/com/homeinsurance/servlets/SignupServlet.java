package com.homeinsurance.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;

import com.homeinsurance.entities.AdminUser;
import com.homeinsurance.entities.NormalUser;
import com.homeinsurance.helper.FactoryProvider;

public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SignupServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(PrintWriter out = response.getWriter())
		{
			try{
				String userType = request.getParameter("userType");
				if(userType.equals("normal"))
				{
					String username = request.getParameter("name");
					String email = request.getParameter("email");
					String password = request.getParameter("password");
					NormalUser normalUser = new NormalUser(username, email, password, "normal");
					
					Session hibernateSession = FactoryProvider.getFactory().openSession();
					Transaction tx = hibernateSession.beginTransaction();
					
					hibernateSession.save(normalUser);
					
					tx.commit();
					hibernateSession.close();
					
					HttpSession httpSession = request.getSession();
					httpSession.setAttribute("message", "Registration successful");
					response.sendRedirect("login.jsp");
					return;
				}
				else if(userType.equals("admin"))
				{
					String adminName = request.getParameter("name");
					String adminEmail = request.getParameter("email");
					String adminPassword = request.getParameter("password");
					AdminUser adminUser = new AdminUser(adminName, adminEmail, adminPassword, "admin");
					
					Session hibernateSession = FactoryProvider.getFactory().openSession();
					Transaction tx = hibernateSession.beginTransaction();
					
					hibernateSession.save(adminUser);
					
					tx.commit();
					hibernateSession.close();
					
					HttpSession httpSession = request.getSession();
					httpSession.setAttribute("message", "Registration successful");
					response.sendRedirect("login.jsp");
					return;
					
				}
			}
			catch(ConstraintViolationException c)
			{
				HttpSession httpSession=request.getSession();
				httpSession.setAttribute("message", "User with this email already exist");
				response.sendRedirect("signup.jsp");
				return;
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
