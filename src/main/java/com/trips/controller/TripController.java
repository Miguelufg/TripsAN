package com.trips.controller;
//import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import com.trips.services.ITripServices;





@Controller
@RequestMapping("/trips")
public class TripController {

	 
	
	
	
	@GetMapping("/view/{id}")
    public String verDetalle(@PathVariable("id") int idTrip, Model model) {
        System.out.println("IdTrip es: " + idTrip);
        model.addAttribute("idTrip", idTrip);
        return "trips/detalle"; // nombre de la vista Thymeleaf
    }
	
	 @GetMapping("/delete")
	    public String eliminar(@RequestParam("id") int idTrip, Model model) {
	        System.out.println("idTrip es " + idTrip);
	        // Aquí iría la lógica para eliminar el trip de la base de datos
	        model.addAttribute("id", idTrip);
	        return "mansaje"; // nombre de la vista Thymeleaf
	    }
	 
	 
	
	 
	 
	 
	 
	 
}
