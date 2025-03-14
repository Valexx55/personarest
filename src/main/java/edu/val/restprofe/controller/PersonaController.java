package edu.val.restprofe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.val.restprofe.dto.Persona;

@RestController
@RequestMapping("/persona")
public class PersonaController {
	
	
	@Value("${mientorno}")
	String mientorno;
	
	@GetMapping
	public Persona obtenerPersona ()
	{
		return new Persona(1L, "Vale", 41);
	}
	
	//comentarios
	@GetMapping("/all")
	public List<Persona> obtenerPersonas ()
	{
		return List.of(new Persona(1L, "Vale", 41), new Persona(1L, "Vale", 41), new Persona(1L, "Vale", 41));
	}
	
	@GetMapping("/entorno")
	public String obtenerEntorno ()
	{
		return mientorno;
		
	}
	
	

}
