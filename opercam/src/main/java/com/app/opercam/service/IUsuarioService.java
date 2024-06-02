package com.app.opercam.service;

import java.util.Optional;

import com.app.opercam.model.entity.Usuario;

public interface IUsuarioService {

	Optional<Usuario> findById(Long id);
	Iterable<Usuario> findAll();
	Usuario findByName(String name);
}
