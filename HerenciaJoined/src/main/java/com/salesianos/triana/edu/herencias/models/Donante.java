package com.salesianos.triana.edu.herencias.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Donante extends Usuario {

    @Column(name = "cantidad_donada")
    private double cantidadDonada;

    public Donante(Long id, String nickname, String email,
                   String password, double cantidadDonada) {
        super(id, nickname, email, password);
        this.cantidadDonada = cantidadDonada;
    }
}
