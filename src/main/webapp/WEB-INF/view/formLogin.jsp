<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:url value="/entrada" var="linkServletNovaEmpresa" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Atualizar Empresa</title>
</head>
<body>
	<form action="${linkServletNovaEmpresa}" method="post">
		Login: <input type="text"  name="login" /><br><br>
		Senha: <input type="password" name="senha" /><br><br>
		<input type="hidden" name="acao" value="Login" />
		<input type="submit" name="btnSubmter" value="Entrar" />
	</form>
	<br>
	<b>${mensagem}</b>
	
</body>
</html>