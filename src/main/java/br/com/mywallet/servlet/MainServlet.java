package br.com.mywallet.servlet;

import java.io.IOException;

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
				System.out.println("Allowed Access! Welcome.");
			} else {
				System.out.println("Denied Access! Verify your credencials");
			}
			
		} else {
			System.out.println("Rota inválida!");
		}
	}
}