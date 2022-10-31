package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/entrada")
public class MonitoramentoFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("MonitoramenteFilter");

		long antes = System.currentTimeMillis();

		String acao = request.getParameter("acao");

		// Executa a Ação
		chain.doFilter(request, response);

		long depois = System.currentTimeMillis();
		System.out.println("Tempo De Execução Da Ação " + acao + " -> " + (depois - antes));

	}

}
