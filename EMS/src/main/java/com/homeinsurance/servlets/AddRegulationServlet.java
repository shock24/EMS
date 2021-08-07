package com.homeinsurance.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.homeinsurance.dao.DepartmentDao;
import com.homeinsurance.entities.Department;
import com.homeinsurance.entities.Regulation;
import com.homeinsurance.helper.FactoryProvider;

/**
 * Servlet implementation class AddRegulationServlet
 */
public class AddRegulationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public AddRegulationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			String regTitle = request.getParameter("regTitle");
			String regDesc = request.getParameter("regDesc");
			int deptId = Integer.parseInt(request.getParameter("deptId"));
			DepartmentDao dao = new DepartmentDao(FactoryProvider.getFactory());
			Department department = dao.getDepartmentById(deptId);
			Regulation r = new Regulation(regTitle, regDesc, department);
			
			Session hibernateSession = FactoryProvider.getFactory().openSession();
			Transaction tx = hibernateSession.beginTransaction();
			
			hibernateSession.save(r);
			
			tx.commit();
			hibernateSession.close();
			
			HttpSession httpSession = request.getSession();
			response.sendRedirect("ShowDepartment.jsp?deptId=" + deptId);
			return;
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
