package br.com.mywallet.dao;

import javax.persistence.EntityManager;
import br.com.mywallet.bean.UserBean;
import br.com.mywallet.connection.HibernateConnection;

public class UserDao extends GenericDao<UserBean>{
	
	private static String pl = "\n";

	public UserBean LoginValidate(UserBean login) {
		
		EntityManager em = HibernateConnection.getEntityManager();
		UserBean user = null;
		
		try {
			
			user = (UserBean) em.createQuery(" from UserBean where email='" + login.getEmail() + "' and password='" + login.getPassword() + "'").getResultList().get(0);
			
			return user;
		} catch (Exception e) {
			return null;
		} finally {
			em.close();
		}
		
	}
	
}