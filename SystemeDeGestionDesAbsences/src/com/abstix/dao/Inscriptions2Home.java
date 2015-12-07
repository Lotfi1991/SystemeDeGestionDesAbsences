package com.abstix.dao;

// Generated 23 nov. 2015 11:36:31 by Hibernate Tools 3.4.0.CR1

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;

import com.abstix.util.HibernateUtil;

/**
 * Home object for domain model class Inscriptions2.
 * @see com.abstix.dao.Inscriptions2
 * @author Hibernate Tools
 */
public class Inscriptions2Home {
	
	private static final Log log = LogFactory
			.getLog(Inscriptions2Home.class);

	public Inscriptions2 findById(java.lang.Integer id) {
		log.debug("getting Inscriptions2 instance with id: " + id);
		try {
			Inscriptions2 instance = (Inscriptions2) HibernateUtil.sessionFactory
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
 
	public List getAllInscrit(){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		return session.createQuery("from Personnels").list();
	
	}
	public void init() {
		System.out.println("init:InscriptionsHome");

	}
}
