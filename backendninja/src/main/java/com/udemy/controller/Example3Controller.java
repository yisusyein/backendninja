package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.udemy.model.Persona;

@Controller
@RequestMapping("/example3")
public class Example3Controller {

	public static final String FORM_VIEW = "form";
	public static final String RESULT_NIEW = "result";
	
	//redireccionar #1
	/*@GetMapping("/")
	public String redirect(){
		return "redirect:/example3/showform";
	}
	@GetMapping("")
	public String redirect2(){
		return "redirect:/example3/showform";
	}*/
	
	//redireccionar #2
	@GetMapping("/")
	public RedirectView redirect(){
		return new RedirectView("/example3/showform");
	}
	@GetMapping("")
	public RedirectView redirect2(){
		return new RedirectView("/example3/showform");
	}
	
	@GetMapping("/showform")
	public String showForm(Model model){
		model.addAttribute("person", new Persona());
		return FORM_VIEW;
	}
	
	@PostMapping("/addperson")
	public ModelAndView addPerson(@ModelAttribute("person") Persona person){
		ModelAndView mav = new ModelAndView(RESULT_NIEW);
		mav.addObject("person", person);
		return mav;
	}
}
