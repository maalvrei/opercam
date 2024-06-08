package com.app.opercam.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.opercam.model.entity.LineaProduccion;
import com.app.opercam.model.entity.Rechazo;
import com.app.opercam.model.repository.IRechazoRepository;

@Service
public class RechazoServiceImpl implements IRechazoService{
	
	@Autowired
	IRechazoRepository rechazoRepository;

	@Override
	public Iterable<Rechazo> findAll() {
		return rechazoRepository.findAll();
	}
	
	@Override
	public Optional<Rechazo> findById(Long id) {
		return rechazoRepository.findById(id);
	}

	@Override
	public Rechazo findByProductionLine(LineaProduccion linea) {
		List<Rechazo> list = (List<Rechazo>)findAll();
		Rechazo rechazo = null;
		for (Rechazo r : list) if (r.getLineaProduccion().equals(linea)) rechazo = r;
		return rechazo;
	}

	@Override
	public List<Rechazo> rechazoPorPuesto(List<LineaProduccion> puesto) {
		List<Rechazo> rechazosPuesto = new ArrayList<>();
		for (Rechazo rechazo : findAll()) {
			for (LineaProduccion linea : puesto) {
				if (rechazo.getLineaProduccion().getNumeroLinea()==linea.getNumeroLinea()) rechazosPuesto.add(rechazo);
			}
		}
		rechazosPuesto.forEach(r-> System.out.println("Rechazo :" + r.getRechazoId()));
		return rechazosPuesto;
	}

}
