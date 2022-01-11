package com.example.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "obras")
public class Obra {
	
	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "pais")
	private String pais;
	
	@ManyToOne 
	@JoinColumn(name = "id_artista") 
	private Artista artista;
	
	@OneToMany(mappedBy="obra")
	private List<MuseoObras> museoObras;
	
	public Obra () {
		
	}

	public Obra(Long id, String nombre, String pais, Artista artista, List<MuseoObras> museoObras) {
		this.id = id;
		this.nombre = nombre;
		this.pais = pais;
		this.artista = artista;
		this.museoObras = museoObras;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}

	public List<MuseoObras> getMuseoObras() {
		return museoObras;
	}

	public void setMuseoObras(List<MuseoObras> museoObras) {
		this.museoObras = museoObras;
	}
	
	
	
}
