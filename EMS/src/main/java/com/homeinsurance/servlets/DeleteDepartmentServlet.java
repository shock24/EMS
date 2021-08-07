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
import org.hibernate.query.Query;

import com.homeinsurance.dao.DepartmentDao;
import com.homeinsurance.entities.Department;
import com.homeinsurance.helper.FactoryProvider;

/**
 * Servlet implementation class DeleteDepartmentServlet
 */
public class DeleteDepartmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteDepartmentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println(request.getParameter("deleteDept").getClass());
		try(PrintWriter out = response.getWriter()){
			String[] dept = request.getParameterValues("deleteDept");
			try{
				HttpSession session = request.getSession();
				for(String s : dept)
				{
					DepartmentDao dao = new DepartmentDao(FactoryProvider.getFactory());
					dao.deleteDepartmentById(Integer.parseInt(s));
				}
				session.setAttribute("message", "Department(s) deleted successfully");
				response.sendRedirect("admin.jsp");
				return;
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		
	}

}
