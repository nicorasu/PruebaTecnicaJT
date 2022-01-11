package com.example.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "museos")
public class Museo {
	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "pais")
	private String pais;
	
	@Column(name = "ciudad")
	private String ciudad;
	
	@Column(name = "direccion")
	private String direccion;
	
	@OneToMany(mappedBy="museo")
	private List<MuseoObras> museoObras;
	
	public Museo() {
		
	}

	public Museo(Long id, String nombre, String pais, String ciudad, String direccion, List<MuseoObras> museoObras) {
		this.id = id;
		this.nombre = nombre;
		this.pais = pais;
		this.ciudad = ciudad;
		this.direccion = direccion;
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

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<MuseoObras> getMuseoObras() {
		return museoObras;
	}

	public void setMuseoObra(List<MuseoObras> museoObras) {
		this.museoObras = museoObras;
	}	
}
