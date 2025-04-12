package com.example.lab2_20212472.modelo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

// Hacemos uso de Project Lombok para hacer el código más legible
// Lombok genera automáticamente los métodos get y set por cada atributo
@Getter
@Setter
@Entity
@Table(name = "auto")
public class Auto {

    @Id // Llave primaria de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idauto")
    private Integer idauto;

    @Column(length = 45, nullable = false)
    private String modelo;

    @Column(length = 45, nullable = false)
    private String color;

    private Integer kilometraje;

    @Column(name = "sede_idsede")
    private Integer sedeIdSede;

    @Column(name = "costo_por_dia")
    private Double costoPorDia;
}
