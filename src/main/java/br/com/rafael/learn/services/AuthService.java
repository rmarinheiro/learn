package br.com.rafael.learn.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.rafael.learn.entities.User;
import br.com.rafael.learn.repositories.UserRepository;
import br.com.rafael.learn.resources.exceptions.ForbiddenException;
import br.com.rafael.learn.resources.exceptions.UnauthorizedException;

@Service
public class AuthService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Transactional(readOnly = true)
	public User authenticated() {
		try {
			//pega o usuario autenticado
			String username = SecurityContextHolder.getContext().getAuthentication().getName();
			return userRepository.findByEmail(username);
		} catch (Exception e) {
			throw new UnauthorizedException("Invalid user");
		}

		 
	}
	
	public void validateSelfOrAdmin(Long userId) {
		User user = authenticated();
		if(!user.getId().equals(userId) && !user.hasHole("ROLE_ADMIN")) {
			throw new ForbiddenException("Access Denied");
		}
	}

}
