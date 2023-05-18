package com.softtek.ConsultaMedica.controller;

import com.softtek.ConsultaMedica.model.Medico;
import com.softtek.ConsultaMedica.service.IMedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/medicos")
public class MedicoController{
    @Autowired
    private IMedicoService service;
    @GetMapping("/listar")
    public Medico[] listar() throws Exception{
        return service.listar();
    }
}
