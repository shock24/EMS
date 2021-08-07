<%
	User user=(User)session.getAttribute("current-user");
	if(user==null)
	{
		
		session.setAttribute("message", "You are not logged in!! Login first to access checkout page");
		response.sendRedirect("login.jsp");
		return;
	}




%>



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Checkout</title>
<%@include file="components/common_css_js.jsp" %>
</head>
<body>
<%@include file="components/navbar.jsp" %>

	<div class="container">
		<div class="row mt-5">
			<div class="col-md-6">
				<!-- card -->
				<div class="card">
					<div class="card-header">
						<h3 class="text-center my-3"><b><u>Your Selected Items</u></b></h3>
					</div>
				
					<div class="card-body">
						<div class="cart-body">
				
				
						</div>
					
					
					</div>
				
				</div>
			
			
			</div>
			<div class="col-md-6">
				<!-- form details -->
				<div class="card">
					<div class="card-header">
						<h3 class="text-center my-3"><b><u>Order Details</u></b></h3>
					</div>
				
					<div class="card-body">
						<form>
							<div class="form-group">
							    <label for="exampleInputEmail1">Email address</label>
							    <input value="<%= user.getUserEmail() %>" type="email" class="form-control" id="email" aria-describedby="emailHelp" placeholder="Enter email">
							</div>
							
							<div class="form-group">
							    <label for="name">Your Name</label>
							    <input value="<%= user.getUserName() %>" type="text" class="form-control" id="name" aria-describedby="emailHelp" placeholder="Enter name">
							</div>
							
							<div class="form-group">
							    <label for="exampleFormControlTextarea1">Your Contact</label>
							    <input value="<%= user.getUserPhone() %>" type="number" class="form-control" id="phone" aria-describedby="emailHelp" placeholder="Enter phone">
							</div>
						
							<div class="form-group">
							    <label for="exampleFormControlTextarea1">Shipping Address</label>
							    <textarea class="form-control" placeholder="Enter Your Address" id="exampleFormControlTextarea1" rows="3"><%= user.getUserAddress() %></textarea>
							</div>
							
							
							<div class="container text-center">
								<button class="btn btn-outline-success">Order Now</button>
								<button class="btn btn-outline-primary">Continue Shopping</button>
							</div>
						
						</form>
					
					
					</div>
				
				</div>
			
			</div>
		
		</div>
	
	</div>



<%@include file="components/common_modals.jsp" %>
</body>
</html>