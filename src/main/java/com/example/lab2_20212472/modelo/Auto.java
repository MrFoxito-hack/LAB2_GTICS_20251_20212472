// entity

package com.example.lab2_20212472.modelo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "auto")

//hacemos uso de Project Lombok para hacer el codigo mas legible
@Getter
@Setter
public class Auto {
    //agregamos notaciones para qeu Spring las reconozca
    @Id //primary key de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String marca;
    private String modelo;
    private Integer anio;
}
