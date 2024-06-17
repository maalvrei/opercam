package com.app.opercam.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.opercam.model.entity.Reclamacion;
import com.app.opercam.model.repository.IReclamacionRepository;

@Service
public class ReclamacionServiceImpl implements IReclamacionService {

	@Autowired
	IReclamacionRepository reclamacionRepository;
	
	@Override
	public Optional<Reclamacion> findById(Long id) {
		return reclamacionRepository.findById(id);
	}

	@Override
	public Iterable<Reclamacion> findAll() {
		return reclamacionRepository.findAll();
	}

	@Override
	@Transactional
	public void save(Reclamacion r) {
		reclamacionRepository.save(r);
		
	}

}
