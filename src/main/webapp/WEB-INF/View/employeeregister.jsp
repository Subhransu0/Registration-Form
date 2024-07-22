<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div align="center">
<h1>Employee Registration Form</h1>
<form action="<%= request.getContextPath() %>/EmployeeServlet" method="post">
<table>
<tr>
<td>FIRST NAME</td>
<td><input type ="text" name="firstname"></td>
</tr>
<tr>
<td>LAST NAME</td>
<td><input type ="text" name="lastname"></td>
</tr>
<tr>
<td>USERNAME</td>
<td><input type ="text" name="username"></td>
</tr>
<tr>
<td>PASSWORD</td>
<td><input type ="text" name="password"></td>
</tr>
<tr>
<td>ADDRESS</td>
<td><input type ="text" name="address"></td>
</tr>
<tr>
<td>CONTACT</td>
<td><input type ="text" name="contact"></td>
</tr>
<tr>

<td><input type ="Submit" value ="register"></td>
</tr>
</table>


</form>

</div>

</body>
</html>