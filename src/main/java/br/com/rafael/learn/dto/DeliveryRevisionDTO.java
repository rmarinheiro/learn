package br.com.rafael.learn.dto;

import java.io.Serializable;

import br.com.rafael.learn.entities.enums.DeliveryType;

public class DeliveryRevisionDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String feedback;

	private Integer correctCount;

	private DeliveryType deliveryStatus;
	
	public DeliveryRevisionDTO() {
		// TODO Auto-generated constructor stub
	}
	
	

	public DeliveryRevisionDTO(String feedback, Integer correctCount, DeliveryType deliveryStatus) {
		super();
		this.feedback = feedback;
		this.correctCount = correctCount;
		this.deliveryStatus = deliveryStatus;
	}



	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public Integer getCorrectCount() {
		return correctCount;
	}

	public void setCorrectCount(Integer correctCount) {
		this.correctCount = correctCount;
	}

	public DeliveryType getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(DeliveryType deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	
	

}
