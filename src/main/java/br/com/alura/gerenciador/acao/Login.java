package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Usuario;

public class Login implements Acao {
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String login = request.getParameter("login");
		String senha = request.getParameter("senha");

		Banco banco = new Banco();

		Usuario usuario = banco.existeUsuaio(login, senha);
		HttpSession sessao = request.getSession();

		if (usuario != null) {
			sessao.setAttribute("usuarioLogado", usuario);
			sessao.setAttribute("mensagem", "");
			return "redirect:entrada?acao=ListaEmpresas";
		} else {
			sessao.setAttribute("mensagem", "Login Inválido");
			return "redirect:entrada?acao=LoginForm";
		}

	}
}
