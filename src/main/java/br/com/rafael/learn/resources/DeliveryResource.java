package br.com.rafael.learn.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rafael.learn.dto.DeliveryRevisionDTO;
import br.com.rafael.learn.services.DeliveryService;

@RestController
@RequestMapping(value = "/deliveries")
public class DeliveryResource {
	
	@Autowired
	private DeliveryService deliveryService;
	
	@PreAuthorize("hasAnyRole('ADMIN','INSTRUCTOR')")
	@PutMapping(value = "/{id}")
	public ResponseEntity<Void> update(@PathVariable Long id, @RequestBody DeliveryRevisionDTO deliveryDto){
		 deliveryService.saveRevision(id, deliveryDto);
		 return ResponseEntity.noContent().build();
		
	}

}
