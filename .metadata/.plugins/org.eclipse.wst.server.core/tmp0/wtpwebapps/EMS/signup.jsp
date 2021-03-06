<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Sign Up</title>
    <%@include file="components/common_css_js.jsp" %>
  </head>
  <body>
  	<%@include file="components/navbar.jsp" %>
    <div class="container">
    	<div class="row my-5">
    		<div class="col-md-6 offset-md-3">
    			<h1><u><b>Sign-Up</b></u></h1>
    			<form action="SignupServlet" method="post">
				  <div class="mb-3">
				    <label for="exampleInputEmail1" class="form-label">Name</label>
				    <input type="name" class="form-control" id="name" aria-describedby="emailHelp" name="name" placeholder="Enter Your Name" required>
				  </div>
				  <div class="mb-3">
				    <label for="exampleInputEmail1" class="form-label">Email address</label>
				    <input type="email" class="form-control" id="email" aria-describedby="emailHelp" name="email" placeholder="Enter Email" required>
				  </div>
				  <div class="mb-3">
				    <label for="exampleInputPassword1" class="form-label">Password</label>
				    <input type="password" class="form-control" id="password" name="password" placeholder="Enter Password" required>
				  </div>
				  <div class="mb-3">
				  	<input type="radio" id="admin" name="userType" value="admin">
				  	<label for="admin">Admin</label>
				  	<input type="radio" id="normal" name="userType" value="normal">
				  	<label for="normal">Normal</label>
				  </div>
				  <button type="submit" class="btn btn-primary">Submit</button>
				</form>
    		
    		</div>
    	</div>
    	
    </div>
  </body>
</html>