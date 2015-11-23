package services;

import javax.naming.AuthenticationException;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import dao.Personnels;
import dao.PersonnelsDAO;

public class UserAuthenticationImpl implements UserAuthentication {
	
	private PersonnelsDAO dao;
	private AuthenticationManager authenticationManager;


	@Override
	public boolean processUserAuthentication(Personnels p) {
		Authentication request = new UsernamePasswordAuthenticationToken(p.getId(), p.getPass());
		Authentication result = authenticationManager.authenticate(request);
		SecurityContextHolder.getContext().setAuthentication(result);
		
		return true;
	}

	@Override
	public Personnels getPersonnelById(Integer id) {	
		return dao.findById(id);
	}



	public void setDao(PersonnelsDAO dao) {
		this.dao = dao;
	}



	public void setAuthenticationManager(AuthenticationManager authenticationManager) {
		this.authenticationManager = authenticationManager;
	}

}
