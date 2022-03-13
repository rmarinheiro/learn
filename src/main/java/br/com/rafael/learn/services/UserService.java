package br.com.rafael.learn.services;

import java.util.Optional;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.rafael.learn.dto.UserDTO;
import br.com.rafael.learn.entities.User;
import br.com.rafael.learn.repositories.UserRepository;
import br.com.rafael.learn.resources.exceptions.EntityResourceNotFoundException;

@Service
public class UserService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AuthService authService; 
	
	private static Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Transactional(readOnly = true)
	public UserDTO findById(Long id) {
		
		authService.validateSelfOrAdmin(id);
		Optional<User> obj =  userRepository.findById(id);
		User entity = obj.orElseThrow(()-> new EntityResourceNotFoundException("Objeto não encontrado"));
		return new UserDTO(entity);
	}
	
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user= userRepository.findByEmail(username);
		if(user == null) {
			logger.error("User not found: " + username);
			throw new UsernameNotFoundException("Email não encontrado");
		}
		logger.info("User found: " + username);
		return user;
	}


}
