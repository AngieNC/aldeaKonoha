package com.aldea.com.aldea.builders;

import com.aldea.com.aldea.ninja.Mision;

public class OficialMisiones implements CrearMisiones{

    private Mision mision = new Mision();

    @Override
        public CrearMisiones misionId(long misionId) {
            mision.setMisionId(misionId);
            return this;
    }

    @Override
    public CrearMisiones descripcion(String descripcion) {
        mision.setDescripcion(descripcion);
        return this;
    }

    @Override
    public CrearMisiones rango(int rango) {
        mision.setRango(rango);
        return this;
    }

    @Override
    public CrearMisiones recompensa(double recompensa) {
        mision.setRecompensa(recompensa);
        return this;
    }

    @Override
    public Mision build() {
        return mision;
    }
}
