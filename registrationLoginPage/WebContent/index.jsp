<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<h3>Login here</h3>


<form  action ="LoginServlet" method="post">
	<table >
		<tr>
			<td align='right'> Email:</td>
			<td align='left'><input type='text' name='email'> </td>
		</tr>
		
		<tr>
			<td align='right'> Password:</td>
			<td align='left'><input type='password' name='password'> </td>
		</tr>
		<tr>
			<td align='right'> </td>
			<td align='left'><input type='submit' value='submit'> </td>
		</tr>
	
	</table>
<a href='registration.jsp'>create an account</a>

</form>

</body>
</html>