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
public class Repartidor extends Persona {

    protected String vehiculoAsig; //matricula del carro que se le asignara 
    protected RutaEntrega rutaAsig; //ruta que le asignara el jefe de bodega     
    protected boolean disponible; //disponible u ocupado para saber si puede ser parte de la cola
    protected float salario; //remuneracion calculada de acuerdo a la cantidad de envios exitosos

    public Repartidor(String vehiculoAsig, RutaEntrega rutaAsig, boolean disponible, float salario, String nombre, String apellido, String direccion, String telefono, String cedula) {
        super(nombre, apellido, direccion, telefono, cedula);
        this.vehiculoAsig = vehiculoAsig;
        this.rutaAsig = rutaAsig;
        this.disponible = disponible;
        this.salario = salario;
    }
//
//    public Repartidor(String nombre, String apellido, String direccion, String telefono, String cedula) {
//        super(nombre, apellido, direccion, telefono, cedula);
//        this.disponible = true; //empieza siendo disponible luego cuando lo utilicemos pasara a no estarlo y asi...
//        this.salario = 50;  //establecemos un salario inicial de 50 al que luego le adicionaremos segun la cantidad de envios que haya realizado con exito 
//    }
//              
    public String getVehiculoAsig() {
        return vehiculoAsig;
    }

    public void setVehiculoAsig(String vehiculoAsig) {
        this.vehiculoAsig = vehiculoAsig;
    }

    public RutaEntrega getRutaAsig() {
        return rutaAsig;
    }

    public void setRutaAsig(RutaEntrega rutaAsig) {
        this.rutaAsig = rutaAsig;
    }
           
    public boolean isDisponible() {
        return this.disponible;        
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
//        
//    public float calcularSalario(List<Envio> reporte) {
//        int c=0;
//        for (int i=0;i<reporte.size();i++) {
//            if (reporte.get(i).isFirmado()) 
//                c++;
//        }
//        return 50+c*50; //retornamos como salario total el valor inicial que establecimos sumado por $50 en cada envio exitoso (el numero puede cambiar)
//    }
//    
    
//    
//    public int getEntregasAsig() {
//        return entregasAsig;
//    }
//
//    public void setEntregasAsig(int entregasAsig) {
//        this.entregasAsig = entregasAsig;
//    }
//
//    public List<Envio> getPedidosAsign() {
//        return pedidosAsig;
//    }
//
//    public void setPedidosAsign(List<Envio> pedidosAsign) {
//        this.pedidosAsig = pedidosAsign;
//    }
//
//
//    
//    public void agregarEnvio(Envio envio) {
//        this.pedidosAsig.add(envio);        
//    }
//    
    
    
    /*
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
        }
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

    */


}
