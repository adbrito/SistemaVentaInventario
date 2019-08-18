/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.print.attribute.HashAttributeSet;

/**
 *
 * @author allis
 */
public class Repartidor extends Empleado {

    protected boolean vehiculoAsig;
    protected int entregasAsig;
    protected List<Envio> envioAsign;
    protected HashMap<Repartidor, List<Envio>> listaPedido = new HashMap<>();

    ;

    public Repartidor(boolean vehiculoAsig, int entregasAsig, List<Envio> envioAsign, float sueldo, boolean estado, boolean tieneLocalAsignado, String numLocalAsignado, String nombre, String apellido, String direccion, String telefono, String cedula) {
        super(sueldo, estado, tieneLocalAsignado, numLocalAsignado, nombre, apellido, direccion, telefono, cedula);
        this.envioAsign = new ArrayList<>();
        this.vehiculoAsig = vehiculoAsig;
        this.entregasAsig = entregasAsig;
    }

    public boolean isVehiculoAsig() {
        return vehiculoAsig;
    }

    public void setVehiculoAsig(boolean vehiculoAsig) {
        this.vehiculoAsig = vehiculoAsig;
    }

    public int getEntregasAsig() {
        return entregasAsig;
    }

    public void setEntregasAsig(int entregasAsig) {
        this.entregasAsig = entregasAsig;
    }

    public List<Envio> getEnvioAsign() {
        return envioAsign;
    }

    public void setEnvioAsign(List<Envio> envioAsign) {
        this.envioAsign = envioAsign;
    }

    public void asignarPedido(Repartidor repartido, Envio envio) {
        Iterator it = listaPedido.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            if (repartido.equals(e.getKey())) {

            }
        }
        /*if (listaPedido.size() != 0) {
            for (HashMap.Entry<Repartidor, List<Envio>> r : listaPedido.entrySet()) {
                if (r.getKey().equals(repartido)) {
                    List<Envio> lista = r.getValue();
                    lista.add(envio);
                    r.setValue(lista);
                    
                }else{
                    
                }

            }
        }*/
    }

    public boolean buscarRepartidor(Repartidor repartidor) {
        Iterator it = listaPedido.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            if (e.getKey().equals(repartidor)) {
                return true;
            }
        }
        return false;
    }
}
