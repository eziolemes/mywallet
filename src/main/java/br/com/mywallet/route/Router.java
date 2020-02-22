package br.com.mywallet.route;

public class Router {
	private RouteEnum route;
	
	public void runRouter() {
		switch (route) {
		case LOGIN:
			System.out.println("Login");
			break;
		case LOGOUT:
			System.out.println("Logout");
			break;
		default:
			System.out.println("Não encontrado");
			break;
		}
	}
	
	public void setRoute(RouteEnum route) {
		this.route = route;
	}
	
}