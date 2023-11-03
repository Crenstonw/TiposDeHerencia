package com.salesianostriana.dam.EjemploMappedSuperClass.repos;

import com.salesianostriana.dam.EjemploMappedSuperClass.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Long> {
}
