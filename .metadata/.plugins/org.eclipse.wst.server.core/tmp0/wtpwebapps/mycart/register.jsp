<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@include file="components/common_css_js.jsp" %>
<title>Registration Form</title>
</head>
<body style="background-image: url('img/signup.jpg'); height:100%; background-repeat: no-repeat; background-position: center; background-size: cover;">
	<%@include file="components/navbar.jsp" %>
	<div class="container-fluid">
		
		<div class="row mt-4">
			<div class="col-md-4 offset-md-1">
				<div class="card">
				<%@include file="components/message.jsp" %>
					<div class="card-body">
						<div class="container text-center">
							<img src="img/registration.png" alt="registration icon" style="max-width:70px">
							<h3 style="text-shadow: 2px 2px purple">Sign up here</h3>
						</div>
						
						
						<form action="RegisterServlet" method="post">
							<div class="form-group">
							    <label for="name">User Name</label>
							    <input required name="user_name" type="text" class="form-control" id="name" aria-describedby="emailHelp" placeholder="Enter name">
							</div>
							
							<div class="form-group">
							    <label for="email">User Email</label>
							    <input required name="user_email" type="email" class="form-control" id="email" aria-describedby="emailHelp" placeholder="Enter Email">
							</div>
							
							<div class="form-group">
							    <label for="password">User Password</label>
							    <input required name="user_password" type="password" class="form-control" id="password" aria-describedby="emailHelp" placeholder="Enter Password">
							</div>
							
							<div class="form-group">
							    <label for="phone">User Phone</label>
							    <input required name="user_phone" type="number" class="form-control" id="phonel" aria-describedby="emailHelp" placeholder="Enter Phone">
							</div>
							
							<div class="form-group">
							    <label for="address">User Address</label>
							    <textarea required name="user_address" style="height:100px" class="form-control" placeholder="Enter Address"></textarea>
							</div>
							
							<div class="container text-center">
								<button type="submit" class="btn btn-outline-success">Register</button>
								<button type="reset" class="btn btn-outline-warning">Reset</button>
							</div>
						</form>
			
					
					</div>
				</div>
			</div>
		</div>
	
	</div>
</body>
</html>