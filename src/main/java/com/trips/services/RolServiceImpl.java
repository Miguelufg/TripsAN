package com.trips.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.trips.models.Rol;

@Service
public class RolServiceImpl implements IRolServices{
	
	 private List<Rol> lista = null;

	    public RolServiceImpl() {
	        lista = getRoles(); // inicializamos la lista con datos de prueba
	    }

	    @Override
	    public List<Rol> buscarTodo() {
	        return lista;
	    }

	    @Override
	    public Rol buscarPorId(Integer idrol) {
	        for (Rol rol : lista) {
	            if (rol.getId().equals(idrol)) {
	                return rol;
	            }
	        }
	        return null;
	
	    }

	    
	 // Método privado para poblar la lista con datos de ejemplo
	    private List<Rol> getRoles() {
	        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	        List<Rol> lista = new LinkedList<>();
	        try {
	        	Rol rol1 = new Rol();
	            rol1.setId(1);
	            rol1.getNomrol("guia");
	            rol1.setDescripcion("ensena el camino");
	            rol1.setFecha(sdf.parse("10-05-2022"));
	            rol1.setActivo(true);

	            

	            Rol rol2 = new Rol();
	            rol2.setId(1);
	            rol2.getNomrol("guia");
	            rol2.setDescripcion("ensena el camino");
	            rol2.setFecha(sdf.parse("10-05-2022"));
	            rol2.setActivo(true);

	            Rol rol3 = new Rol();
	            rol3.setId(1);
	            rol3.getNomrol("guia");
	            rol3.setDescripcion("ensena el camino");
	            rol3.setFecha(sdf.parse("10-05-2022"));
	            rol3.setActivo(true);

	           

	            lista.add(rol1);
	            lista.add(rol2);
	            lista.add(rol3);
	            
	        } catch (ParseException e) {
	            System.out.println(e.getMessage());
	        }
	        return lista;
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
}
