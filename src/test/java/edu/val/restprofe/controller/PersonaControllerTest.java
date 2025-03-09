package edu.val.restprofe.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment =  WebEnvironment.RANDOM_PORT)
public class PersonaControllerTest {

	@LocalServerPort
	private int port;
	
	@Autowired
	TestRestTemplate template;
	
	
	@Test
	public void testGetAlumno () {
		assertThat(this.template.getForObject("http://localhost:"+ port+"/persona", String.class)).contains("nombre");
	}

}
