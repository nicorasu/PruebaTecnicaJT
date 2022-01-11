package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.entities.Obra;
import com.example.repositories.ObraRepository;

@RestController
@Component 
public class ObraController {
	@Autowired
	private ObraRepository obraRepository;
	
	@GetMapping("/obras/{artistaId}")
	public List<Obra> obtenerObrasbyArtistaId(@PathVariable("artistaId") Long id){
		return this.obraRepository.findByArtista_Id(id);
	}
	
}
