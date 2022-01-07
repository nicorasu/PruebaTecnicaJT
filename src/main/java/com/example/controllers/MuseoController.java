package com.example.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Museo;
import com.example.repositories.MuseoRepository;

@RestController
public class MuseoController {
	private MuseoRepository museoRepository;

	public MuseoController(MuseoRepository museoRepository) {
		this.museoRepository = museoRepository;
	}
	
	@GetMapping("/obras/{ciudad}")
	ArrayList<Museo> obtenerMuseosbyCiudad(@PathVariable String ciudad){
		return museoRepository.getMuseosByCiudadInicialL(ciudad);
	}

}
