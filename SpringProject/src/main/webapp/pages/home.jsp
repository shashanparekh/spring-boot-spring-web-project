<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="home">
	<input type="number" name="aid"><br>
	<input type="text" name="aname"><br>
	<input type="text" name="lang"><br>
	<input type="submit">
	</form>
	<h1>Display data taken from user</h1>
	<h1>${obj.aid}</h1><br>
	<h1>${obj.aname}</h1><br>
	<h1>${obj.lang}</h1><br>
</body>
</html>