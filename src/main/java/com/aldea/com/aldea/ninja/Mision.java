
package com.aldea.com.aldea.ninja;

public class Mision {

    private long misionId;
    private String descripcion;
    private int rango;
    private double recompensa;

    public long getMisionId() {
        return misionId;
    }
    public void setMisionId(long misionId) {
        this.misionId = misionId;
    } 
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getRango() {
        return rango;
    }
    public void setRango(int rango) {
        this.rango = rango;
    }
    public double getRecompensa() {
        return recompensa;
    }
    public void setRecompensa(double recompensa) {
        this.recompensa = recompensa;
    }
    @Override
    public String toString() {
        return "Mision" + 
                "\n Es: " + descripcion + 
                "\n Su rango es: " + rango + 
                "\n Su recompensa es: " + recompensa;
    }
    
}
