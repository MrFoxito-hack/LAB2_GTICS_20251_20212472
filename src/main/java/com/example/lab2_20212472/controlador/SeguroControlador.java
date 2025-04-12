//Sabemos que para utilizar los repositorios de los controladores, estos
//deben ser definidos como atributos finales de la clase e iniciarlos en el constructor
package com.example.lab2_20212472.controlador;

import com.example.lab2_20212472.modelo.Seguro;
import com.example.lab2_20212472.repositorio.SeguroRepositorio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SeguroControlador {

    // Sabemos que para utilizar los repositorios en los controladores,
    // estos deben ser definidos como atributos finales de la clase
    // e inicializados en el constructor
    final SeguroRepositorio seguroRepositorio;

    public SeguroControlador(SeguroRepositorio seguroRepositorio) {
        this.seguroRepositorio = seguroRepositorio;
    }

    // Mostramos el resultado en la vista HTML
    @GetMapping("/seguros")
    public String listarSeguros(Model model) {
        List<Seguro> lista = seguroRepositorio.findAll();
        model.addAttribute("listaSeguros", lista);
        return "seguros"; // retorna la vista seguros.html
    }

    //mostramos el formulario para crear un nuevo seguro
    @GetMapping("/seguro/nuevo")
    public String mostrarFormularioNuevoSeguro(Model model) {
        model.addAttribute("seguro", new Seguro());
        return "seguroFormulario";
    }

    //guardamos el nuevo seguro
    @PostMapping("/seguro/guardar")
    public String guardarSeguro(@ModelAttribute("seguro") Seguro seguro) {
        seguroRepositorio.save(seguro);
        return "redirect:/seguros";
    }
}
