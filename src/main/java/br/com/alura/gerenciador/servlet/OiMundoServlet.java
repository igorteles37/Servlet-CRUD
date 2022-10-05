package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//loadOnStartup = 1 - Tomcate já instancia a classe no momento da subida do server
@WebServlet(urlPatterns = "/oi", loadOnStartup = 1)
public class OiMundoServlet extends HttpServlet{
	
	public OiMundoServlet() {
		//System.out.println("Criando Oi Mundo Servlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		 
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("oi mundo, parabéns vc escreveu o primeiro servlet. (PRODUCAO)");
			out.println("</body>");
			out.println("</html>");
			
	}
}
