package com.aldea.DAO;

import java.util.stream.Stream;

public interface IDao<T, W, H> {

    W misionDisponiblePorId(long id);

    W misionCompletadasPorId(long id);

    Stream<H> misionesCompletadas();

    Stream<H> todosNinjasHabilidades();

    void agregarNinja(T t);

    void actualizarMision(W w);

    void eliminarNinja(long id);

}
