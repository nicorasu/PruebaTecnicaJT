package com.example.repositories;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.entities.Obra;

@Repository
@Component
public interface ObraRepository extends JpaRepository<Obra, Long> {
	
	@Query("SELECT * FROM obras WHERE id_artista = :artistaId AND pais = 'COLOMBIA'")
	public List<Obra> findByArtista_Id(@Param("artistaId") Long artistaId);
}
