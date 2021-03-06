package com.homeinsurance.servlets;

import java.io.IOException;
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
 * Servlet implementation class UpdateRegulationServlet
 */
public class UpdateRegulationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateRegulationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			String regTitle = request.getParameter("regTitle");
			String regDesc = request.getParameter("regDesc");
			int regId = Integer.parseInt(request.getParameter("regId"));
			int deptId = Integer.parseInt(request.getParameter("deptId"));
//			DepartmentDao dao = new DepartmentDao(FactoryProvider.getFactory());
//			Department department = dao.getDepartmentById(deptId);
			
			Session hibernateSession = FactoryProvider.getFactory().openSession();
			Transaction tx = hibernateSession.beginTransaction();
			
			String query = "update Regulation as r set r.regTitle = :title, r.description = :regDesc where r.regId = :id";
			Query q = hibernateSession.createQuery(query);
			q.setParameter("id", regId);
			q.setParameter("title", regTitle);
			q.setParameter("regDesc", regDesc);
			q.executeUpdate();
			
			tx.commit();
			hibernateSession.close();
			
			HttpSession httpSession = request.getSession();
			response.sendRedirect("ShowDepartment.jsp?deptId="+deptId);
			return;
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
