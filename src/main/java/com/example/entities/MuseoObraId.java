package com.example.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class MuseoObraId {
	
	@Column(name = "id_obra")
	private Long obraId;
	
	@Column(name = "id_museo")
	private Long museoId;
	

	public MuseoObraId() {
		
	}

	public MuseoObraId(Long obraId, Long museoId) {
		this.obraId = obraId;
		this.museoId = museoId;
	}

	public Long getObraId() {
		return obraId;
	}

	public void setObraId(Long obraId) {
		this.obraId = obraId;
	}

	public Long getMuseoId() {
		return museoId;
	}

	public void setMuseoId(Long museoId) {
		this.museoId = museoId;
	}
	
	

}
