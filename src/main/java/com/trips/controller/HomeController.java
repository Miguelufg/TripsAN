package com.trips.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.trips.models.Trip;

@Controller
public class HomeController {

    @GetMapping("/tabla")
    public String mostrarTabla(Model model) {
        List<Trip> lista = getTrips();
        model.addAttribute("trips", lista);
        return "tabla"; // vista Thymeleaf
    }

    @GetMapping("/")
    public String mostrarHome(Model model) {
        model.addAttribute("mensaje", "hola mundo");
        return "home";
    }

    @GetMapping("/listado")
    public String mostrarListado(Model model) {
        List<String> lista = new LinkedList<>();
        lista.add("En la montaña");
        lista.add("En la ciudad");
        lista.add("En los pueblos");
        lista.add("En las playas");

        model.addAttribute("ListadoTrips", lista);
        return "listado";
    }

    @GetMapping("/detalle")
    public String mostrarDetalle(Model model) {
        Trip trip = new Trip();
        trip.setNomTrip("Rapel en Volcatenango");
        trip.setDescripcion("Aventura de rapel en un circuito conectado en las montañas...");
        trip.setFecha(new Date());
        trip.setCosto(10.0);
        trip.setCalificacion(5);
        trip.setImagen("volcatenango.jpg");
        trip.setDetalle("Incluye equipo de seguridad y guía especializado");
        trip.setActivo(true);

        model.addAttribute("trip", trip);
        return "detalle";
    }

    @GetMapping("/trips/lista")
    public String mostrarLista(Model model) {
        List<Trip> lista = getTrips();
        model.addAttribute("trips", lista);
        return "listaTrips";
    }

    @GetMapping("/trips/detalle/{id}")
    public String mostrarDetallePorId(@PathVariable("id") int id, Model model) {
        List<Trip> lista = getTrips();
        Trip seleccionado = null;

        for (Trip t : lista) {
            if (t.getId() == id) {
                seleccionado = t;
                break;
            }
        }

        model.addAttribute("trip", seleccionado);
        return "detalle";
    }

    // Método privado para poblar datos de prueba
    private List<Trip> getTrips() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        List<Trip> lista = new LinkedList<>();
        try {
            Trip trip1 = new Trip();
            trip1.setId(1);
            trip1.setNomTrip("Rapel en Volcatenango");
            trip1.setDescripcion("Hacer rapel en los circuitos de Volcatenango");
            trip1.setFecha(sdf.parse("10-05-2022"));
            trip1.setCosto(5.0);
            trip1.setDestacado(1);
            trip1.setImagen("tirp03.png");

            Trip trip2 = new Trip();
            trip2.setId(2);
            trip2.setNomTrip("Deslizador en El Picnic");
            trip2.setDescripcion("Deslizarte en un divertido tobogán sobre la colina");
            trip2.setFecha(sdf.parse("10-05-2022"));
            trip2.setCosto(5.0);
            trip2.setDestacado(1);
            trip2.setImagen("trip02.png");

            Trip trip3 = new Trip();
            trip3.setId(3);
            trip3.setNomTrip("Comida y Flores");
            trip3.setDescripcion("Disfrutar de un amplio jardín el cual podrás comprar");
            trip3.setFecha(sdf.parse("10-05-2022"));
            trip3.setCosto(1.0);
            trip3.setDestacado(1);
            trip3.setImagen("tirp03.png");

            Trip trip4 = new Trip();
            trip4.setId(4);
            trip4.setNomTrip("Caminatas");
            trip4.setDescripcion("Disfruta hacer senderismo por las montañas chalatecas");
            trip4.setFecha(sdf.parse("01-02-2022"));
            trip4.setCosto(1.0);
            trip4.setDestacado(1);
            trip4.setImagen("trip01.png");

            lista.add(trip1);
            lista.add(trip2);
            lista.add(trip3);
            lista.add(trip4);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }
}

