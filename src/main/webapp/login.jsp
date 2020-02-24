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
	
	<%@ page import="br.com.mywallet.action.*" %>

		<div class="login-page">
		<!-- <center><h3></h3></center><br /> -->
		<center><h1>My Wallet</h1></center>
			<div class="form">
				<form action="<%= Action.LOGIN_ROUTE %>" method="post" class="login-form">
					E-mail: <input type="text" id="email" name="email"> <br>
					Senha: <input type="password" id="password" name="password"> <br>
					<button type="submit" value="Logar">Logar</button>
				</form>
			</div>
			<!-- <center><h3>Formação Java Web</h3></center> -->
		</div>

	</body>
</html>