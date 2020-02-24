package br.com.mywallet.action;

public class Action {
	
	private static String servlet = "MainServlet";
	public static String actionVar = "action";
	
	public static String LOGIN = "login";
	public static String LOGOUT= servlet + "?" + actionVar + "=logout";
	public static String INDEX = servlet + "?" + actionVar + "=index";
	
	public static String LOGIN_ROUTE = servlet + "?" + actionVar + "=" + LOGIN;
}