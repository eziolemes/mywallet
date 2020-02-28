package br.com.mywallet.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateConnection {

	public static EntityManagerFactory factory = null;
	
	static {
		init();
	}
	
	private static void init() {
		try {
			// ler o arquivo de xml apenas uma vez durante a execução
			if(factory == null) {
				factory = Persistence.createEntityManagerFactory("meuPU");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
	
	/**
	 * Identifica e retorna a chave primária da entidade
	 * informada
	 */
	public static Object getPrimaryKey(Object entity) {
		return factory.getPersistenceUnitUtil().getIdentifier(entity);
	}
}