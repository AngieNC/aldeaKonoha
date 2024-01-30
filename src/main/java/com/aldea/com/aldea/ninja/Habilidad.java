
package com.aldea.com.aldea.ninja;

public class Habilidad {

    //private long habilidadId;
    private String nombre;
    private String descripcion;
    private long id_ninja;

    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public long getIdNinja() {
        return id_ninja;
    }
    public void setIdNinja(long id_ninja) {
        this.id_ninja = id_ninja;
    }

    @Override
    public String toString() {
        return "La habilidad " + 
                "\n Es: " + nombre + 
                "\n Con descripcion: " + descripcion + 
                "\n E ninja asignado: " + id_ninja;
    }
}
