package br.com.rafael.learn.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.rafael.learn.entities.enums.ResourceType;

@Entity
@Table(name = "tb_resource")
public class Resource implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String title;
	
	private String description;
	
	private Integer position;
	
	private String imgUri;
	
	private ResourceType type;
	
	@OneToMany(mappedBy = "resource")
	private List<Section> sections = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name = "offer_id")
	private Offer offer;

	public Resource(Long id, String title, String description, Integer position, String imgUri, ResourceType type,
			Offer offer) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.position = position;
		this.imgUri = imgUri;
		this.type = type;
		this.offer = offer;
	}
	
	public Resource() {
		// TODO Auto-generated constructor stub
	}

	public Resource(Long id) {
		super();
		this.id = id;
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
		Resource other = (Resource) obj;
		return Objects.equals(id, other.id);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public String getImgUri() {
		return imgUri;
	}

	public void setImgUri(String imgUri) {
		this.imgUri = imgUri;
	}

	public ResourceType getType() {
		return type;
	}

	public void setType(ResourceType type) {
		this.type = type;
	}

	public Offer getOffer() {
		return offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}
	
	
	
	
	
	
	

}
