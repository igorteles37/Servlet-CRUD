package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.acoes.AtualizaEmpresa;
import br.com.alura.gerenciador.acoes.CadastraEmpresa;
import br.com.alura.gerenciador.acoes.ListaEmpresas;
import br.com.alura.gerenciador.acoes.MostrarEmpresa;
import br.com.alura.gerenciador.acoes.NovaEmpresaForm;
import br.com.alura.gerenciador.acoes.RemoveEmpresa;


@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paraAcao = request.getParameter("acao");
		String nome = null;
		
		switch (paraAcao) {
		case "listaEmpresas":
			ListaEmpresas acaoListar = new ListaEmpresas();
			nome = acaoListar.executa(request, response);
			break;
		case "mostraEmpresa":
			MostrarEmpresa acaoMostrar = new MostrarEmpresa();
			nome = acaoMostrar.executa(request, response);
			break;
		case "removeEmpresa":
			RemoveEmpresa acaoRemover = new RemoveEmpresa();
			nome = acaoRemover.executa(request, response);
			break;
		case "atualizaEmpresa":
			AtualizaEmpresa acaoAtualizar = new AtualizaEmpresa();
			nome = acaoAtualizar.executa(request, response);
			break;
		case "cadastrarEmpresa":
			CadastraEmpresa acaoCadastrar = new CadastraEmpresa();
			nome = acaoCadastrar.executa(request, response);
			break;
		case "cadastrarEmpresaForm":
			NovaEmpresaForm novaEmpresaForm = new NovaEmpresaForm();
			nome = novaEmpresaForm.executa(request, response);
			break;
		default:
			break;
		}
		
		String[] tipoRedirecionamento = nome.split(":");
		
		if(tipoRedirecionamento[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + tipoRedirecionamento[1]);
			rd.forward(request, response);
		}
		else {
			response.sendRedirect(tipoRedirecionamento[1]);
		}
		
	}

}
