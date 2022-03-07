package br.com.rafael.learn.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_course")
public class Course implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String imgUri;
	
	private String imgGrayUri;
	
	@OneToMany(mappedBy = "course")
	private List<Offer> offers = new ArrayList<>();

	public Course(Long id, String name, String imgUri, String imgGrayUri) {
		super();
		this.id = id;
		this.name = name;
		this.imgUri = imgUri;
		this.imgGrayUri = imgGrayUri;
	}
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(id, other.id);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImgUri() {
		return imgUri;
	}

	public void setImgUri(String imgUri) {
		this.imgUri = imgUri;
	}

	public String getImgGrayUri() {
		return imgGrayUri;
	}

	public void setImgGrayUri(String imgGrayUri) {
		this.imgGrayUri = imgGrayUri;
	}

	public List<Offer> getOffers() {
		return offers;
	}
	
	
	
	

}
