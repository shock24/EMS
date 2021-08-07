<%@page import="java.io.PrintWriter"%>
<%@page import="com.homeinsurance.dao.DepartmentDao"%>
<%@page import="com.homeinsurance.entities.Department"%>
<%@page import="java.util.List"%>
<%@page import="com.homeinsurance.helper.FactoryProvider"%>
<%
	AdminUser user = (AdminUser)session.getAttribute("current-user");
	if(user == null){
		session.setAttribute("message", "You are not logged-in!! Login first.");
		response.sendRedirect("login.jsp");
		return;
	}
%>

<%
	DepartmentDao dao = new DepartmentDao(FactoryProvider.getFactory());
	List<Department> list = dao.getDepartments();
	/* PrintWriter writer = response.getWriter();
	for(Department d : list){
		writer.println(d.getDeptName());
	} */

%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Page</title>
<%@include file="components/common_css_js.jsp" %>
</head>
<body>
<%@include file="components/navbar.jsp" %>
	<div class="container my-3">
	<%@include file="components/message.jsp" %>
		<div class="text-end mx-auto">
			<button type="button" class="btn btn-info" data-bs-toggle="modal" data-bs-target="#addDepartmentModal">Add Department</button>
			<button type="button" class="btn btn-info" data-bs-toggle="modal" data-bs-target="#deleteDepartmentModal">Delete Department</button>
		</div>
		<% for(Department d : list) { %>
			<div class="row mt-3">
				<div class="col-md-3">
					<a href="ShowDepartment.jsp?deptId=<%= d.getDeptId() %>">
						<div class="card" style="width: 18rem;">
						  <div class="card-body text-center">
						    <h5 class="card-title"><%= d.getDeptName() %></h5>
						  </div>
						</div>
					</a>
				</div>
			</div>
		<%}
		%>
	</div>
	
	<!-- Add Department Modal  -->
	<div class="modal fade" id="addDepartmentModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
	  <div class="modal-dialog">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="exampleModalLabel">Add Department</h5>
	        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
	      </div>
	      <div class="modal-body">
	        <form action="AddDepartmentServlet" method="GET">
			  <div class="mb-3">
			    <label for="addDepartment" class="form-label">Department Name</label>
			    <input type="text" class="form-control" id="addDepartment" placeholder="Enter Department Name" name="deptName" required>
			  </div>
			  
			  <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
	          <button type="submit" class="btn btn-primary">Save changes</button>
			</form>
	      </div>
	    </div>
	  </div>
	</div>
	<!-- End of Add Department Modal  -->
	
	<!-- Delete Department Modal  -->
	<div class="modal fade" id="deleteDepartmentModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
	  <div class="modal-dialog">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="exampleModalLabel">Delete Department</h5>
	        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
	      </div>
	      <div class="modal-body">
	        <form action="DeleteDepartmentServlet" action="GET">
	        	<%for(Department d: list){%>
	        		<div class="form-check">
					  <input class="form-check-input" type="checkbox" value="<%= d.getDeptId() %>" id="flexCheckDefault" name="deleteDept">
					  <label class="form-check-label" for="flexCheckDefault">
					    <%= d.getDeptName()%>
					  </label>
					</div>
	        	<%} %>
	        	
	        	<button type="submit" class="btn btn-primary">Delete</button>
	        </form>
	      </div>
	    </div>
	  </div>
	</div>
	<!-- End of Delete Department Modal  -->
</body>
</html>