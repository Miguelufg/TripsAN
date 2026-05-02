package com.trips.services;

import java.util.List;

import com.trips.models.Rol;


public interface IRolServices {

	
	List<Rol> buscarTodo();
	Rol buscarPorId(Integer idrol);
	
	
	
}
