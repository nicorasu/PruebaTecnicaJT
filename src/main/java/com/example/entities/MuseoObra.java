package com.example.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "museos_x_obras")
public class MuseoObra {
	
	@EmbeddedId
	MuseoObraId id;
	
	@ManyToOne 
	@JoinColumn(name = "id_museo") 
	private Museo museo;
	
	@ManyToOne 
	@JoinColumn(name = "id_obra") 
	private Obra obra;	
	
	public MuseoObra() {
		
	}

	public MuseoObra(MuseoObraId id, Museo museo, Obra obra) {
		this.id = id;
		this.museo = museo;
		this.obra = obra;
	}

	public MuseoObraId getId() {
		return id;
	}

	public void setId(MuseoObraId id) {
		this.id = id;
	}

	public Museo getMuseo() {
		return museo;
	}

	public void setMuseo(Museo museo) {
		this.museo = museo;
	}

	public Obra getObra() {
		return obra;
	}

	public void setObra(Obra obra) {
		this.obra = obra;
	}
	
	

}
