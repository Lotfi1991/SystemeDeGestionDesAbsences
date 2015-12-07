package com.abstix.dao;

// Generated 23 nov. 2015 11:36:31 by Hibernate Tools 3.4.0.CR1

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Example;

import com.abstix.util.HibernateUtil;

/**
 * Home object for domain model class Personnels.
 * @see com.abstix.dao.Personnels
 * @author Hibernate Tools
 */
public class PersonnelsHome {

	private static final Log log = LogFactory.getLog(PersonnelsHome.class);

	public Personnels findById(java.lang.Integer id) {
		log.debug("getting Personnels instance with id: " + id);
		try {
			Personnels instance = (Personnels) HibernateUtil.sessionFactory
					.getCurrentSession().get("com.abstix.dao.Personnels", id);
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

	public List findByExample(Personnels instance) {
		log.debug("finding Personnels instance by example");
		try {
			List results = HibernateUtil.sessionFactory.getCurrentSession()
					.createCriteria("com.abstix.dao.Personnels")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
	
	public Personnels autorisationDeConnexion(String id,String pass){
	
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query q = session.createQuery("FROM Personnels WHERE identifiant = '"+id+"'");
		//q.setParameter("email", email);
		
		List<Personnels> r = q.list();
		if(r.size()!=0){
			Personnels p2 = (Personnels) r.get(0);	
			if(p2.getIdentifiant().equals(id)&&p2.getPass().equals(pass)) 
				return p2;
		}
			
		
		Personnels p = new Personnels();
		p.setIdentifiant("ert");
		return p;	
		
	}
	
	public List getByIdantifiant(String email){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query q = session.createQuery("FROM Personnels WHERE identifiant = '"+email+"'");
		//q.setParameter("email", email);
		
		List<Personnels> r = q.list();
		if(r.size()!=0)
			return r;
		
		Personnels p = new Personnels();
		p.setIdentifiant(null);
		r.add(p);
		return r;	
	
	}
	
	public List<Personnels> getAllPersonnels(){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		return session.createQuery("from Personnels").list();
	
	}
	public void init() {
		System.out.println("init:PersonnelsHome");

	}
}
