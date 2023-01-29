package com.proyectoEquiposMVC.demo.controller;

import com.proyectoEquiposMVC.demo.entity.Equipo;
import com.proyectoEquiposMVC.demo.service.impl.EquipoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipos")
public class EquipoController {

    @Autowired
    EquipoServiceImpl equipoService;

    @GetMapping
    public ResponseEntity<List<Equipo>> listarEquipos(){
        return ResponseEntity.ok(equipoService.listarEquipos());

    }

    @PostMapping("/registro")
    public ResponseEntity<Equipo> registrarEquipo(@RequestBody Equipo equipo){
        if(equipo != null){
        return ResponseEntity.ok(equipoService.registrarEquipo(equipo));}
        else{ return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();}
    }

}
