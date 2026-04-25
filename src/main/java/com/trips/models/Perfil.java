package com.trips.models;

public class Perfil {
	
	private  Integer Id;
	private String nomperfil;
	private String descripcion;
	private boolean activo;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getNomperfil() {
		return nomperfil;
	}
	public void setNomperfil(String nomperfil) {
		this.nomperfil = nomperfil;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	


}
