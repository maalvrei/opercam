package com.app.opercam.service.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.opercam.model.DatosLogin;
import com.app.opercam.model.entity.Credencial;
import com.app.opercam.service.ICredencialService;
import com.app.opercam.service.IUsuarioService;

@Controller
public class OpercamController {

	@Autowired
	private IUsuarioService usuarioService;

	@Autowired
	private ICredencialService credencialService;

	@GetMapping("/login")
	public String home(Model model) {
		model.addAttribute("datosLogin", new DatosLogin());
		return "login.html";
	}

	@PostMapping("/login")
	public String verificarLogin(DatosLogin datosLogin, Model model) {
		Optional<Credencial> c = credencialService.findByEmail(datosLogin.getUser());
		if (c.get().getContrasena().equalsIgnoreCase(datosLogin.getPassword()))
			return "home.html";
		else
			return "redirect:login.html";
	}

}
