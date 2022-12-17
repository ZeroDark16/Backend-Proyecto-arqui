package com.mym.proyectobackend.domain.services;

import com.mym.proyectobackend.domain.entities.Consulta;
import com.mym.proyectobackend.repositories.infraestructure.ConsultaJpaRepositorylmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaServicelmpl implements ConsultaService{

    @Autowired
    ConsultaJpaRepositorylmpl consultaJpaRepository;

    @Override
    public List<Consulta> Listar(){
        return consultaJpaRepository.Listar();
    }
}
