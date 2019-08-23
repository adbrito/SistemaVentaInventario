/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author allis
 */
public class Local {
    protected int numLocal;
    protected String descripcion, ciudad, direccion;
    protected boolean esMatriz,esSucursal,esBodega;

    public Local(int numLocal, String descripcion, String ciudad, String direccion, boolean esMatriz, boolean esSucursal, boolean esBodega) {
        this.numLocal = numLocal;
        this.descripcion = descripcion;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.esMatriz = esMatriz;
        this.esSucursal = esSucursal;
        this.esBodega = esBodega;
    }

    public int getNumLocal() {
        return numLocal;
    }

    public void setNumLocal(int numLocal) {
        this.numLocal = numLocal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isEsMatriz() {
        return esMatriz;
    }

    public void setEsMatriz(boolean esMatriz) {
        this.esMatriz = esMatriz;
    }

    public boolean isEsSucursal() {
        return esSucursal;
    }

    public void setEsSucursal(boolean esSucursal) {
        this.esSucursal = esSucursal;
    }

    public boolean isEsBodega() {
        return esBodega;
    }

    public void setEsBodega(boolean esBodega) {
        this.esBodega = esBodega;
    }
    
}
