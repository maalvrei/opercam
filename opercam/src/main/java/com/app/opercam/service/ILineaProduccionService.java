package com.app.opercam.service;

import java.util.List;
import java.util.Optional;

import com.app.opercam.model.entity.LineaProduccion;

public interface ILineaProduccionService {

	Optional<LineaProduccion> findById(Long id);
	Iterable<LineaProduccion> findAll();
	List<LineaProduccion> findByProducto(String producto);
	Optional<LineaProduccion> findByLineNumber(int number);
}
