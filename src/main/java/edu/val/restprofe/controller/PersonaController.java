package edu.val.restprofe.controller;

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
	
	

}
