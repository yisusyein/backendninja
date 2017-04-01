package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/imprimir-thymeleaf")
public class ImprimirEnPlantillaController {
	
	public static final String EXAMPLE_VIEW = "imprimir-en-plantilla";
	//primer forma
	@GetMapping("/exampleString")
	public String exampleString(Model model){
		model.addAttribute("name", "Jesús Santiago");
		return EXAMPLE_VIEW;
	}
	
	//segunda forma
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAV(){
		ModelAndView mav = new ModelAndView(EXAMPLE_VIEW);
		mav.addObject("name", "Juan Castro");
		//return new ModelAndView(EXAMPLE_VIEW);
		return mav;
	}
	
}
