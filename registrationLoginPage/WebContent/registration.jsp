<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<h2>Register here</h2>
	
	<form method="post" action ="RegisterServlet">
	<table >
		<tr>
			<td align='right'> First Name:</td>
			<td align='left'><input type='text' name='firstName'> </td>
		</tr>
		<tr>
			<td align='right'> Last Name:</td>
			<td align='left'><input type='text' name='lastName'> </td>
		</tr>
		<tr>
			<td align='right'> Email:</td>
			<td align='left'><input type='text' name='email'> </td>
		</tr>
		
		<tr>
			<td align='right'> Password:</td>
			<td align='left'><input type='password' name='password'> </td>
		</tr>
		<tr>
			<td align='right'> Confirm password:</td>
			<td align='left'><input type='password' name='confPass'> </td>
		</tr>
		<tr>
			<td align='right'> </td>
			<td align='left'><input type='submit' value='Register'> </td>
		</tr>
	
	</table>
	</form>
</body>
</html>