//Sabemos que para utilizar los repositorios de los controladores, estos
//deben ser definidos como atributos finales de la clase e iniciarlos en el constructor
package com.example.lab2_20212472.controlador;
import com.example.lab2_20212472.modelo.Auto;
import com.example.lab2_20212472.repositorio.AutoRepositorio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AutoControlador {

    final AutoRepositorio autoRepositorio;

    public AutoControlador(AutoRepositorio autoRepositorio) {
        this.autoRepositorio = autoRepositorio;
    }

    //mostramos el resultado en el html
    @GetMapping("/autos")
    public String listarAutos(Model model) {
        List<Auto> lista = autoRepositorio.findAll();
        model.addAttribute("listaAutos", lista);
        return "autos";
    }
}
