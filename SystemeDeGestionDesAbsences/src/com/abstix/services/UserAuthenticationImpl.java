package com.abstix.services;

import java.util.List;

import org.springframework.security.authentication.AuthenticationManager;

import com.abstix.dao.Personnels;
import com.abstix.dao.PersonnelsHome;

public class UserAuthenticationImpl implements UserAuthentication {
	
	private PersonnelsHome dao;
	//private AuthenticationManager authenticationManager;


	@Override
	public Personnels processUserLogin(String id,String pass) {	
		return dao.autorisationDeConnexion(id,pass);
	}



	@Override
	public boolean processUserLogout(Personnels p) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public Personnels getPersonnelById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List getPersonnelByIdentifiant(String email) {
		// TODO Auto-generated method stub
		return dao.getByIdantifiant(email);
	}



	public PersonnelsHome getDao() {
		return dao;
	}



	public void setDao(PersonnelsHome dao) {
		this.dao = dao;
	}

}
