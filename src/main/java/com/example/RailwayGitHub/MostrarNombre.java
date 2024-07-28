package com.example.RailwayGitHub;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* Microservicio REST que retorna el nombre especificado en la URL */

@RestController
@RequestMapping("/name")
public class MostrarNombre {

    @GetMapping("/{nombre}")
    public String getName(@PathVariable String nombre){
        return nombre;
    }
}
