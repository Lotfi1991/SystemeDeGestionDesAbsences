package services;

import java.util.List;

import dao.Etudiant;
import dao.Inscriptions2;
import dao.Personnels;


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
	boolean processUserAuthentication(Personnels p);
	
	public Personnels getPersonnelById(Integer id);

}
