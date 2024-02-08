<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Form</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script type="text/javascript"
	src="https://cdn.datatables.net/1.10.22/js/jquery.dataTables.min.js"></script>
<script type="text/javascript"
	src="https://cdn.datatables.net/responsive/2.2.6/js/dataTables.responsive.min.js"></script>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
<style type="text/css">
.formRegister {
	text-align: center;
	border-style: solid;
	height: 300px;
	width: 45%;
	margin-left: 27%;
	border-radius: 25px;
}

.btn {
	cursor: pointer;
}

.btn:hover {
	color: white;
	background-color: maroon;
	border-radius: 25px;
}

.clickbtn:hover {
	color: white;
	background-color: maroon;
	border-radius: 25px;
}
</style>

</head>
<body style="background-color: #a8351b;">

	<h1
		style="color: #473130; background-color: white; text-align: center;">
		Register form</h1>

	<form class="formRegister" action="RegInsert" method="post"
		style="background-color: white;">

		<br> <br> <label
			style="color: #a8351b; font-family: 'Goldman', cursive;">Enter
			Full name:</label> <input type="text" name="fname" id="fname"
			placeholder="Enter your Name" size="40%" > <br> <br>
		<label style="color: #a8351b; font-family: 'Goldman', cursive;">Email
			Address</label> <input type="email" name="email" id="email"
			placeholder="Enter your email Address" size="40%" > <br>
		<br> <label
			style="color: #a8351b; font-family: 'Goldman', cursive;">Mobile:</label>
		<input type="text" name="mobile" id="mobile" placeholder="mobile"
			size="40%" > <br> <br> <label
			style="color: #a8351b; font-family: 'Goldman', cursive;">password</label>
		<input type="password" name="password" id="password"
			placeholder="Enter your Password" size="40%" > <br> <br>
		
		<button type="submit" class="btn"
			style="font-family: 'Goldman', cursive;">Submit</button>

		<!-- 		<button type="button" onclick="InsertData();">submit</button> -->

		<a href="LoginPage">Login</a>
<!-- 		<a href="LoginPage"><button type="submit" class="clickbtn" -->
<!-- 				style="font-family: 'Goldman', cursive;">Login</button></a> -->
		<div style="color: red; font-size: 30px;">${message}</div>
		
	</form>
	
</body>
</html>