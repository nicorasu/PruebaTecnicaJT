package com.example.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "artistas")
public class Artista {
	
	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "tipo_ide")
	private String tipoIde;
	
	@Column(name = "numero_ide")
	private String numIde;
	
	@Column(name = "nombres")
	private String nombres;
	
	@Column(name = "apellidos")
	private String apellidos;
	
	@OneToMany(mappedBy="artista")
	private List<Obra> obras;
	
	public Artista() {
		
	}

	public Artista(Long id, String tipoIde, String numIde, String nombres, String apellidos, List<Obra> obras) {
		this.id = id;
		this.tipoIde = tipoIde;
		this.numIde = numIde;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.obras = obras;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoIde() {
		return tipoIde;
	}

	public void setTipoIde(String tipoIde) {
		this.tipoIde = tipoIde;
	}

	public String getNumIde() {
		return numIde;
	}

	public void setNumIde(String numIde) {
		this.numIde = numIde;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public List<Obra> getObras() {
		return obras;
	}
	
	public void setObras(List<Obra> obras) {
		this.obras = obras;
	}
}
