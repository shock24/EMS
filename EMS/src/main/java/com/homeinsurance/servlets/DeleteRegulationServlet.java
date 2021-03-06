package com.homeinsurance.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.homeinsurance.dao.DepartmentDao;
import com.homeinsurance.dao.RegulationDao;
import com.homeinsurance.entities.Department;
import com.homeinsurance.helper.FactoryProvider;

/**
 * Servlet implementation class DeleteRegulationServlet
 */
public class DeleteRegulationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteRegulationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(PrintWriter out = response.getWriter()){
			out.println(request.getParameter("deleteReg"));
			try{
				int regId = Integer.parseInt(request.getParameter("deleteReg"));
				HttpSession session = request.getSession();
				RegulationDao rDao = new RegulationDao(FactoryProvider.getFactory());
				int deptId = rDao.getDepartmentOfRegulation(regId);
				System.out.println(deptId+" deleteRegServlet");
				rDao.deleteRegulationById(regId);
				
				
				session.setAttribute("message", "Regulation deleted successfully");
				response.sendRedirect("ShowDepartment.jsp?deptId="+deptId);
				return;
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
