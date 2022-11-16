<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>

	<form action="addAlien"  method="post">
	Enter id : <input type="number" name="id"> <br>
	Enter name : <input type="text" name="name"> <br>
	<input type="submit">
	</form>
	<hr>
	<form action="getAlien" method="get">
	Enter id : <input type="number" name="id"> <br>
	<input type="submit">
	</form>
	<hr>
	<form action="getAlienByName" method="get">
	Enter name : <input type="text" name="name"> <br>
	<input type="submit">
	</form>
	
</body>
</html>
