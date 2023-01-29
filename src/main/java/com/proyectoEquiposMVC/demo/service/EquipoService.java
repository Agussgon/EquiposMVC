package com.proyectoEquiposMVC.demo.service;

import com.proyectoEquiposMVC.demo.entity.Equipo;

import java.util.List;

public interface EquipoService {

    List<Equipo> listarEquipos();
    Equipo registrarEquipo(Equipo equipo);
}
