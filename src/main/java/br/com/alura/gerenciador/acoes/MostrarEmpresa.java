package br.com.alura.gerenciador.acoes;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class MostrarEmpresa {

	public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.valueOf(request.getParameter("id"));
		Banco banco = new Banco();
		
		Empresa empresa = banco.buscarEmpresa(id); 

		RequestDispatcher rd = request.getRequestDispatcher("/formAtualizarEmpresa.jsp");
		request.setAttribute("empresa", empresa);
		rd.forward(request, response);
	}
	
}
