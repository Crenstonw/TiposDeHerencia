package com.salesianos.triana.edu.herencias;

import com.salesianos.triana.edu.herencias.models.Usuario;
import com.salesianos.triana.edu.herencias.models.Donante;
import com.salesianos.triana.edu.herencias.repository.UsuarioRepository;
import com.salesianos.triana.edu.herencias.repository.VideoRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InitData {

    private final VideoRepository videoRepository;
    private final UsuarioRepository usuarioRepository;

    @PostConstruct
    public void initData() {
        Usuario u1 = Usuario.builder()
                .email("jkasahd@gmail.com")
                .nickname("antonioGaming123")
                .password("kjdfjsdf")
                .build();
        usuarioRepository.save(u1);

        Donante v1 = new Donante();
        v1.setCantidadDonada(11);
        v1.setEmail(u1.getEmail());
        v1.setPassword(u1.getPassword());
        v1.setId(u1.getId());

        videoRepository.save(v1);
    }
}
