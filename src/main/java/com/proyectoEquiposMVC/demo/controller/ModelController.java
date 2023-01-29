package com.proyectoEquiposMVC.demo.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModelController {

    @GetMapping("/login")
    public String welcome(Model model) {
        model.addAttribute("nombre", "hola");
        return "login";
    }
}