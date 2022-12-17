package com.mym.proyectobackend.controllers;

import com.mym.proyectobackend.domain.entities.Consulta;
import com.mym.proyectobackend.domain.services.ConsultaServicelmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsultaControllerlmpl implements ConsultaController{

    @Autowired
    ConsultaServicelmpl consultaServicelmpl;

    @Override
    public List<Consulta> Listar(){
        return consultaServicelmpl.Listar();
    }
}
