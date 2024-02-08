<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.10.22/css/dataTables.bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdn.datatables.net/select/1.3.1/css/select.bootstrap.min.css">
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script type="text/javascript"
	src="https://cdn.datatables.net/1.10.22/js/jquery.dataTables.min.js"></script>
<script type="text/javascript"
	src="https://cdn.datatables.net/1.10.22/js/dataTables.bootstrap.min.js"></script>
<script type="text/javascript"
	src="https://cdn.datatables.net/select/1.3.1/js/dataTables.select.min.js"></script>
<link
	href="https://cdn.datatables.net/1.10.22/css/jquery.dataTables.min.css"
	type="text/css" rel="stylesheet">
<link
	href="https://cdn.datatables.net/responsive/2.2.6/css/responsive.dataTables.min.css"
	type="text/css" rel="stylesheet">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script type="text/javascript"
	src="https://cdn.datatables.net/1.10.22/js/jquery.dataTables.min.js"></script>
<script type="text/javascript"
	src="https://cdn.datatables.net/responsive/2.2.6/js/dataTables.responsive.min.js"></script>
<meta charset="ISO-8859-1">
<title>Display Information</title>
</head>
<body style="background-color: cyan">

	<form action="totalusers">
		<div style="background-color: red; width: 100%; font-size: 55px;">${TotalUsers}
		</div>
		<button type="submit" class='btn btn-success'>TotalUser</button>
	</form>

</body>
</html>