package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

/**
 * Servlet implementation class MostraEmpresaServlet
 */
//@WebServlet("/mostraEmpresa")
public class MostraEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			Integer id = Integer.valueOf(request.getParameter("id"));
			Banco banco = new Banco();
			
			Empresa empresa = banco.buscarEmpresa(id); 

			RequestDispatcher rd = request.getRequestDispatcher("/formAtualizarEmpresa.jsp");
			request.setAttribute("empresa", empresa);
			rd.forward(request, response);
			
			
			
			
			
			//Empresa empresa = empresas.
			
	}

}
