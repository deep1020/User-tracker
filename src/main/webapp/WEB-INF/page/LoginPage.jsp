<%@page import="com.Beans.RegBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style type="text/css">
.form {
	text-align: center;
	border-style: solid;
	height: 203px;
	width: 45%;
	margin-left: 27%;
	border-radius: 25px;
}
.btn
{
cursor: pointer;
 
}
.btn:hover {
color:white;
 background-color: pink;
 border-radius: 25px;

}
.clickbtn:hover
{
color:yellow;
 background-color: maroon;
 color: white;

}
</style>


</head>
<body style="background-color: #a4a832">

	<h1 style="background-color: maroon; text-align: center; color: white;">Login</h1>

	<form action="LoginSelect" class="form" style="background-color: white;" method="post"><br> <br>
	
		<label style="color:#3b2675; font-family: 'Goldman', cursive;">Email Address</label> 
			<input type="text" name="email"    id="email" placeholder="Enter your email Address" size="40%"> <br> <br>
			 
		<label style="color:#3b2675; font-family: 'Goldman', cursive;">password</label> 
			<input type="password" name="password" id="password" placeholder="Enter your Password" size="40%"> <br> <br>

		<button type="submit" class="clickbtn" style="font-family: 'Goldman', cursive;">login</button>

		<a href="ForgotPass">Forget Password!!</a>
		
		<div style="color: red; font-size: 30px;">${msg}</div>
		<br> <br> 

	</form>

<!-- 	<div -->
<%-- 		style="color: white; background-color: maroon; width: 100%; text-align: center; font-size: 52px;">${msg2} --%>
<!-- 	</div> -->

</body>
</html>