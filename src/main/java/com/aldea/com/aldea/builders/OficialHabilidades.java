package com.aldea.builders;

import com.aldea.ninja.Habilidad;

public class OficialHabilidades implements CrearHabilidades{

    private Habilidad habilidad = new Habilidad();

    @Override
    public CrearHabilidades nombre(String nombre) {
        habilidad.setNombre(nombre);
        return this;
    }

    @Override
    public CrearHabilidades descripcion(String descripcion) {
        habilidad.setDescripcion(descripcion);
        return this;
    }

    @Override
    public CrearHabilidades idNinja(long idNinja) {
        habilidad.setIdNinja(idNinja);
        return this;
    }

    @Override
    public Habilidad build() {
        return habilidad;
    }
    
}
