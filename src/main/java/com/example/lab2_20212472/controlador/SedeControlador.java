//Sabemos que para utilizar los repositorios de los controladores, estos
//deben ser definidos como atributos finales de la clase e iniciarlos en el constructor
package com.example.lab2_20212472.controlador;

import com.example.lab2_20212472.modelo.Sede;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.lab2_20212472.repositorio.SedeRepositorio;

import java.util.List;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SedeControlador {

    // Sabemos que para utilizar los repositorios en los controladores,
    // estos deben ser definidos como atributos finales de la clase
    // e inicializados en el constructor
    final SedeRepositorio sedeRepositorio;

    public SedeControlador(SedeRepositorio sedeRepositorio) {
        this.sedeRepositorio = sedeRepositorio;
    }

    // Mostramos el resultado en la vista HTML
    @GetMapping("/sedes")
    public String listarSedes(Model model) {
        List<Sede> lista = sedeRepositorio.findAll();
        model.addAttribute("listaSedes", lista);
        return "sedes"; // devuelve la vista sedes.html
    }

    //mostramos el formulario para crear una nueva sede
    @GetMapping("/sede/nueva")
    public String mostrarFormularioNuevaSede(Model model) {
        model.addAttribute("sede", new Sede());
        return "sedeFormulario";
    }

    //guardamos la nueva sede
    @PostMapping("/sede/guardar")
    public String guardarSede(@ModelAttribute("sede") Sede sede) {
        sedeRepositorio.save(sede);
        return "redirect:/sedes";
    }
}
