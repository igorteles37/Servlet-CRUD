<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="br.com.alura.gerenciador.domain.Empresa"%>
<%
	//scriptlet	
	List<Empresa> empresas = (List<Empresa>) request.getAttribute("empresas");

%>


<html>

<body>
	Lista de empresas
	<br>
	-----------------------
	<ul>
	<%
		for(Empresa emp : empresas) { 
	%> 
			 <li><%=emp.getNome()%></li>
	<%
		}
	%>
	</ul>
</body>

</html>
