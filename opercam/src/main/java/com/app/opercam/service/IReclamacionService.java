package com.app.opercam.service;

import java.util.Optional;

import com.app.opercam.model.entity.Reclamacion;

public interface IReclamacionService {
	Optional<Reclamacion> findById(Long id);
	Iterable<Reclamacion> findAll();
}
