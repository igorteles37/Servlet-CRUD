package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.acoes.AtualizaEmpresa;
import br.com.alura.gerenciador.acoes.CadastraEmpresa;
import br.com.alura.gerenciador.acoes.ListaEmpresas;
import br.com.alura.gerenciador.acoes.MostrarEmpresa;
import br.com.alura.gerenciador.acoes.RemoveEmpresa;


@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paraAcao = request.getParameter("acao");
		
		
		switch (paraAcao) {
		case "listaEmpresas":
			ListaEmpresas acaoListar = new ListaEmpresas();
			acaoListar.executa(request, response);
			break;
		case "mostraEmpresa":
			MostrarEmpresa acaoMostrar = new MostrarEmpresa();
			acaoMostrar.executa(request, response);
			break;
		case "removeEmpresa":
			RemoveEmpresa acaoRemover = new RemoveEmpresa();
			acaoRemover.executa(request, response);
			break;
		case "atualizaEmpresa":
			AtualizaEmpresa acaoAtualizar = new AtualizaEmpresa();
			acaoAtualizar.executa(request, response);
			break;
		case "cadastraEmpresa":
			CadastraEmpresa acaoCadastrar = new CadastraEmpresa();
			acaoCadastrar.executa(request, response);
			break;
		default:
			break;
		}
		

		
	}

}
