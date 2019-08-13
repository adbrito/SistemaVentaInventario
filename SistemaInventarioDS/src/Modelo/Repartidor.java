/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author allis
 */
public class Repartidor extends Empleado{
    protected boolean vehiculoAsig;
    protected int entregasAsig;
    protected List<Envio> envioAsign;;

    public Repartidor(boolean vehiculoAsig, int entregasAsig, List<Envio> envioAsign, float sueldo, boolean estado, boolean tieneLocalAsignado, String numLocalAsignado, String nombre, String apellido, String direccion, String telefono, String cedula) {
        super(sueldo, estado, tieneLocalAsignado, numLocalAsignado, nombre, apellido, direccion, telefono, cedula);
        this.envioAsign = new ArrayList<>();
        this.vehiculoAsig = vehiculoAsig;
        this.entregasAsig = entregasAsig;
    }
    
    
}
