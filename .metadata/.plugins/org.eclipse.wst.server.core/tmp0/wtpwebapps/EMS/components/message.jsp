<%
	String message =  (String)session.getAttribute("message");
	if(message=="User with this email already exist" || message=="Invalid Details" || message == "You are not logged-in!! Login first.") {
	%>
		<div class="alert alert-warning alert-dismissible fade show" role="alert">
		  <strong><%= message %></strong>
		  <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
		</div>
		
	<%	
		session.removeAttribute("message");
	}
	else if(message!=null){
	%>
		<div class="alert alert-success alert-dismissible fade show" role="alert">
		  <strong><%= message %></strong>
		  <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
		</div>
	
	
	<%	
	
		session.removeAttribute("message");
	}
	
%>