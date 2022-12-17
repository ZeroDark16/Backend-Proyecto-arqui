package com.mym.proyectobackend.controllers;

import com.mym.proyectobackend.domain.entities.Usuario;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
public interface UsuarioController {

    @GetMapping(value = "/posts", produces = {"Application/json"})
    List<Usuario> Listar();
}
