package com.proyectoEquiposMVC.demo.service.impl;

import com.proyectoEquiposMVC.demo.entity.Equipo;
import com.proyectoEquiposMVC.demo.repository.EquipoRepository;
import com.proyectoEquiposMVC.demo.service.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipoServiceImpl implements EquipoService {

    @Autowired
    EquipoRepository equipoRepository;

    @Override
    public List<Equipo> listarEquipos() {
        List<Equipo>equipos= equipoRepository.findAll();
        return equipos;
    }

    @Override
    public Equipo registrarEquipo(Equipo equipo) {
        return equipoRepository.save(equipo);
    }

}
