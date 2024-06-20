package com.app.opercam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.app.opercam.model.DatosLogin;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String home(Model model) {
		model.addAttribute("datosLogin", new DatosLogin());
		return "login";
	}

}
