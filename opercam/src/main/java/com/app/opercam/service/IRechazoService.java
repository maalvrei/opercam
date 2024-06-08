package com.app.opercam.service;

import java.util.List;
import java.util.Optional;

import com.app.opercam.model.entity.LineaProduccion;
import com.app.opercam.model.entity.Rechazo;

public interface IRechazoService {

	Optional<Rechazo> findById(Long id);
	Iterable<Rechazo> findAll();
	Rechazo findByProductionLine(LineaProduccion linea);
	List<Rechazo> rechazoPorPuesto(List<LineaProduccion> puesto);
}
