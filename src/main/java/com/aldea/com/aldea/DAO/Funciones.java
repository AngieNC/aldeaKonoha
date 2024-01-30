package com.aldea.com.aldea.DAO;

import java.util.List;

import com.aldea.com.aldea.Funcionalidades;
import com.aldea.com.aldea.ninja.Habilidad;
import com.aldea.com.aldea.ninja.HabilidadNinja;
import com.aldea.com.aldea.ninja.Mision;

public class Funciones {
    
    private static Funcionalidades funciones = new Funcionalidades();

    public static Mision misionDisponiblePorId(long id){
        return funciones.misionDisponiblePorId(id);
    }

    public static Mision misionCompletadasPorId(long id){
        return funciones.misionCompletadasPorId(id);
    }

    public static List<HabilidadNinja> todosNinjasHabilidades(){
        return funciones.todosNinjasHabilidades();
    }

    public static List<Habilidad> misionesCompletadas(){
        return funciones.misionesCompletadas();
    }

}
