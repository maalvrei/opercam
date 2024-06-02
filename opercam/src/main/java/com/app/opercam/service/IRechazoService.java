package com.app.opercam.service;

import java.util.Optional;

import com.app.opercam.model.entity.LineaProduccion;
import com.app.opercam.model.entity.Rechazo;

public interface IRechazoService {

	Optional<Rechazo> findById(Long id);
	Optional<Rechazo> findByProductionLine(LineaProduccion linea);
	
}
