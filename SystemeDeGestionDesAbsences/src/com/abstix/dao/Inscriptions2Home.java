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
 * Home object for domain model class Inscriptions2.
 * @see com.abstix.dao.Inscriptions2
 * @author Hibernate Tools
 */
public class Inscriptions2Home {

	private static final Log log = LogFactory.getLog(Inscriptions2Home.class);

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

	public void persist(Inscriptions2 transientInstance) {
		log.debug("persisting Inscriptions2 instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Inscriptions2 instance) {
		log.debug("attaching dirty Inscriptions2 instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Inscriptions2 instance) {
		log.debug("attaching clean Inscriptions2 instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Inscriptions2 persistentInstance) {
		log.debug("deleting Inscriptions2 instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Inscriptions2 merge(Inscriptions2 detachedInstance) {
		log.debug("merging Inscriptions2 instance");
		try {
			Inscriptions2 result = (Inscriptions2) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Inscriptions2 findById(java.lang.Integer id) {
		log.debug("getting Inscriptions2 instance with id: " + id);
		try {
			Inscriptions2 instance = (Inscriptions2) sessionFactory
					.getCurrentSession()
					.get("com.abstix.dao.Inscriptions2", id);
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

	public List findByExample(Inscriptions2 instance) {
		log.debug("finding Inscriptions2 instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.abstix.dao.Inscriptions2")
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
