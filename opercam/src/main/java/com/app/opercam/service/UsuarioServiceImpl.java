package com.app.opercam.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.opercam.model.entity.Usuario;
import com.app.opercam.model.repository.IUsuarioRepository;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	IUsuarioRepository usuarioRepository;
	
	@Override
	public Optional<Usuario> findById(Long id) {
		return usuarioRepository.findById(id);
	}

	@Override
	public Iterable<Usuario> findAll() {
		return usuarioRepository.findAll();
	}

	@Override
	public Optional<Usuario> findByName(String name) {
		List<Usuario> usuarios = (List<Usuario>) findAll();
		Usuario usuario = null;
		for (Usuario user : usuarios) if (user.getNombreUsuario().equalsIgnoreCase(name)) usuario = user;
		return Optional.of(usuario);
	}

}
