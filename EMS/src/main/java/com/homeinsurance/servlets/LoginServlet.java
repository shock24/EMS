package com.homeinsurance.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.homeinsurance.dao.AdminDao;
import com.homeinsurance.dao.NormalDao;
import com.homeinsurance.entities.AdminUser;
import com.homeinsurance.entities.NormalUser;
import com.homeinsurance.helper.FactoryProvider;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try(PrintWriter out = response.getWriter()){
			try{
				String userType = request.getParameter("userType");
				if(userType.equals("admin"))
				{
					String email = request.getParameter("email");
					String password = request.getParameter("password");
					AdminDao dao = new AdminDao(FactoryProvider.getFactory());
					AdminUser user = dao.getUserByEmailAndPassword(email, password);
					HttpSession httpSession = request.getSession();
					if(user == null)
					{
						httpSession.setAttribute("message", "Invalid Details");
						response.sendRedirect("login.jsp");
						return;
					}
					else
					{
						out.println("<h2>Welcome" + user.getAdminName() + "<h2>");
						httpSession.setAttribute("current-user", user);
						httpSession.setAttribute("userType", "admin");
						response.sendRedirect("admin.jsp");
						return;
					}
				}
				else if(userType.equals("normal"))
				{
					String email = request.getParameter("email");
					String password = request.getParameter("password");
					NormalDao dao = new NormalDao(FactoryProvider.getFactory());
					NormalUser user = dao.getUserByEmailAndPassword(email, password);
					HttpSession httpSession = request.getSession();
					if(user == null)
					{
						httpSession.setAttribute("message", "Invalid Details");
						response.sendRedirect("login.jsp");
						return;
					}
					else
					{
						httpSession.setAttribute("current-user", user);
						httpSession.setAttribute("userType", "normal");
						response.sendRedirect("normal.jsp");
						return;
					}
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
