package com.app.opercam.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.app.opercam.model.DatosLogin;
import com.app.opercam.service.ICredencialService;

@Controller
public class LoginController {

	@Autowired
	private ICredencialService credencialService;

	@GetMapping("/login")
	public String home(Model model) {
		model.addAttribute("datosLogin", new DatosLogin());
		return "login.html";
	}

	@PostMapping("/login")
	public String verificarLogin(DatosLogin datosLogin, Model model) {
		return credencialService.verificarCredencial(datosLogin.getUser(), datosLogin.getPassword()) ? "home.html" : "redirect:login.html";
	}

}
