
package com.aldea.com.aldea.ninja;

public enum EstadoEnum {
    DISPONIBLE("disponible"),
    COMPLETADA("completada");

    private String estado;

    private EstadoEnum(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
