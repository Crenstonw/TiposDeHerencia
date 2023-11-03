package com.salesianostriana.dam.EjemploMappedSuperClass.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Estudiante extends Persona{

    @Column(name = "centro")
    private String centro;

    @Column(name = "curso")
    private String curso;

}
