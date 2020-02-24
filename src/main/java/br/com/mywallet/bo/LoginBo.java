package br.com.mywallet.bo;

import br.com.mywallet.bean.UserBean;
import br.com.mywallet.dao.UserDao;

public class LoginBo {
	
	public Boolean loginValidate(String[] args) {
		
		UserBean login = new UserBean();
		login.setEmail(args[0]);
		login.setPassword(args[1]);
		
		UserDao dao = new UserDao();
		UserBean user = dao.LoginValidate(login);
		
		if (user == null) {
			return false;
		} else {
			//todo: open session
			return true;
		}
		
	}

}