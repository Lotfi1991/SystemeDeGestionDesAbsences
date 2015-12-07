package com.abstix.services;

import java.util.List;

import com.abstix.dao.Inscriptions2;
import com.abstix.dao.Inscriptions2Home;


public class EtudiantImplMetier implements EtudiantMetier {
	
	private Inscriptions2Home dao;

	@Override
	public List<Inscriptions2> getAllEtudiants() {
		
		return dao.getAllInscrit();
	}

	@Override
	public List<Inscriptions2> getEtuByFiliere(String filiere) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Inscriptions2 getEtudiantById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Inscriptions2 getEtudiantByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean AddAbsenceByName(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean GoToPopUp() {
		// TODO Auto-generated method stub
		return false;
	}

	public Inscriptions2Home getDao() {
		return dao;
	}

	public void setDao(Inscriptions2Home dao) {
		this.dao = dao;
	}


	
	
}