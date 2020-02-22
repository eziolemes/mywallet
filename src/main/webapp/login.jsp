<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Login</title>
		<link rel="stylesheet" href="resources/css/estilo.css">
	</head>
	<body>

		<div class="login-page">
		<!-- <center><h3></h3></center><br /> -->
		<center><h1>My Wallet</h1></center>
			<div class="form">
				<form action="LoginServlet" method="post" class="login-form">
					Login: <input type="text" id="login" name="login"> <br>
					Senha: <input type="password" id="senha" name="senha"> <br>
					<button type="submit" value="Logar">Logar</button>
				</form>
			</div>
			<!-- <center><h3>Formação Java Web</h3></center> -->
		</div>

	</body>
</html>