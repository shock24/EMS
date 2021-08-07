<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">


    <title>Home</title>
    <%@include file="components/common_css_js.jsp" %>
  </head>
  
  
  <body>
  	<%@include file="components/navbar.jsp" %>
  	<div class="container my-3">
	    <div class="p-5 mb-4 bg-light rounded-3">
	      <div class="container-fluid py-5">
	        <h1 class="display-5 fw-bold">Employee Management System</h1>
	        <h5 >Welcome to the our EMS Portal.</h5>
	        <p>An employee management system is a platform where all work-related as well as important personal details of an employee is stored and managed in a secure way. By using this system, you can manage admin activities in an easier and quicker way.</p>
	        <%if(request.getSession().getAttribute("current-user") == null){ %>
		        <a class="btn btn-primary btn-lg my-2" type="button" href="login.jsp">Login <i class="fas fa-chevron-right"></i></a>
		        <br>
		        <a class="btn btn-primary btn-lg my-2" type="button" href="signup.jsp">Sign Up <i class="fas fa-chevron-right"></i></a>
	        <%}%>
	      </div>
	    </div>
	</div>
  </body>
</html>