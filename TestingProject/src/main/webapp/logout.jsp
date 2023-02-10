<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.kawacho.LoginServlet" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Logout Page</title>
</head>
<body>
<%
	session.invalidate();

%>
<% session = request.getSession(false);
if(session!=null){

	   response.sendRedirect("profile.jsp");
}
else{

	   out.println("You are successfully logout");
	   
	}
%>
<br>
<a href="login.jsp">Login</a>
</body>
</html>