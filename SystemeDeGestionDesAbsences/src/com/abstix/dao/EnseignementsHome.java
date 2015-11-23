package com.abstix.dao;

// Generated 23 nov. 2015 11:36:31 by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Enseignements.
 * @see com.abstix.dao.Enseignements
 * @author Hibernate Tools
 */
public class EnseignementsHome {

	private static final Log log = LogFactory.getLog(EnseignementsHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext()
					.lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Enseignements transientInstance) {
		log.debug("persisting Enseignements instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Enseignements instance) {
		log.debug("attaching dirty Enseignements instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Enseignements instance) {
		log.debug("attaching clean Enseignements instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Enseignements persistentInstance) {
		log.debug("deleting Enseignements instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Enseignements merge(Enseignements detachedInstance) {
		log.debug("merging Enseignements instance");
		try {
			Enseignements result = (Enseignements) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Enseignements findById(java.lang.Short id) {
		log.debug("getting Enseignements instance with id: " + id);
		try {
			Enseignements instance = (Enseignements) sessionFactory
					.getCurrentSession()
					.get("com.abstix.dao.Enseignements", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Enseignements instance) {
		log.debug("finding Enseignements instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.abstix.dao.Enseignements")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
