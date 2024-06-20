package com.app.opercam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.opercam.model.entity.LineaProduccion;
import com.app.opercam.model.entity.Rechazo;
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
		List<Rechazo> rechazos = rechazoService.rechazoPorPuesto(puesto1);
		model.addAttribute("rechazos",rechazos);
		model.addAttribute("puesto",1);
		return "puesto";
	}
	
	@GetMapping("/puesto/2")
	public String puesto2 (Model model) {
		List<LineaProduccion> puesto2 = lineaProduccionService.puesto2();
		List<Rechazo> rechazos = rechazoService.rechazoPorPuesto(puesto2);
		model.addAttribute("rechazos",rechazos);
		model.addAttribute("puesto",2);
		return "puesto";
	}
	
	@GetMapping("/puesto/3")
	public String puesto3 (Model model) {
		List<LineaProduccion> puesto3 = lineaProduccionService.puesto3();
		List<Rechazo> rechazos = rechazoService.rechazoPorPuesto(puesto3);
		model.addAttribute("rechazos",rechazos);
		model.addAttribute("puesto",3);
		return "puesto";
	}
	
	@GetMapping("/puesto/4")
	public String puesto4 (Model model) {
		List<LineaProduccion> puesto4 = lineaProduccionService.puesto4();
		List<Rechazo> rechazos = rechazoService.rechazoPorPuesto(puesto4);
		model.addAttribute("rechazos",rechazos);
		model.addAttribute("puesto",4);
		return "puesto";
	}
	
	@GetMapping("/puesto/5")
	public String puesto5 (Model model) {
		List<LineaProduccion> puesto5 = lineaProduccionService.puesto5();
		List<Rechazo> rechazos = rechazoService.rechazoPorPuesto(puesto5);
		model.addAttribute("rechazos",rechazos);
		model.addAttribute("puesto",5);
		return "puesto";
	}
	
	@PostMapping("/puesto/filtro")
	public String puestoFiltrado(@RequestParam("producto") String producto, Model model) {
	    List<LineaProduccion> puestoFiltrado = lineaProduccionService.findByProducto(producto);
	    List<Rechazo> rechazos = rechazoService.rechazoPorPuesto(puestoFiltrado);
	    model.addAttribute("rechazos", rechazos);
	    model.addAttribute("puesto", "FILTRADO POR " + producto);
	    return "puesto";
	}
}
