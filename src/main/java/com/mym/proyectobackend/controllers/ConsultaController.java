package com.mym.proyectobackend.controllers;

import com.mym.proyectobackend.domain.entities.Consulta;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface ConsultaController {

    @GetMapping(value = "/consulta", produces = {"Application/json"})
    List<Consulta> Listar();
}
