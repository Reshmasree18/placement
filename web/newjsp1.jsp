<%-- 
    Document   : newjsp1
    Created on : Mar 20, 2019, 1:25:33 PM
    Author     : KHSCI5MCA16089
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP IF Statement</title>
</head>
<body>
<form action="#">
<p>Enter Name : 
<input type="text" name="name"/></p>
<p>Enter Password : 
<input type="password" name="password"/></p>
<p><input type="submit" value="submit"/></p>
</form>
<%
String name = request.getParameter("name");
String password = request.getParameter("password");
%>
<!--JSP IF implementation.-->
<%
if(name == null)
{
    %>
<p>Welcome</p>
<%
    }
if(name !=null)
if(name.equals("deepak") && password.equals("deepak"))
{
%>
<p>Welcome, <%=name %></p>
<%
}
%>
</body>
</html>
