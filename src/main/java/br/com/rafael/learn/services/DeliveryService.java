package br.com.rafael.learn.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.rafael.learn.dto.DeliveryRevisionDTO;
import br.com.rafael.learn.entities.Delivery;
import br.com.rafael.learn.repositories.DeliveryRepository;

@Service
public class DeliveryService {
	
	@Autowired
	private DeliveryRepository deliveryRepository;
	
	@Transactional
	public void saveRevision(Long id,DeliveryRevisionDTO dto) {
		Delivery delivery = deliveryRepository.findById(id).get();
		delivery.setDeliveryStatus(dto.getDeliveryStatus());
		delivery.setFeedback(dto.getFeedback());
		delivery.setCorrectCount(dto.getCorrectCount());
		deliveryRepository.save(delivery);
	}

}
