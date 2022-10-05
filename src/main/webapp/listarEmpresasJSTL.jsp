<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="br.com.alura.gerenciador.domain.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>



<html>
<head>
 <c:set var="codigo" value="1"/>
 <c:url value="/formNovaEmpresa.jsp" var="linkPaginaFormNovaEmpresa" />
 <c:url value="/mostraEmpresa" var="linkServletMostrarEmpresa" />
 <c:url value="/removeEmpresa" var="linkServletRemoverEmpresa" />
 
</head>
<body>
	<c:if test="${empresa ne null}">
		<c:if test="${not empty empresa.nome}">
			Empresa ${empresa.getNome()}  cadastrada com sucesso!
		</c:if>
	</c:if>
	<br>
	<hr>
	<b>
	Lista de empresas COM JSTL
	</b>
	<ul>
		<c:forEach items="${empresas}" var="empresa">
				
				<li>
					${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" />
					<a href="${linkServletMostrarEmpresa}?id=${empresa.id}">edita</a>
					<a href="${linkServletRemoverEmpresa}?id=${empresa.id}">remove</a>
				</li>
		</c:forEach>
	</ul>
	<a href="${linkPaginaFormNovaEmpresa}">Cadastrar</a>
	
	
</body>

</html>
