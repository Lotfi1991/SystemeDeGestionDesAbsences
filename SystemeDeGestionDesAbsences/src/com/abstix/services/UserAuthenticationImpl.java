package com.abstix.services;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import com.abstix.dao.Personnels;
import com.abstix.dao.PersonnelsHome;

public class UserAuthenticationImpl implements UserAuthentication {
	
	private PersonnelsHome dao;
	private AuthenticationManager authenticationManager;


	@Override
	public boolean processUserLogin(Personnels p) {
		// TODO Auto-generated method stub
		return false;
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

}
