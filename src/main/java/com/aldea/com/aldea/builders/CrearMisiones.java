package com.aldea.builders;

import com.aldea.ninja.Mision;

public interface CrearMisiones {
    
    CrearMisiones misionId(long misionId);
    CrearMisiones descripcion(String descripcion);
    CrearMisiones rango(int rango);
    CrearMisiones recompensa(double recompensa); 
    Mision build();
}
