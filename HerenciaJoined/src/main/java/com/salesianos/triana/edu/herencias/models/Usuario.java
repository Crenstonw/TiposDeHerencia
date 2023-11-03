package com.salesianos.triana.edu.herencias.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

}
