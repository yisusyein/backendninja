package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example")
public class ExampleController {
	
	public static final String EXAMPLE_VIEW = "example";

	//primera forma
	//esta para cuando es para redireccion o insertar pocos datos
	@GetMapping("/exampleString")
	public String exampleString(){
		return EXAMPLE_VIEW;
	}
	
	//segunda forma
	// esta para cuando hay que insertar muchos datos en las plantillas
	@RequestMapping(value="/exampleMAV", method=org.springframework.web.bind.annotation.RequestMethod.GET)
	public ModelAndView exampleMVA(){
		return new ModelAndView(EXAMPLE_VIEW);
	}
	
}
