<%@page import="com.homeinsurance.entities.NormalUser"%>
<%@page import="com.homeinsurance.entities.AdminUser"%>
<%
	AdminUser adminUser = null;
	NormalUser normalUser = null;
	try{
		adminUser = (AdminUser)session.getAttribute("current-user");
	}
	catch(Exception e)
	{
		normalUser =  (NormalUser)session.getAttribute("current-user");
	}
%>


<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="index.jsp" style="font-size: 24px"><b><i><u>EMS Portal</u></i></b></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
       <!--  <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Link</a>
        </li> -->
      </ul>
      
       <ul class="navbar-nav ml-auto">
       
       <% if(adminUser == null && normalUser == null)
       { %>
	        <li class="nav-item text-right">
	          <a class="nav-link" aria-current="page" href="login.jsp"><i class="fa fa-sign-in mx-1" style="font-size: 24px"><b>Login</b></i></a>
	        </li>
	        <li class="nav-item text-right">
	          <a class="nav-link" aria-current="page" href="signup.jsp"><i class="fa fa-user" style="font-size: 24px"><b>Register</b></i></a>
	        </li>
        <%}
        else if(adminUser != null){ %>
        	<li class="nav-item active">
			    <a class="nav-link" href="admin.jsp"><b><%= adminUser.getAdminName() %></b></a>
			</li>
			      	
			<li class="nav-item active">
			     <a class="nav-link" href="LogoutServlet"><b>Logout</b></a>
			 </li>
        <%}
        else{ %>
        	<li class="nav-item active">
			    <a class="nav-link" href="normal.jsp"><b><%= normalUser.getUsername() %></b></a>
			</li>
			      	
			<li class="nav-item active">
			     <a class="nav-link" href="LogoutServlet"><b>Logout</b></a>
			 </li>
        <%}%>
      	
    </div>
  </div>
</nav>