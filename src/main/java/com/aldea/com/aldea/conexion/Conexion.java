
package com.aldea.conexion;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static String url = "";
    private static String user = "";
    private static String password = "";
    public static Connection conex = null;

    public static Connection MYSQLConnection(){
        url = "jdbc:mysql://localhost:3306/naruto_AngieCardenas";
        user = "root";
        password = "";
        return getConnection (url, user, password);
    }

    private static Connection getConnection(String url, String user, String password){
        try {
            conex = DriverManager.getConnection(url, user, password);
            if (conex != null){
                DatabaseMetaData DBmeta = conex.getMetaData();
                System.out.println("Ya la conexión se realizó: " + DBmeta.getDriverName());
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conex;
    }
}
