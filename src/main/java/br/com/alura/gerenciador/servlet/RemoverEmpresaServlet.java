package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.domain.Banco;

/**
 * Servlet implementation class RemoverEmpresaServlet
 */
@WebServlet("/removeEmpresa")
public class RemoverEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer id = Integer.valueOf(request.getParameter("id"));
		
		Banco banco = new Banco();
		
		banco.removeEmpresa(id);
					
		
		//RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresasJSTL");
		//rd.forward(request, response);
		
		response.sendRedirect("listaEmpresasJSTL");
		

		
	}

}
