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
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/cadastraEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//PrintWriter out = response.getWriter();
		
		String paraNomeEmpresa = request.getParameter("nome");
		String paraDataEmpresa = request.getParameter("data");
		
		
		Date dataAbertura = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(paraDataEmpresa);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Empresa empresa = new Empresa();
		empresa.setNome(paraNomeEmpresa);
		empresa.setDataAbertura(dataAbertura);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		//List<Empresa> listaEmpresas = banco.getEmpresas();
		
		/*
		out.println("<html>");
		out.println("<body>");
		out.println("Empresa " + empresa.getNome() + " cadastrada com sucesso<br>");
		out.println("<br>----------------------<br>");
		out.println("Empresas Cadastradas");
		out.println("<br>----------------------<br>");
		 for(Empresa emp : listaEmpresas) { 
			 out.println(emp.getNome());
			 out.println("<BR>");
		 }
		out.println("</body>");
		out.println("</html>");*/
		
		
//		//Chamar o JSP
//		
//		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresasJSTL");
//		request.setAttribute("empresa", empresa);
//		rd.forward(request, response);
		
		request.setAttribute("empresa", empresa);
		response.sendRedirect("listaEmpresasJSTL");
		
		
		
	}

}
