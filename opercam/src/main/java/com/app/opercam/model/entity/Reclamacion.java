package com.app.opercam.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="reclamaciones")
public class Reclamacion {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="reclamacion_id")
    private Long reclamacionId;
	
	private int linea;
	private String descripcion;
	private String pieza;
	
	@Column(name="creada_por")
	private String creadaPor;
	
	@Column(name="asignada_a")
	private String asignadaA;

	public Long getReclamacionId() {
		return reclamacionId;
	}

	public void setReclamacionId(Long reclamacionId) {
		this.reclamacionId = reclamacionId;
	}

	public int getLinea() {
		return linea;
	}

	public void setLinea(int linea) {
		this.linea = linea;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPieza() {
		return pieza;
	}

	public void setPieza(String pieza) {
		this.pieza = pieza;
	}

	public String getCreadaPor() {
		return creadaPor;
	}

	public void setCreadaPor(String creadaPor) {
		this.creadaPor = creadaPor;
	}

	public String getAsignadaA() {
		return asignadaA;
	}

	public void setAsignadaA(String asignadaA) {
		this.asignadaA = asignadaA;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
