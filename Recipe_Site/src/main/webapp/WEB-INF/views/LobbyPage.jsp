<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<link href="./resources/css/bootstrap.min.css" rel="stylesheet">
<meta charset="EUC-KR">
<title>������ ����Ʈ</title>
</head>
<body>
	<nav class="navbar navbar-expand navbar-dark bg-dark">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="./Lobby">Lobby</a>
			</div>
		</div>
	</nav>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">${greeting}</h1>
		</div>
	</div>
	<div class="container">
		<div class="text-center">
			<h3>${strapline}</h3>
		</div>
	</div>
	<footer class="continer">
		<hr>
		<p> &copy; RecipeSite </p>
	</footer>
	
</body>
</html>