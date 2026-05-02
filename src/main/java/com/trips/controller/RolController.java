package com.trips.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping(value="/roles")

public class RolController {
	
	
	@GetMapping("/index")
    public String mostrarIndex() {
        return "rolesTrip/listRoles";
    }

    @GetMapping("/create")
    public String crear() {
        return "rolesTrip/fromRoles"; // mejor que apunte al formulario
    }

    @PostMapping("/save")
    public String guardar(@RequestParam("nombre") String nombre,
                          @RequestParam("descripcion") String descripcion,
                          @RequestParam("username") String username,
                          @RequestParam("fecha") String fecha) {

    	 System.out.println("Nombre : " + nombre);
         System.out.println("descripcion: " + descripcion);
         System.out.println("Username: " + username);
         System.out.println("fecha: " + fecha);
         
        return "rolesTrip/listRoles"; // vista que se muestra después de guardar
    }
	
		
	
	
	
	
	

}
