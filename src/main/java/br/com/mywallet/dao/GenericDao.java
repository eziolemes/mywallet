package br.com.mywallet.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.mywallet.bean.BaseEntity;
import br.com.mywallet.connection.HibernateConnection;

public class GenericDao<T extends BaseEntity> {
	
	public T save(T t) {
		EntityManager em = HibernateConnection.getEntityManager();
		try {
			
			em.getTransaction().begin();
			
			if(t.getId() == null) {
				em.persist(t);
			} else {
				em.merge(t);
			}
			
			em.getTransaction().commit();
		} catch (Exception e) {
			System.err.println();
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
		
		return t;
	}
	
	// Verificar com o projeto hibernate qual a melhor opção
	
	public T findById(Class<T> clazz, Integer id) {
		EntityManager em = HibernateConnection.getEntityManager();
		T t = null;
		
		try {
			
			t = em.find(clazz, id);
			
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			em.close();
		}
		
		return t;
	}
	
	public List<T> findAll(String table) {
		System.out.println("entrou no m�todo findAll do genericDao");
		EntityManager em = HibernateConnection.getEntityManager();
		List<T> produtos = null;
		
		try {
			
			produtos = em.createQuery("from " + table + " t").getResultList();
			
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			em.close();
		}
		
		return produtos;
	}
	
	public T remove(Class<T> clazz, Integer id) {
		EntityManager em = HibernateConnection.getEntityManager();
		T t = null;
		
		try {
			
			t = em.find(clazz, id);
			em.getTransaction().begin();
			em.remove(t);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			System.err.println(e);
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
		
		return t;
	}

}