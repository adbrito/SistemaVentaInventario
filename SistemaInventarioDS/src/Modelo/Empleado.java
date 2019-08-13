/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author allis
 */
public class Empleado extends Persona{
    protected float sueldo;
    protected boolean estado, tieneLocalAsignado;
    protected String numLocalAsignado;
    
    public Empleado(String nombre, String apellido, String direccion, String telefono, String cedula) {
        super(nombre, apellido, direccion, telefono, cedula);
    }

    public Empleado(float sueldo, boolean estado, boolean tieneLocalAsignado, String numLocalAsignado, String nombre, String apellido, String direccion, String telefono, String cedula) {
        super(nombre, apellido, direccion, telefono, cedula);
        this.sueldo = sueldo;
        this.estado = estado;
        this.tieneLocalAsignado = tieneLocalAsignado;
        this.numLocalAsignado = numLocalAsignado;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isTieneLocalAsignado() {
        return tieneLocalAsignado;
    }

    public void setTieneLocalAsignado(boolean tieneLocalAsignado) {
        this.tieneLocalAsignado = tieneLocalAsignado;
    }

    public String getNumLocalAsignado() {
        return numLocalAsignado;
    }

    public void setNumLocalAsignado(String numLocalAsignado) {
        this.numLocalAsignado = numLocalAsignado;
    }
    
}
