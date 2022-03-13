package br.com.rafael.learn.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.rafael.learn.dto.NotificationDTO;
import br.com.rafael.learn.entities.Notification;
import br.com.rafael.learn.entities.User;
import br.com.rafael.learn.repositories.NotificationRepository;

@Service
public class NotificationService {
	
	@Autowired
	private NotificationRepository notificationRepository;
	
	@Autowired
	private AuthService authService;
	
	@Transactional(readOnly = true)
	public Page<NotificationDTO> notificationsForCurrentUser(Pageable pageable){
		User user = authService.authenticated();
		Page<Notification> page = notificationRepository.findByUser(user, pageable);
		return page.map(x -> new NotificationDTO(x));
	}

}
