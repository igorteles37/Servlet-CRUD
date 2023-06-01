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
		Nome: <input type="text"  name="nome" />
		Data Abertura: <input type="text" name=data />
		<input type="hidden" name="acao" value="cadastrarEmpresa" />
		<input type="submit" name="btnSubmter" value="Cadastrar" />
	</form>
</body>
</html>