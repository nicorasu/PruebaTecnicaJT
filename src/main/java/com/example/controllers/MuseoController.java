package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Museo;
import com.example.repositories.MuseoRepository;

@RestController
@Component 
public class MuseoController {
	@Autowired
	private MuseoRepository museoRepository;
	
	@GetMapping("/museos/{ciudad}")
	List<Museo> obtenerMuseosbyCiudad(@PathVariable("ciudad") String ciudad){
		return museoRepository.getMuseosByCiudad(ciudad);
	}

}
