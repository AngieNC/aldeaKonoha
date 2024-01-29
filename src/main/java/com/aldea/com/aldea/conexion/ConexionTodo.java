package com.aldea.conexion;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexionTodo {

    public static Connection conex;
    public static Statement st = null;
    public static ResultSet rs = null;

    public static Connection getConnection(){
        return conex;
    }

    public static Connection setConnection(Connection conexion){
        ConexionTodo.conex = conexion;
        return conexion;
    }

    public static void cerrarConexion(Connection conex){
        if (conex != null){
            try {
                conex.close();
            } catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static ResultSet query_db(PreparedStatement info){
        try {
            rs = info.executeQuery();
        } catch (SQLException | RuntimeException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return null;
    }

    public static int anadirNinja(PreparedStatement info){
        int comprobar;

        try {
            comprobar = info.executeUpdate();
        } catch (SQLException | RuntimeException e) {
            System.out.println("ERROR: " + e.getMessage());
            return 0;
        }
        return comprobar;
    }

    public static void cerrarConexion(){
        cerrarConexion(conex);
    }  

    public static boolean commitBD() {
        try {
            conex.commit();
            return true;
        } catch (SQLException e) {
            System.out.println("Error en comit " + e.getMessage());
            return false;
        }
    }

    public static boolean rollbackBD() {
        try {
            conex.rollback();
            return true;
        } catch (SQLException e) {
            System.out.println("Error en volver " + e.getMessage());
            return false;
        }
    }

    public static boolean setAutoCommitBD(boolean param) {
        try {
            conex.setAutoCommit(param);
        } catch (SQLException e) {
            System.out.println("Error en configurar comit " + e.getMessage());
            return false;
        }
        return true;
    }
}   

