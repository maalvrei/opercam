package com.app.opercam.service;

import java.util.List;
import java.util.Optional;

import com.app.opercam.model.entity.LineaProduccion;

public interface ILineaProduccionService {

	Optional<LineaProduccion> findById(Long id);
	Iterable<LineaProduccion> findAll();
	List<LineaProduccion> findByProducto(String producto);
	LineaProduccion findByLineNumber(int number);
	List<LineaProduccion> puesto1();
	List<LineaProduccion> puesto2();
	List<LineaProduccion> puesto3();
	List<LineaProduccion> puesto4();
	List<LineaProduccion> puesto5();
}
