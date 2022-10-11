package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

/**
 * Servlet implementation class AtualizaEmpresaServlet
 */
//@WebServlet("/atualizaEmpresa")
public class AtualizaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer id = Integer.valueOf(request.getParameter("id"));
		String nome  = request.getParameter("nome");
		String paraDataAbertura = request.getParameter("data");
		
		
		Date dataAbertura = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(paraDataAbertura);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		
		Banco banco = new Banco();
		Empresa empresaEscolhida = banco.buscarEmpresa(id);
		empresaEscolhida.setNome(nome);
		empresaEscolhida.setDataAbertura(dataAbertura);
		
		/*
		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresasJSTL");
		rd.forward(request, response);*/
		response.sendRedirect("listaEmpresasJSTL");
		
	}

}
