package com.abstix.services;

import java.util.List;

import com.abstix.dao.Personnels;


/**
 * Provides processing service to set user authentication session
 * 
 * @author Abdellatif AZZERRIFI LAAMRANI
 */
public interface UserAuthentication {

	/**
	 * Process user authentication
	 * 
	 * @param Personnels
	 * @return
	 */
	Personnels processUserLogin(String id,String pass);
	boolean processUserLogout(Personnels p);
	
	public Personnels getPersonnelById(Integer id);
	public List getPersonnelByIdentifiant(String email);

}
