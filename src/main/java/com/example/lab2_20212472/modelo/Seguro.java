package com.example.lab2_20212472.modelo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

// hacemos uso de Project Lombok para hacer el código más legible
@Getter
@Setter
@Entity
@Table(name = "seguro")
public class Seguro {

    // agregamos notaciones para que Spring las reconozca
    @Id // primary key de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idseguro")
    private Integer idseguro;

    @Column(name = "empresa_aseguradora", length = 45, nullable = false)
    private String empresaAseguradora;

    @Column(name = "cobertura_maxima", nullable = false)
    private Double coberturaMaxima;

    @Column(nullable = false)
    private Double tarifa;
}
