package com.abstix.services;

import java.util.List;

import com.abstix.dao.Inscriptions2;

public interface EtudiantMetier {
	
	public List<Inscriptions2> getAllEtudiants();
	public List<Inscriptions2> getEtuByFiliere(String filiere);
	public Inscriptions2 getEtudiantById(Long id);
	public Inscriptions2 getEtudiantByName(String name);
	
	//Ajouter l'absence dans la base des données
	public boolean AddAbsenceByName(String name);
	
	//Vérifier si les absences sont bien entrée avant d'afficher le PopUp
	public boolean GoToPopUp();

	


}
