package com.abstix.services;

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
	boolean processUserLogin(Personnels p);
	boolean processUserLogout(Personnels p);
	
	public Personnels getPersonnelById(Integer id);

}
