package com.example.repositories;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.entities.Museo;

@Repository
@Component 
public interface MuseoRepository extends JpaRepository<Museo, Long> {

	@Query("SELECT * FROM museos WHERE ciudad = :ciudad AND nombre LIKE 'L%'")
	public List<Museo> getMuseosByCiudad(@Param("ciudad") String ciudad);
	
}
