
package com.aldea.com.aldea.ninja;

public class Ninja {

    private long ninjaId;
    private String nombre;
    private NinjaRangoEnum rango;
    private long idAldea;

    public long getNinjaId() {
        return ninjaId;
    }
    public void setNinjaId(long ninjaId) {
        this.ninjaId = ninjaId;
    }  
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public NinjaRangoEnum getRango() {
        return rango;
    }
    public void setRango(NinjaRangoEnum rango) {
        this.rango = rango;
    }
    public long getIdAldea() {
        return idAldea;
    }
    public void setIdAldea(long idAldea) {
        this.idAldea = idAldea;
    }
    @Override
    public String toString() {
        return "El nombre del ninja " + 
                "\n Es: " + nombre + 
                "\n Con rango: " + rango + 
                "\n Y pertenece a la aldea: " + idAldea;
    }
    
}