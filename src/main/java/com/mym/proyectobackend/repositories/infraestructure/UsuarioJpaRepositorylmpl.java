package com.mym.proyectobackend.repositories.infraestructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsuarioJpaRepositorylmpl{

    @Autowired
    UsuarioJpaRepository usuarioJpaRepository;
}
