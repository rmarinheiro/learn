package br.com.rafael.learn.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.rafael.learn.entities.enums.DeliveryType;

@Entity
@Table(name = "tb_delivery")
public class Delivery implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String uri;
	
	private Instant moment;
	
	private String feedback;
	
	private Integer correctCount;
	
	private DeliveryType deliveryStatus;
	
	@ManyToOne
	@JoinColumn(name = "lesson_id")
	private Lesson lesson;
	
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name = "offer_id"),
		@JoinColumn(name = "user_id")
	})
	private Enrollment enrollment;
	
	public Delivery() {
		// TODO Auto-generated constructor stub
	}
	
	




	public Delivery(Long id, String uri, Instant moment, String feedback, Integer correctCount,
			DeliveryType deliveryStatus, Enrollment enrollment) {
		super();
		this.id = id;
		this.uri = uri;
		this.moment = moment;
		this.feedback = feedback;
		this.correctCount = correctCount;
		this.deliveryStatus = deliveryStatus;
		this.enrollment = enrollment;
	}






	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
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
	
	

}
