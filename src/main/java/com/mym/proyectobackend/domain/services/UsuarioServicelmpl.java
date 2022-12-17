package com.mym.proyectobackend.domain.services;

import com.mym.proyectobackend.domain.entities.Usuario;
import com.mym.proyectobackend.repositories.infraestructure.UsuarioJpaRepositorylmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicelmpl implements UsuarioService{

    @Autowired
    UsuarioJpaRepositorylmpl usuarioJpaRepositorylmpl;

    @Autowired
    public List<Usuario> Listar() {return usuarioJpaRepositorylmpl.Listar();}
}
