package com.example.controllers;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.entities.Obra;
import com.example.repositories.ObraRepository;

@RestController
public class ObraController {
	private ObraRepository obraRepository;

	public ObraController(ObraRepository obraRepository) {
		this.obraRepository = obraRepository;
	}
	
	@GetMapping("/obras/{artistaId}")
	ArrayList<Obra> obtenerObrasbyArtistaId(@PathVariable Long id){
		return this.obraRepository.getObrasByArtista(id);
	}
	
	
}
