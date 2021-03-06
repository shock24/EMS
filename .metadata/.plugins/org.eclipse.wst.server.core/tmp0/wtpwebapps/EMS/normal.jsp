<%@page import="com.homeinsurance.entities.NormalUser"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="com.homeinsurance.dao.DepartmentDao"%>
<%@page import="com.homeinsurance.entities.Department"%>
<%@page import="java.util.List"%>
<%@page import="com.homeinsurance.helper.FactoryProvider"%>
<%
	NormalUser user = (NormalUser)session.getAttribute("current-user");
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
<title>Normal Page</title>
<%@include file="components/common_css_js.jsp" %>
</head>
<body>
<%@include file="components/navbar.jsp" %>
	<div class="container my-3">
	<%@include file="components/message.jsp" %>
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
</body>
</html>