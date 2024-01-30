package com.aldea.com.aldea.DAO;

import java.util.List;

import com.aldea.com.aldea.ninja.Habilidad;
import com.aldea.com.aldea.ninja.HabilidadNinja;

public interface IDao<T, W, H, O> {

    W misionDisponiblePorId(long id);

    W misionCompletadasPorId(long id);

    List<Habilidad> misionesCompletadas();

    List<HabilidadNinja> todosNinjasHabilidades();

    void agregarNinja(T t);

    void actualizarMision(W w);

    void eliminarNinja(long id);

}
