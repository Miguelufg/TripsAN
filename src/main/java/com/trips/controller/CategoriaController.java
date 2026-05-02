package com.trips.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping(value="/categorias")
public class CategoriaController {

	    @GetMapping("/index")
	    public String mostrarIndex() {
	        return "categoriasTrip/listCategoria";
	    }

	    @GetMapping("/create")
	    public String crear() {
	        return "categoriasTrip/formCategoria"; // mejor que apunte al formulario
	    }

	    @PostMapping("/save")
	    public String guardar(@RequestParam("nombre") String nombre,
	                          @RequestParam("descripcion") String descripcion) {
	        System.out.println("Nombre Categoria: " + nombre);
	        System.out.println("Descripcion: " + descripcion);

	        // Aquí iría la lógica para guardar en la base de datos

	        return "categoriasTrip/listCategoria"; // vista que se muestra después de guardar
	    }
	    
	    
	}


