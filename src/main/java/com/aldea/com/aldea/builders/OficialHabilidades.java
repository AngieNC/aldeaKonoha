package com.aldea.com.aldea.builders;

import com.aldea.com.aldea.ninja.Habilidad;

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
    public CrearHabilidades id_ninja(long id_ninja) {
        habilidad.setIdNinja(id_ninja);
        return this;
    }

    @Override
    public Habilidad build() {
        return habilidad;
    }
    /*
    @Override
    public CrearHabilidades habilidadId(long habilidadId) {
        habilidad.setHabilidadId(habilidadId);
        return this;
    }
    */   
}
