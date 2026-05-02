package com.trips.models;

import java.util.Date;

public class Rol {

	private Integer id;
	private String nomrol;
	private boolean activo;
	private String descripcion;
	private Date fecha;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomrol(String string) {
		return nomrol;
	}
	public void setNomrol(String nomrol) {
		this.nomrol = nomrol;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	
	
}
