package com.app.opercam.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.opercam.service.IUsuarioService;

@Controller
public class OpercamController {

	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping("/home")
	public String home (Model model) {
		model.addAttribute("nombre",usuarioService.findByName("Juan Reina").getNombreUsuario());
		return "home.html";
	}
	
}
