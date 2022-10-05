<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:url value="/atualizaEmpresa" var="linkServletAtualizarEmpresa" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Atualizar Empresa</title>
</head>
<body>
	<form action="${linkServletAtualizarEmpresa}" method="post">
		Nome: <input type="text" value="${empresa.nome}" name="nome" />
		Data Abertura: <input value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" />" type="text" name=data />
		<input type="hidden" name="id" value="${empresa.id}" />
		<input type="submit" name="btnSubmter" value="Atualizar" />
	</form>
</body>
</html>