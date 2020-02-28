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
				//Abrir sessão
				request.setAttribute("pageName", "Início");
				RequestDispatcher view = request.getRequestDispatcher("index.jsp");
				view.forward(request, response);
			} else {
				request.setAttribute("erro", "Usuário ou senha inválido!");
				RequestDispatcher view = request.getRequestDispatcher("login.jsp");
				view.forward(request, response);
			}
			
		} else if(action.equals(Action.INDEX)) {
			request.setAttribute("pageName", "Início");
			RequestDispatcher view = request.getRequestDispatcher("index.jsp");
			view.forward(request, response);
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/notFound.jsp");
			dispatcher.forward(request, response);
		}
	}
}