package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class MostrarEmpresa implements Acao{

	public String  executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.valueOf(request.getParameter("id"));
		Banco banco = new Banco();
		
		Empresa empresa = banco.buscarEmpresa(id); 
		request.setAttribute("empresa", empresa);

		return  "forward:formAtualizarEmpresa.jsp";
		//RequestDispatcher rd = request.getRequestDispatcher("/formAtualizarEmpresa.jsp");
		//rd.forward(request, response);
	}
	
}
