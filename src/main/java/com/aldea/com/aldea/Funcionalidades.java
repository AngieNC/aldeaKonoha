package com.aldea;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.aldea.DAO.IDao;
import com.aldea.builders.CrearHabilidades;
import com.aldea.builders.CrearMisiones;
import com.aldea.builders.OficialHabilidades;
import com.aldea.builders.OficialMisiones;
import com.aldea.conexion.Conexion;
import com.aldea.conexion.ConexionTodo;
import com.aldea.ninja.Habilidad;
import com.aldea.ninja.Mision;
import com.aldea.ninja.Ninja;

public class Funcionalidades implements IDao<Ninja, Mision, Habilidad>{

    @Override
    public Mision misionDisponiblePorId(long id) {

        ConexionTodo.setConnection(Conexion.MYSQLConnection());
        String stm = "SELECT * FROM Mision m JOIN MisionNinja mn ON m.id = mn.id_mision WHERE mn.id_ninja = ? AND mn.estado = 'disponible';";

        try (PreparedStatement ps = ConexionTodo.getConnection().prepareStatement(stm)){
            ps.setLong(1, id);
            ResultSet rs = ConexionTodo.query_db(ps);
            if(rs.next()){
                CrearMisiones misiones = new OficialMisiones();
                Mision misionesVer = misiones

                    .misionId(rs.getLong("misionId"))
                    .descripcion(rs.getString("descripcion"))
                    .rango(rs.getInt("rango"))
                    .recompensa(rs.getDouble("recompensa"))
                    .build();
                return misionesVer;
            } else {
                System.out.println("Error, this id wasn't founded");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Mision misionCompletadasPorId(long id) {
        ConexionTodo.setConnection(Conexion.MYSQLConnection());
        String stm = "SELECT * FROM Mision m JOIN MisionNinja mn ON m.id = mn.id_mision WHERE mn.id_ninja = ? AND mn.estado = 'completada';";

        try (PreparedStatement ps = ConexionTodo.getConnection().prepareStatement(stm)){
            ps.setLong(1, id);
            ResultSet rs = ConexionTodo.query_db(ps);
            if(rs.next()){
                CrearMisiones misiones = new OficialMisiones();
                Mision misionesVer = misiones

                    .misionId(rs.getLong("misionId"))
                    .descripcion(rs.getString("descripcion"))
                    .rango(rs.getInt("rango"))
                    .recompensa(rs.getDouble("recompensa"))
                    .build();
                return misionesVer;
            } else {
                System.out.println("Error, this id wasn't founded");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Stream<Habilidad> todosNinjasHabilidades() {
        List<Habilidad> todo = new ArrayList<>();
        Stream<Habilidad> todo2 = todo.stream();

        ConexionTodo.setConnection(Conexion.MYSQLConnection());
        String stm = "SELECT n.nombre AS Nombre_ninja, h.nombre AS Nombre_habilidad FROM Habilidad h JOIN Ninja n ON n.id = h.id_ninja;";

        try (PreparedStatement ps = ConexionTodo.getConnection().prepareStatement(stm)){
            ResultSet rs = ConexionTodo.query_db(ps);
            while (rs.next()) {
                CrearHabilidades habilidades = new OficialHabilidades();
                Habilidad habilidad = habilidades
                    .nombre(rs.getString("nombre"))
                    .descripcion(rs.getString("descripcion"))
                    .idNinja(rs.getLong("idNinja"))
                    .build();
                todo.add(habilidad);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return todo2;
    }

    @Override
    public void agregarNinja(Ninja t) {

        
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregarNinja'");
    }

    @Override
    public void actualizarMision(Mision t) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarMision'");
    }

    @Override
    public void eliminarNinja(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarNinja'");
    }

    @Override
    public Stream<Habilidad> misionesCompletadas() {

        List<Habilidad> misiones = new ArrayList<>();
        Stream<Habilidad> misiones2 = misiones.stream();

        ConexionTodo.setConnection(Conexion.MYSQLConnection());
        String stm = "SELECT * FROM Mision m JOIN MisionNinja mn ON m.id = mn.id_mision WHERE mn.estado = 'completada';";

        try (PreparedStatement ps = ConexionTodo.getConnection().prepareStatement(stm)){
            ResultSet rs = ConexionTodo.query_db(ps);
            while (rs.next()) {
                CrearHabilidades habilidades = new OficialHabilidades();
                Habilidad habilidad = habilidades
                    .nombre(rs.getString("nombre"))
                    .descripcion(rs.getString("descripcion"))
                    .idNinja(rs.getLong("idNinja"))
                    .build();
                misiones.add(habilidad);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return misiones2;
    }

    
    
}
