package br.com.mywallet.bo;

import br.com.mywallet.bean.UserBean;

public class LoginBo {
	
	public Boolean loginValidate(String[] args) {
		
		UserBean user = new UserBean();
		user.setNome(args[0]);
		user.setSenha(args[1]);
		
		return true;
	}

}