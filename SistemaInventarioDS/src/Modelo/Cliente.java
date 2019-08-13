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
public class Cliente extends Persona{
    protected String formaPago;
    protected boolean estado;

    public Cliente(String formaPago, boolean estado, String nombre, String apellido, String direccion, String telefono, String cedula) {
        super(nombre, apellido, direccion, telefono, cedula);
        this.formaPago = formaPago;
        this.estado = estado;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
