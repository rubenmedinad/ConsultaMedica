package com.softtek.ConsultaMedica.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Medico {
    private int idMedico;
    private String dni;
    private String nombre;
    private int edad;

}
