package com.app.opercam.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.opercam.model.DatosLogin;
import com.app.opercam.service.ICredencialService;
import com.app.opercam.service.ILineaProduccionService;

@Controller
public class HomeController {

	@Autowired
	private ICredencialService credencialService;

	@Autowired
	private ILineaProduccionService lineaProduccionService;

	@PostMapping("/home")
	public String verificarLogin(DatosLogin datosLogin, Model model) {
		if (credencialService.verificarCredencial(datosLogin.getUser(), datosLogin.getPassword())) {
			model.addAttribute("puesto1", lineaProduccionService.puesto1());
			model.addAttribute("puesto2", lineaProduccionService.puesto2());
			model.addAttribute("puesto3", lineaProduccionService.puesto3());
			model.addAttribute("puesto4", lineaProduccionService.puesto4());
			model.addAttribute("puesto5", lineaProduccionService.puesto5());
		}
		return credencialService.verificarCredencial(datosLogin.getUser(), datosLogin.getPassword()) ? "home"
				: "redirect:login";
	}

	@GetMapping("/home")
	public String vueltaAlHome(Model model) {
		model.addAttribute("puesto1", lineaProduccionService.puesto1());
		model.addAttribute("puesto2", lineaProduccionService.puesto2());
		model.addAttribute("puesto3", lineaProduccionService.puesto3());
		model.addAttribute("puesto4", lineaProduccionService.puesto4());
		model.addAttribute("puesto5", lineaProduccionService.puesto5());
		return "home";
	}

}
