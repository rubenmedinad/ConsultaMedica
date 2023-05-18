package com.softtek.ConsultaMedica.service;

import com.softtek.ConsultaMedica.model.Medico;
import com.softtek.ConsultaMedica.repository.IMedicoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class MedicoService implements IMedicoService{
    @Autowired
    private IMedicoRepo repo;
    @Override
    public Medico[] listar() {
        return repo.listar();
    }
}
