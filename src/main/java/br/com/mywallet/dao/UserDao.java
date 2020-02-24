package br.com.mywallet.dao;

import javax.persistence.EntityManager;
import br.com.mywallet.bean.UserBean;
import br.com.startup.workcontrol.factory.ConnectionFactory;
import br.com.startup.workcontrol.model.dao.GenericDao;

public class UserDao extends GenericDao<UserBean>{
	
	private static String pl = "\n";

	public UserBean LoginValidate(UserBean login) {
		
		EntityManager em = new ConnectionFactory().getConnection();
		UserBean user = null;
		
		try {
			
			user = (UserBean) em.createQuery("select u from user u where email = :email and password = :password")
					.setParameter("email", login.getEmail()).setParameter("password", login.getPassword()).getSingleResult();
			
			return user;
		} catch (Exception e) {
			return null;
		} finally {
			em.close();
		}
		
	}
	
}