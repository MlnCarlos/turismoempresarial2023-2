package com.example.turismoApp.modelos;

import jakarta.persistence.*;

@Entity
@Table(name="Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String cedula;
    private Integer rol;
}
