package com.app.opercam.service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.opercam.model.entity.Reclamacion;

@Controller
public class ReclamacionController {
	
	@GetMapping("/reclamacion")
	public String reclamacion (Model model) {
		model.addAttribute("reclamacion", new Reclamacion());
		return "reclamacion";
	}
	
}
