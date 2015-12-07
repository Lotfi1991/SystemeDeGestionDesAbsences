package com.abstix.controller;


import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.abstix.dao.Personnels;
import com.abstix.dao.PersonnelsHome;
import com.abstix.services.UserAuthentication;



@Controller
public class AuthentificationPersonnel {
	
	@Autowired
	UserAuthentication services;
	@Autowired
	PersonnelsHome services2;
	

	@RequestMapping(value = "/index")
	public String LoginPersonnels(Model model, Personnels p) {
		System.out.println("init:Abdellatif index");
		return "Login";
	}	
	
	
	@RequestMapping(value = "/abs")
	public String ToAbs(Model model, @RequestParam(value = "inputEmail") String id,
			@RequestParam(value = "inputPassword") String pass) {
		System.out.println("init:Abdellatif abs1");
		System.out.println("init:Abdellatif id:"+id);
		Personnels p = services.processUserLogin(id,pass);
		System.out.println("init:Abdellatif abs:"+p.getIdentifiant());
		if(p.getIdentifiant().equals(id)){
			//model.addAttribute("listeEtudiant", p);
			
			model.addAttribute("listep", services2.getAllPersonnels());
			System.out.println("init:Abdellatif abs2");
			return "PageAbsences";
		}
		return "Login";	
				
	}
	

}
