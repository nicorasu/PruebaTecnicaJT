package com.example.repositories;

import java.util.ArrayList;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.entities.Obra;

public interface ObraRepository extends JpaRepository<Obra, Long> {
	
	@Query("SELECT * FROM obras WHERE id_artista = :artistaId AND pais = COLOMBIA")
	public ArrayList<Obra> getObrasByArtista(@Param("artistaId") Long artistaId);
}
