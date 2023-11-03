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
public class Empleado extends Persona{

    @Column(name = "compania")
    private String compania;
}
