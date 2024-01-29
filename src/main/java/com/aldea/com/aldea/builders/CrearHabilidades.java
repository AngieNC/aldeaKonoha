package com.aldea.builders;

import com.aldea.ninja.Habilidad;

public interface CrearHabilidades {

    CrearHabilidades nombre(String nombre);
    CrearHabilidades descripcion(String descripcion);
    CrearHabilidades idNinja(long idNinja);
    Habilidad build();
    
}
