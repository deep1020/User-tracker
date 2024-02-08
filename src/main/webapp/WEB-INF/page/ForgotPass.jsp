<%@page import="com.Beans.RegBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<link rel="preconnect" href="https://fonts.gstatic.com">
<link
	href="https://fonts.googleapis.com/css2?family=Goldman:wght@700&display=swap"
	rel="stylesheet">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

<style>
.form {
	text-align: center;
	border-style: solid;
	height: 203px;
	width: 45%;
	margin-left: 27%;
	border-radius: 25px;
}

.btn {
	cursor: pointer;
}

.btn:hover {
	background-color: #3b2675;
	color: white;
}
</style>


</head>
<body style="background-color: #3b2675;">

	<h1 style="background-color: grey; text-align: center; color: white;">ForgetPassword???</h1>

	<form action="forget" class="form" style="background-color: white">
		<br>
		<br> <label
			style="color: #3b2675; font-family: 'Goldman', cursive;">Enter
			your Email::</label> <input type="email" size="45px" name="email" id="email"
			placeholder="Enter your Email" size="40%"> <br> <br>
		<br> <label
			style="color: #3b2675; font-family: 'Goldman', cursive;display: none;">Enter
			your message::</label> <input type="text" size="45px" name="message"
			id="message" placeholder="Enter your message" size="40%" style="display: none;"> <br>
		<br>
		<button type="submit" class="btn"
			style="font-family: 'Goldman', cursive;">Click Here</button>

		<br> <br>

	</form>


</body>
</html>