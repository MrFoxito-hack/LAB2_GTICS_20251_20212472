package com.example.lab2_20212472.modelo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

// hacemos uso de Project Lombok para hacer el código más legible
@Getter
@Setter
@Entity
@Table(name = "sede")
public class Sede {

    // agregamos notaciones para que Spring las reconozca
    @Id // primary key de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idsede")
    private Integer idsede;

    @Column(length = 45, nullable = false)
    private String distrito;

    @Column(length = 200, nullable = false)
    private String direccion;
}
