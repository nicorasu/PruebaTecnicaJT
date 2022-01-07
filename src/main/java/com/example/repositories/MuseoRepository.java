package com.example.repositories;

import java.util.ArrayList;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.entities.Museo;

public interface MuseoRepository extends JpaRepository<Museo, Long> {

	@Query("SELECT * FROM artistas WHERE ciudad = :ciudad AND nombre LIKE '%L'")
	public ArrayList<Museo> getMuseosByCiudadInicialL(@Param("ciudad") String ciudad);
	
}
