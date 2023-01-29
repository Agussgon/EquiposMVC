package com.proyectoEquiposMVC.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name="EQUIPOS")


public class Equipo {
@Id
@SequenceGenerator(name = "equipo_sequence", sequenceName = "equipo_sequence", allocationSize = 1)
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "equipo_sequence")
private Long id;

@Column (length=100)
private String nombre;

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public Equipo(){}
}
