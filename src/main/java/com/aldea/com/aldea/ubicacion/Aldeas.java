
package com.aldea.ubicacion;

public class Aldeas {
    
    private String nombreAldea;
    private long idNombreCiudad;

    public String getNombreAldea() {
        return nombreAldea;
    }
    public void setNombreAldea(String nombreAldea) {
        this.nombreAldea = nombreAldea;
    }
    public long getIdNombreCiudad() {
        return idNombreCiudad;
    }
    public void setIdNombreCiudad(long idNombreCiudad) {
        this.idNombreCiudad = idNombreCiudad;
    }
    @Override
    public String toString() {
        return "Aldea " + 
               "\n Con nombre: " + nombreAldea + 
               "\n de la Ciudad: " + idNombreCiudad;
    }
}
