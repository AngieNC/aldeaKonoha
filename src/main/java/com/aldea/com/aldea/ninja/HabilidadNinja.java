package com.aldea.com.aldea.ninja;

public class HabilidadNinja {

    private long ninjaId;
    private String nombreN;
    private NinjaRangoEnum rango;
    private long idAldea;
    private String nombreH;
    private String descripcion;
    private long id_ninja;

    public HabilidadNinja(String nombreN, String nombreH) {
        this.nombreN = nombreN;
        this.nombreH = nombreH;
    }

    public HabilidadNinja() {
    }

    public long getNinjaId() {
        return ninjaId;
    }

    public void setNinjaId(long ninjaId) {
        this.ninjaId = ninjaId;
    }

    public String getNombreN() {
        return nombreN;
    }

    public void setNombreN(String nombreN) {
        this.nombreN = nombreN;
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

    public String getNombreH() {
        return nombreH;
    }

    public void setNombreH(String nombreH) {
        this.nombreH = nombreH;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getId_ninja() {
        return id_ninja;
    }

    public void setId_ninja(long id_ninja) {
        this.id_ninja = id_ninja;
    }

}
