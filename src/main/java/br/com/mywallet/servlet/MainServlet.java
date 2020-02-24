package br.com.mywallet.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.mywallet.action.Action;
import br.com.mywallet.bo.LoginBo;

public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MainServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doExecute(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doExecute(request, response);
	}

	protected void doExecute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter(Action.actionVar);
		
		if(action.equals(Action.LOGIN)) {
			
			String[] login = new String[2];
			login[0] = request.getParameter("email");
			login[1] = request.getParameter("password");
			
			LoginBo loginBo = new LoginBo();
			
			Boolean allowAcess = loginBo.loginValidate(login);
			
			if(allowAcess) {
				RequestDispatcher view = request.getRequestDispatcher("/index.jsp");
				view.forward(request, response);
			} else {
				
				//https://cursos.alura.com.br/forum/topico-request-nao-esta-enviando-o-atributo-80977
				
				
				
				request.setAttribute("teste1", "ruela");
				
				RequestDispatcher view = request.getRequestDispatcher("login.jsp");
				System.out.println(request.getParameter("teste1"));
				view.forward(request, response);
			}
			
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/notFound.jsp");
			dispatcher.forward(request, response);
		}
	}
}