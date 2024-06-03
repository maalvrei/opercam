package com.app.opercam.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="rechazos")
public class Rechazo {
	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="rechazo_id")
    private Long rechazoId;
	
	public Long getRechazoId() {
		return rechazoId;
	}

	public void setRechazoId(Long rechazoId) {
		this.rechazoId = rechazoId;
	}

	public LineaProduccion getLineaProduccion() {
		return lineaProduccion;
	}

	public void setLineaProduccion(LineaProduccion lineaProduccion) {
		this.lineaProduccion = lineaProduccion;
	}

	public double getPorcentajeFrame() {
		return porcentajeFrame;
	}

	public void setPorcentajeFrame(double porcentajeFrame) {
		this.porcentajeFrame = porcentajeFrame;
	}

	public double getPorcentajeLid() {
		return porcentajeLid;
	}

	public void setPorcentajeLid(double porcentajeLid) {
		this.porcentajeLid = porcentajeLid;
	}

	public double getPorcentajeCutter() {
		return porcentajeCutter;
	}

	public void setPorcentajeCutter(double porcentajeCutter) {
		this.porcentajeCutter = porcentajeCutter;
	}

	public double getPorcentajeEnsamblado() {
		return porcentajeEnsamblado;
	}

	public void setPorcentajeEnsamblado(double porcentajeEnsamblado) {
		this.porcentajeEnsamblado = porcentajeEnsamblado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@ManyToOne
	@JoinColumn(name = "linea_id")
	private LineaProduccion lineaProduccion;
	
	@Column(name="porcentaje_frame")
	private double porcentajeFrame;
	
	@Column(name="porcentaje_lid")
	private double porcentajeLid;
	
	@Column(name="porcentaje_cutter")
	private double porcentajeCutter;
	
	@Column(name="porcentaje_ensamblado")
	private double porcentajeEnsamblado;

	
}
