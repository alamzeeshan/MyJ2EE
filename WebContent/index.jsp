<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>

<form action="login">
Name: <input type="text" name="user" id="user"/> <br>
Password: <input type="password" name="password" id="password"/> <br>
<input type="submit"/>
</form>

<%
if("failure".equals(request.getAttribute("loginResult")))
{
	out.print("Invalid Username/Password");
}
%>

</body>
</html>