package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// controler para que spring boot sepa y lo leear
//este controler mostrara la visa del template holamundo.html
@Controller
//anotacion para url de esta vista
@RequestMapping("/app")
public class HolaMundoController {

	
	//ahora creamos un metodo
	// peticion nueva de spring 4.3. tambien se puede usar requestMapping pero la nueva version trae GetMapping
	@GetMapping("/hola")	
	public String holaMundo(){
		//llamamos al nombre de la vista
		return "holamundo";
		
	}
}
