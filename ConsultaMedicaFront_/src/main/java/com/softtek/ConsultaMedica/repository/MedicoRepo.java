package com.softtek.ConsultaMedica.repository;


import com.softtek.ConsultaMedica.model.Medico;
import org.springframework.stereotype.Repository;

@Repository
public class MedicoRepo implements IMedicoRepo {
    @Override
    public Medico[] listar() {
        Medico[] medicos = {new Medico(1, "12345678", "Juan", 30),
                new Medico(2, "87654321", "Pedro", 40),
                new Medico(3, "12345678", "Maria", 50),
                new Medico(4, "87654321", "Jose", 60),
                new Medico(5, "12345678", "Luis", 70),
                new Medico(6, "87654321", "Ana", 80),
                new Medico(7, "12345678", "Rosa", 90)};
        return medicos;
    }
}
