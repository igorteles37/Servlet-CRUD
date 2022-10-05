package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.domain.Banco;
import br.com.alura.gerenciador.domain.Empresa;

/**
 * Servlet implementation class ListaEmpresasServlet
 */
@WebServlet("/listaEmpresasJSTL")
public class ListaEmpresasJSTLServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//PrintWriter out = response.getWriter();
		Banco banco = new Banco();
		List<Empresa> listaEmpresas = banco.getEmpresas();
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/listarEmpresasJSTL.jsp");
		request.setAttribute("empresas", listaEmpresas);
		rd.forward(request, response);
		
		/*
		out.println("<html>");
		out.println("<body>");
		out.println("----------------------<br>");
		out.println("Empresas Cadastradas");
		out.println("<ul>");
		 for(Empresa emp : listaEmpresas) { 
			 out.println("<li>" + emp.getNome() + "</li>");
		 }
		out.println("<ul>");
		out.println("</body>");
		out.println("</html>");*/
	}

}
