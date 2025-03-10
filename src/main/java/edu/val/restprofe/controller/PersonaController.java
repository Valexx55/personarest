package edu.val.restprofe.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.val.restprofe.dto.Persona;

@RestController
@RequestMapping("/persona")
public class PersonaController {
	
	@GetMapping
	public Persona obtenerPersona ()
	{
		return new Persona(1L, "Vale", 41);
	}
	
	
	@GetMapping("/all")
	public List<Persona> obtenerPersonas ()
	{
		
		List<Persona> l = List.of(new Persona(1L, "Vale", 41), new Persona(2L, "Olga", 41), new Persona(3L, "Romeo", 2)); 
		
		return l;
		
	}
	
	

}
