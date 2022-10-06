package br.com.alura.gerenciador.acoes;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class ListaEmpresas {
	
	
	public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Banco banco = new Banco();
		List<Empresa> listaEmpresas = banco.getEmpresas();
		
		request.setAttribute("empresas", listaEmpresas);
		
		RequestDispatcher rd = request.getRequestDispatcher("/listarEmpresas.jsp");
		
		rd.forward(request, response);
	}
	
	

}
