package com.aldea.com.aldea.builders;

import com.aldea.com.aldea.ninja.Habilidad;

public interface CrearHabilidades {
    //CrearHabilidades habilidadId(long habilidadId);
    CrearHabilidades nombre(String nombre);
    CrearHabilidades descripcion(String descripcion);
    CrearHabilidades id_ninja(long id_ninja);
    Habilidad build();
    
}
