package com.proyectoEquiposMVC.demo.repository;

import com.proyectoEquiposMVC.demo.entity.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipoRepository extends JpaRepository <Equipo,Long> {


}
