package com.salesianos.triana.edu.herencias.repository;

import com.salesianos.triana.edu.herencias.models.Donante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends JpaRepository<Donante, Long> {
}
