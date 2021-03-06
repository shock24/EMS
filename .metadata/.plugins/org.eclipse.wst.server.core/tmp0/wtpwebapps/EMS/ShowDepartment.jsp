<%@page import="com.homeinsurance.dao.RegulationDao"%>
<%@page import="com.homeinsurance.entities.Regulation"%>
<%@page import="java.util.List"%>
<%@page import="com.homeinsurance.helper.FactoryProvider"%>
<%@page import="com.homeinsurance.dao.DepartmentDao"%>
<%@page import="com.homeinsurance.entities.Department"%>
<%
String id = request.getParameter("deptId");
int deptId = Integer.parseInt(id);
DepartmentDao dao = new DepartmentDao(FactoryProvider.getFactory());
Department dept = dao.getDepartmentById(deptId);

RegulationDao rDao = new RegulationDao(FactoryProvider.getFactory());
List<Regulation> allRegulations = rDao.getAllRegulations(deptId);

%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><%= dept.getDeptName() %></title>
<%@include file="components/common_css_js.jsp" %>
</head>
<body>
<div id="fb-root"></div>
<script async defer crossorigin="anonymous" src="https://connect.facebook.net/en_US/sdk.js#xfbml=1&version=v11.0" nonce="OPwUVGB5"></script>
	
	<%@include file="components/navbar.jsp" %>
	<div class="container">
		<div class="container text-end my-3">
		<%if(request.getSession().getAttribute("userType").equals("admin")){ %>
			<a type="button" class="btn btn-primary mx-3" href="admin.jsp">Back to departments</a>
		<%} else { %>
			<a type="button" class="btn btn-primary mx-3" href="normal.jsp">Back to departments</a>
		<%} %>
			<%if(request.getSession().getAttribute("userType").equals("admin")){ %>
				<button class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#addRegulationModal">Add Regulation</button>
			 <% }%>
		</div>
		
		<% for(Regulation r : allRegulations){ %> 
			<div class="row mt-3">
					<div class="col-md-5">
						<div class="card" style="width: 50rem;">
						  <div class="card-body">
						    <h5 class="card-title"><%= r.getRegTitle() %></h5>
						    <p class="card-text"><%= r.getDescription() %></p>
						  </div>
						</div>
						<%if(request.getSession().getAttribute("userType").equals("admin")){ %>
							<button class="btn btn-outline-primary my-2" data-bs-toggle="modal" data-bs-target="#editRegulation<%= r.getRegId() %>">Edit</button>
							<form action="DeleteRegulationServlet">
								<button type="submit" name="deleteReg" class="btn btn-outline-warning my-2" value="<%= r.getRegId()%>">Delete</button>
							</form>
						<%} %>
					</div>
				</div>
				
				<!-- Modal -->
				<div class="modal fade" id="editRegulation<%= r.getRegId() %>" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
				  <div class="modal-dialog">
				    <div class="modal-content"> 
				      <!--<div class="modal-header">
				        <h5 class="modal-title" id="exampleModalLabel"><%= r.getRegTitle() %></h5>
				        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
				      </div> -->
				      <div class="modal-body">
				        <form action="UpdateRegulationServlet" method="post">
						  <div class="mb-3">
						    <input type="hidden" name="regId" value="<%= r.getRegId() %>">
						    <input type="hidden" name="deptId" value="<%= r.getDepartment().getDeptId() %>">
						    <input type="text" class="form-control" id="regTitle" aria-describedby="emailHelp" value="<%= r.getRegTitle() %>" name="regTitle">
						  </div>
						  <div class="mb-3">
						    <textarea class="form-control" name="regDesc"><%= r.getDescription() %></textarea>
						  </div>
						  <button type="submit" class="btn btn-primary">Submit</button>
						</form>
				      </div>
				    </div>
				  </div>
				</div>
				<div class="fb-comments" data-href="http://localhost:9494/EMS/ShowDepartment.jsp?deptId=8" data-width="" data-numposts="5"></div>
		<% } %>
	 </div>
	 
	 <!-- Add Regulation Modal -->
		<div class="modal fade" id="addRegulationModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
		  <div class="modal-dialog">
		    <div class="modal-content">
		      <div class="modal-header">
		        <h5 class="modal-title" id="exampleModalLabel">Add Regulation</h5>
		        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
		      </div>
		      <div class="modal-body">
		      <form action="AddRegulationServlet" method="post">
				  <div class="mb-3">
				  	<input type="hidden" name="deptId" value="<%= deptId %>">
				    <input type="text" class="form-control" id="regTitle" aria-describedby="regTitle" name="regTitle" placeholder="Enter Title" required>
				  </div>
				  <div class="mb-3">
				    <textarea style="height:150px" class="form-control" name="regDesc" placeholder="Enter Regulation Details" required></textarea>
				  </div>
				  
				  <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
				  <button type="submit" class="btn btn-primary">Submit</button>
			  </form>
		        
		      </div>
		    </div>
		  </div>
		</div>
</body>
</html>