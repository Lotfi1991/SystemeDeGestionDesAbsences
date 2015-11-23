package services;

import java.util.List;

import dao.Etudiant;
import dao.Inscriptions2;

public interface EtudiantMetier {
	
	public void addEtudiant(Etudiant e);
	public List<Etudiant> getAllEtudiants();
	public List<Inscriptions2> getAllInsc();
	public Etudiant getEtudiantById(Long id);


}
