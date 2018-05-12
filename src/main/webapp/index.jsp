<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>start page</title>
</head>

<body>
	<h1>Hello darkness my old friend!</h1>
		<form method="post" name="userDto" action="http://localhost:8080/mvc">
		    <input name="username"/>
		    <input name="password"/>
		    <input type="submit"/>
		</form>
</body>

</html>