package services;

import java.util.List;

import dao.Etudiant;
import dao.EtudiantDAO;
import dao.Inscriptions2;


public class EtudiantImplMetier implements EtudiantMetier {
	
	private EtudiantDAO dao;
	
	public void addEtudiant(Etudiant e) {
		dao.addEtudiant(e);
	}

	public List<Etudiant> getAllEtudiants() {
		return dao.getAllEtudiants();
	}
	public List<Inscriptions2> getAllInsc() {
		return dao.getAllInsc();
	}

	public Etudiant getEtudiantById(Long id) {
		return dao.getEtudiant(id);
	}

	public void setDao(EtudiantDAO dao) {
		this.dao = dao;
	}
}