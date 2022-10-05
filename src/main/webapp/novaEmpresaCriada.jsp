<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<html>
	<body>
	
			<c:if test="${empresa ne null}">
				<c:if test="${not empty empresa.nome}">
					Empresa ${empresa.getNome()}  cadastrada com sucesso!
				</c:if>
			</c:if>
			<c:if test="${empresa eq null}">
				Acesso a página inválido
			</c:if>
	</body>
</html>