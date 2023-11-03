package com.salesianostriana.dam.EjemploMappedSuperClass.repos;

import com.salesianostriana.dam.EjemploMappedSuperClass.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepositorio extends JpaRepository<Estudiante, Long> {
}
