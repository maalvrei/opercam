package com.app.opercam.service;

import java.util.Optional;

import com.app.opercam.model.entity.Credencial;
import com.app.opercam.model.entity.Usuario;

public interface ICredencialService {

	Optional<Credencial> findById(Long id);
	Iterable<Credencial> findAll();
	Optional<Credencial> findByUser(Usuario user);
	Optional<Credencial> findByEmail(String email);
	boolean verificarCredencial(String email, String password);
	
}
