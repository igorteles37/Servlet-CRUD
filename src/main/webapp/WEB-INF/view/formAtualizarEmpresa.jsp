<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:url value="/entrada" var="linkEntradaServlet" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Atualizar Empresa</title>
</head>
<body>
	<form action="${linkEntradaServlet}" method="post">
		Nome: <input type="text" value="${empresa.nome}" name="nome" />
		Data Abertura: <input value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" />" type="text" name=data />
		<input type="hidden" name="id" value="${empresa.id}" />
		<input type="hidden" name="acao" value="atualizaEmpresa" />
		<input type="submit" name="btnSubmter" value="Atualizar" />
	</form>
</body>
</html>