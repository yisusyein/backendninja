package com.udemy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.model.Persona;

@Controller
@RequestMapping("/persona")
public class PersonaController {
	
	public static final String EXAMPLE_VIEW = "persona";
	//primer forma
	@GetMapping("/personaString")
	public String exampleString(Model model){
		//model.addAttribute("persona", new Persona( "Jesús Santiago", 23));
		model.addAttribute("persona", getPeople());
		return EXAMPLE_VIEW;
	}
	
	//segunda forma
	@GetMapping("/personaMAV")
	public ModelAndView exampleMAV(){
		ModelAndView mav = new ModelAndView(EXAMPLE_VIEW);
		//mav.addObject("persona", new Persona( "Juan Casntro", 44));
		mav.addObject("persona", getPeople());
		//return new ModelAndView(EXAMPLE_VIEW);
		return mav;
	}
	
	private List<Persona> getPeople(){
		List<Persona> people = new ArrayList<>();
		people.add(new Persona("Jesus Santiago", 23));
		people.add(new Persona("Juan castro", 44));
		people.add(new Persona("Oscar cordoba", 22));
		people.add(new Persona("Maria Camila", 23));
		return people;
	}
	
}
