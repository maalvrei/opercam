package com.app.opercam.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.opercam.model.entity.Reclamacion;
import com.app.opercam.service.IReclamacionService;

@Controller
public class ReclamacionController {
	
	@Autowired
	IReclamacionService reclamacionService;
	
	@GetMapping("/reclamacion")
	public String reclamacion (Model model) {
		model.addAttribute("reclamacion", new Reclamacion());
		return "reclamacion";
	}
	
	@PostMapping("/reclamacionCreada")
	public String reclamacionCreada (Model model, Reclamacion r) {
		reclamacionService.save(r);
		List<Reclamacion> reclamaciones = (List<Reclamacion>) reclamacionService.findAll();
		model.addAttribute("reclamaciones",reclamaciones);
		return "reclamaciones";
	}
	
	@GetMapping("/reclamaciones")
	public String reclamaciones (Model model) {
		List<Reclamacion> reclamaciones = (List<Reclamacion>) reclamacionService.findAll();
		model.addAttribute("reclamaciones",reclamaciones);
		return "reclamaciones";
	}
}
