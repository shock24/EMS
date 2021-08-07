<%@page import="com.learn.mycart.entities.User" %>

<%
	User user=(User)session.getAttribute("current-user");
	if(user==null)
	{
		session.setAttribute("message", "You are not logged in");
		response.sendRedirect("login.jsp");
		return;
	}
	else
	{
		if(user.getUserType().equals("admin"))
		{
			session.setAttribute("message", "You have not logged in through a normal account!!! Kindly log in again");
			session.removeAttribute("current-user");
			response.sendRedirect("login.jsp");
			return;
			
		}
	}




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
	<h1>This is normal-user panel</h1>
</body>
</html>