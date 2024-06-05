package com.app.opercam.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.opercam.model.entity.Credencial;
import com.app.opercam.model.entity.Usuario;
import com.app.opercam.model.repository.ICredencialRepository;

@Service
public class CredencialServiceImpl implements ICredencialService {

	@Autowired
	ICredencialRepository credencialRepository;
	
	@Override
	public Optional<Credencial> findById(Long id) {
		return credencialRepository.findById(id);
	}

	@Override
	public Iterable<Credencial> findAll() {
		return credencialRepository.findAll();
	}

	@Override
	public Optional<Credencial> findByUser(Usuario user) {
		Credencial credencial = null;
		List<Credencial> list = (List<Credencial>) credencialRepository.findAll();
		for (Credencial c : list) {
			if (c.getUsuario().getNombreUsuario().equalsIgnoreCase(user.getNombreUsuario()) && c.getUsuario().getUsuarioId().equals(user.getUsuarioId())) {
				credencial = c;
			}
		}
		return Optional.of(credencial);
	}

	@Override
	public Credencial findByEmail(String email) {
		Credencial credencial = null;
		List<Credencial> list = (List<Credencial>) findAll();
		for (Credencial c : list) {
			if (c.getEmail().equalsIgnoreCase(email)) credencial = c;
		}
		return credencial == null ? null: credencial;
	}

	@Override
	public boolean verificarCredencial(String email, String password) {
		Credencial c = findByEmail(email);
		if (!(c==null))
			if (c.getContrasena().equalsIgnoreCase(password)) return true;
		return false;
	}

}
