package com.app.opercam.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.opercam.model.entity.LineaProduccion;
import com.app.opercam.model.repository.ILineaProduccionRepository;

@Service
public class LineaProduccionServiceImpl implements ILineaProduccionService {
	
	@Autowired
	ILineaProduccionRepository lineaProduccionRepository;

	@Override
	public Optional<LineaProduccion> findById(Long id) {
		return lineaProduccionRepository.findById(id);
	}

	@Override
	public Iterable<LineaProduccion> findAll() {
		return lineaProduccionRepository.findAll();
	}

	@Override
	public List<LineaProduccion> findByProducto(String producto) {
		List<LineaProduccion> listaPorProducto = new ArrayList<>();
		List<LineaProduccion> lista = (List<LineaProduccion>) findAll();
		for (LineaProduccion l : lista) if (l.getProducto().equalsIgnoreCase(producto)) listaPorProducto.add(l);
		return listaPorProducto;
	}

	@Override
	public LineaProduccion findByLineNumber(int number) {
		LineaProduccion linea = null;
		List<LineaProduccion> lista = (List<LineaProduccion>) findAll();
		for (LineaProduccion l : lista) if (l.getNumeroLinea()==number) linea = l;
		return linea;
	}

	@Override
	public List<LineaProduccion> puesto1() {
		int[] lineasDelPuesto = {2,7,704};
		List<LineaProduccion> puesto1 = new ArrayList<>();
		List<LineaProduccion> lista = (List<LineaProduccion>) findAll();
		for (LineaProduccion l : lista) if (Arrays.stream(lineasDelPuesto).anyMatch(x -> x == l.getNumeroLinea())) puesto1.add(l);
		return puesto1;
	}

	@Override
	public List<LineaProduccion> puesto2() {
		int[] lineasDelPuesto = {6,611,617};
		List<LineaProduccion> puesto2 = new ArrayList<>();
		List<LineaProduccion> lista = (List<LineaProduccion>) findAll();
		for (LineaProduccion l : lista) if (Arrays.stream(lineasDelPuesto).anyMatch(x -> x == l.getNumeroLinea())) puesto2.add(l);
		return puesto2;
	}

	@Override
	public List<LineaProduccion> puesto3() {
		int[] lineasDelPuesto = {608,610,75};
		List<LineaProduccion> puesto3 = new ArrayList<>();
		List<LineaProduccion> lista = (List<LineaProduccion>) findAll();
		for (LineaProduccion l : lista) if (Arrays.stream(lineasDelPuesto).anyMatch(x -> x == l.getNumeroLinea())) puesto3.add(l);
		return puesto3;
	}

	@Override
	public List<LineaProduccion> puesto4() {
		int[] lineasDelPuesto = {609,58,53};
		List<LineaProduccion> puesto4 = new ArrayList<>();
		List<LineaProduccion> lista = (List<LineaProduccion>) findAll();
		for (LineaProduccion l : lista) if (Arrays.stream(lineasDelPuesto).anyMatch(x -> x == l.getNumeroLinea())) puesto4.add(l);
		return puesto4;
	}

	@Override
	public List<LineaProduccion> puesto5() {
		int[] lineasDelPuesto = {606,705,23};
		List<LineaProduccion> puesto5 = new ArrayList<>();
		List<LineaProduccion> lista = (List<LineaProduccion>) findAll();
		for (LineaProduccion l : lista) if (Arrays.stream(lineasDelPuesto).anyMatch(x -> x == l.getNumeroLinea())) puesto5.add(l);
		return puesto5;
	}

}
