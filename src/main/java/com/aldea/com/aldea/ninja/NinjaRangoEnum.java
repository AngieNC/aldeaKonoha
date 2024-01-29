
package com.aldea.ninja;

public enum NinjaRangoEnum {
        BAJO("bajo"),
        MEDIO ("medio"),
        SUPERIOR("superior");

        private String estado;

        private NinjaRangoEnum(String estado) {
            this.estado = estado;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }
}
    