package com.trips.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trips.models.Usuario;




@Controller
@RequestMapping(value="/usuarios")

public class UsuarioController {

	
	@GetMapping("/index")
    public String mostrarIndex() {
        return "usuariosTrip/listUsuario";
    }

    @GetMapping("/create")
    public String crear() {
        return "usuariosTrip/fromUsuario"; // mejor que apunte al formulario
    }

    @PostMapping("/save")
    public String guardar(@RequestParam("nombre") String nombre,
                          @RequestParam("email") String email,
                          @RequestParam("username") String username,
                          @RequestParam("password") String password) {

    	 System.out.println("Nombre : " + nombre);
         System.out.println("Email: " + email);
         System.out.println("Username: " + username);
         System.out.println("Password: " + password);
         
        return "usuariosTrip/listUsuario"; // vista que se muestra después de guardar
    }
	
	
	
	
	
}
