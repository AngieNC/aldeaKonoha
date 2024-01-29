
package com.aldea.ninja;

import java.sql.Date;

public class MisionNinja {
    private long idNinja;
    private long idMision;
    private Date fechaInicio;
    private Date fechaFinal;
    private EstadoEnum estado;


    public long getIdNinja() {
        return idNinja;
    }
    public void setIdNinja(long idNinja) {
        this.idNinja = idNinja;
    }
    public long getIdMision() {
        return idMision;
    }
    public void setIdMision(long idMision) {
        this.idMision = idMision;
    }
    public Date getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public Date getFechaFinal() {
        return fechaFinal;
    }
    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
    public EstadoEnum getEstado() {
        return estado;
    }
    public void setEstado(EstadoEnum estado) {
        this.estado = estado;
    }   
}
