package com.trips.models;

import java.util.Date;
public class Trip {
	
	private  Integer Id;
	private String nomTrip;
	private String descripcion;
	private double costo;
	private  int calificacion;
	private String detalle;
	private boolean activo;
	private Date fecha;
	private Integer destacado;
	private String imagen="no-image.png";
	
	@Override
	public String toString() {
	    return "Trip [Id=" + Id 
	        + ", nomTrip=" + nomTrip 
	        + ", descripcion=" + descripcion 
	        + ", costo=" + costo 
	        + ", calificacion=" + calificacion 
	        + ", imagen=" + imagen 
	        + ", detalle=" + detalle 
	        + ", activo=" + activo 
	        + ", fecha=" + fecha 
	        + "]";
	}

	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getNomTrip() {
		return nomTrip;
	}
	public void setNomTrip(String nomTrip) {
		this.nomTrip = nomTrip;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public int getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public Integer getDestacado() {
		return destacado;
	}


	public void setDestacado(Integer destacado) {
		this.destacado = destacado;
	}
	
	
	
	

}
