package com.mym.proyectobackend.controllers;

import com.mym.proyectobackend.domain.entities.Usuario;
import com.mym.proyectobackend.domain.services.UsuarioService;
import com.mym.proyectobackend.domain.services.UsuarioServicelmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(allowedHeaders = "*")
public class UsuarioControllerlmpl implements UsuarioService {

    @Autowired
    UsuarioServicelmpl usuarioServicelmpl;

    @Override
    public List<Usuario> Listar() {return usuarioServicelmpl.Listar();}
}
