<%@page import="com.kawacho.LoginServlet" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile</title>
</head>
<body>
<h3>Welcome 
<%
Object user = session.getAttribute("userName");
out.println(user);
%>
 </h3>

<br>
<br>
<a href="logout.jsp">Logout</a>
</body>
</html>