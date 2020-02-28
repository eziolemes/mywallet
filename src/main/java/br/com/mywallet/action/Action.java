package br.com.mywallet.action;

public class Action {
	
	private static String servlet = "MainServlet";
	public static String actionVar = "action";
	
	public static String LOGIN = "login";
	public static String LOGOUT= "logout";
	public static String INDEX = "index";
	
	public static String LOGIN_ROUTE = servlet + "?" + actionVar + "=" + LOGIN;
	public static String INDEX_ROUTE = servlet + "?" + actionVar + "=" + INDEX;
}