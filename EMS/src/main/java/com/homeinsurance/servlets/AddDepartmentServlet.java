package com.homeinsurance.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.homeinsurance.entities.Department;
import com.homeinsurance.entities.Regulation;
import com.homeinsurance.helper.FactoryProvider;

/**
 * Servlet implementation class AddDepartmentServlet
 */
public class AddDepartmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddDepartmentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String deptName = request.getParameter("deptName");
		List<Regulation> allRegulations = null;
		Department department = new Department(deptName, allRegulations);
		
		Session hibernateSession = FactoryProvider.getFactory().openSession();
		Transaction tx = hibernateSession.beginTransaction();
		
		hibernateSession.save(department);
		
		tx.commit();
		hibernateSession.close();
		
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("message", "Department added successfully");
		response.sendRedirect("admin.jsp");
		return;
		
		
	}

}
