package com.app.opercam.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.opercam.model.entity.LineaProduccion;
import com.app.opercam.service.ILineaProduccionService;
import com.app.opercam.service.IRechazoService;

@Controller
public class PuestoController {
	
	@Autowired
	private ILineaProduccionService lineaProduccionService;
	
	@Autowired
	private IRechazoService rechazoService;
	
	@GetMapping("/puesto/1")
	public String puesto1 (Model model) {
		List<LineaProduccion> puesto1 = lineaProduccionService.puesto1();
		model.addAttribute("rechazos",rechazoService.rechazoPorPuesto(puesto1));
		return "puesto.html";
	}
	
}
