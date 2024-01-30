package com.aldea.com.aldea.builders;

import com.aldea.com.aldea.ninja.Ninja;

public interface CrearNinjas {

    CrearNinjas ninjaId(long ninjaId);
    CrearNinjas nombre(String nombre);
    CrearNinjas rango(String NinjaRangoEnum);
    CrearNinjas idAldea(long idAldea);
    Ninja build();   
}
