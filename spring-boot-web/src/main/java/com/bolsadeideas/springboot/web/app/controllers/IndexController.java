package com.bolsadeideas.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class IndexController {

	
	@GetMapping({ "/index", "", "/", "/home" })
	public String index(Model model) {
	//	model.addAttribute("titulo", textoIndex);
		return "index";
	}
	
	
	
}
