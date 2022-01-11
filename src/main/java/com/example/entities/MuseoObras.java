package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "museos_x_obras")
public class MuseoObras {
	
	@Id
	Long id;
	
	@ManyToOne 
	@JoinColumn(name = "id_museo") 
	private Museo museo;
	
	@ManyToOne 
	@JoinColumn(name = "id_obra") 
	private Obra obra;	
	
	public MuseoObras() {
		
	}

	public MuseoObras(Museo museo, Obra obra) {
		this.museo = museo;
		this.obra = obra;
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
