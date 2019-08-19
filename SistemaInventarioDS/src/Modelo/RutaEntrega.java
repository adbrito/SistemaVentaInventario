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
 * @author Usuario
 */
public class RutaEntrega {
    protected int entregasAsig; //cantidad de pedidos asignados en dicha ruta
    protected List<Envio> pedidosAsig; //lista de todos los pedidos asignados en una ruta
    
    public RutaEntrega() {
        this.entregasAsig = 0;
        this.pedidosAsig = new ArrayList<>();
    }
       
    public void agregarEnvio(Envio envio) {        
        this.pedidosAsig.add(envio);
        this.entregasAsig+=1;
    }        

    public int getEntregasAsig() {
        return entregasAsig;
    }

    public void setEntregasAsig(int entregasAsig) {
        this.entregasAsig = entregasAsig;
    }

    public List<Envio> getPedidosAsig() {
        return pedidosAsig;
    }

    public void setPedidosAsig(List<Envio> pedidosAsig) {
        this.pedidosAsig = pedidosAsig;
    }

    public void crearRuta() {
        
        System.out.println("ruta creada y repartidor escogido");
    }

    public void asignarRuta() {
        for(int i=0;i<this.entregasAsig;i++) {
            System.out.println(i+"° entrega: ");
            System.out.println(this.pedidosAsig.get(i));
        }        
    }
}
