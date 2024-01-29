package com.aldea.DAO;

import java.util.stream.Stream;

import com.aldea.Funcionalidades;
import com.aldea.ninja.Habilidad;
import com.aldea.ninja.Mision;

public class Funciones {
    
    private static Funcionalidades funciones = new Funcionalidades();

    public static Mision misionDisponiblePorId(long id){
        return funciones.misionDisponiblePorId(id);
    }

    public static Mision misionCompletadasPorId(long id){
        return funciones.misionCompletadasPorId(id);
    }

    public static Stream<Habilidad> todosNinjasHabilidades(){
        return funciones.todosNinjasHabilidades();
    }

    public static Stream<Habilidad> misionesCompletadas(){
        return funciones.misionesCompletadas();
    }

}
