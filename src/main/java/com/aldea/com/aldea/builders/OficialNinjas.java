package com.aldea.builders;

import com.aldea.ninja.Ninja;
import com.aldea.ninja.NinjaRangoEnum;

public class OficialNinjas implements CrearNinjas{

    private Ninja ninja = new Ninja();

    @Override
    public CrearNinjas ninjaId(long ninjaId) {
        ninja.setNinjaId(ninjaId);
        return this;
    }

    @Override
    public CrearNinjas nombre(String nombre) {
        ninja.setNombre(nombre);
        return this;
    }

    @Override
    public CrearNinjas rango(String ninjaRangoEnum) {
        if (ninjaRangoEnum.equalsIgnoreCase("bajo")){
            ninja.setRango(NinjaRangoEnum.BAJO);
        } else if (ninjaRangoEnum.equalsIgnoreCase("medio")){
            ninja.setRango(NinjaRangoEnum.MEDIO);
        } else if (ninjaRangoEnum.equalsIgnoreCase("superior")){
            ninja.setRango(NinjaRangoEnum.SUPERIOR);
        } 
        return this;
    }

    @Override
    public CrearNinjas idAldea(long idAldea) {
        ninja.setIdAldea(idAldea);
        return this;
    }

    @Override
    public Ninja build() {
        return ninja;
    }
    
}
