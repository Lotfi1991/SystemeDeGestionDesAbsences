package com.abstix.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abstix.dao.Personnels;



@Controller
public class AuthentificationPersonnel {
	

	public AuthentificationPersonnel() {
		// TODO Auto-generated constructor stub
	}
	
	
	/*
	 * @RequestParam String username,
	 * 
	 * @RequestParam String password,
	 * 
	 */
	@RequestMapping(value = "/index")
	public String LoginPersonnels(Model model, Personnels p) {

		

		return "Login";
	}

}
