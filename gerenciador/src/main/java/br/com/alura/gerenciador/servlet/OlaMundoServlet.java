package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//oi
@WebServlet(urlPatterns = "/oi")
public class OlaMundoServlet extends HttpServlet {

	public OlaMundoServlet() {
		System.out.println("Criando Oi Mundo Servlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Olá mundo, parabens você escreveu o primeiro Servlets.");
		out.println("</body>");
		out.println("</html>");

		System.out.println("O Servlet OiMundoServlet Foi Chamado");

	}

}
