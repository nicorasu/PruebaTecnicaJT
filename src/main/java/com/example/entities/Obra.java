package com.example.entities;

import java.util.ArrayList;

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
	
	@OneToMany(mappedBy="obras")
	private ArrayList<MuseoObra> museoObra;
	
	public Obra () {
		
	}

	public Obra(Long id, String nombre, String pais, Artista artista, ArrayList<MuseoObra> museoObra) {
		this.id = id;
		this.nombre = nombre;
		this.pais = pais;
		this.artista = artista;
		this.museoObra = museoObra;
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

	public ArrayList<MuseoObra> getMuseoObra() {
		return museoObra;
	}

	public void setMuseoObra(ArrayList<MuseoObra> museoObra) {
		this.museoObra = museoObra;
	}
	
	
	
}
