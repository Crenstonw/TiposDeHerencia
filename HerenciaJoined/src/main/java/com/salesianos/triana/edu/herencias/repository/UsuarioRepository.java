package com.salesianos.triana.edu.herencias.repository;

import com.salesianos.triana.edu.herencias.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
