/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author allis
 */
public class JefeBodega extends Empleado{
    
    protected Queue<Repartidor> colaRep;
    
    public JefeBodega(String nombre, String apellido, String direccion, String telefono, String cedula) {
        super(nombre, apellido, direccion, telefono, cedula);
        colaRep = new LinkedList<>();
    }
        
//    public Repartidor seleccionarRepartidor() {        
//        Repartidor rep = this.colaRep.poll();
//        rep.setDisponible(false);
//        return rep;
//    }
//    
//    public void liberarRepartidor(Repartidor r) {
//        r.setDisponible(true);
//        this.colaRep.offer(r);
//    }
//    
    //public void crearRutaEntrega(List<Envio)
    
////    public void asignarRuta(Repartidor rep, RutaEntrega ruta) {
////        rep.setRutaAsig(ruta);
////        rep.setDisponible(false);
////    }
    
    /*
    public void asignarRutaEntrega(Repartidor rep, List<Envio> pedidos) {        
        RutaEntrega ruta = new RutaEntrega();
        for (int i=0;i<pedidos.size();i++) {
            ruta.agregarEnvio(pedidos.get(i));            
        }
        rep.setRutaAsig(ruta);
        rep.setDisponible(false);
    }
*/
    
//    public void recibirReporte(Repartidor rep, List<Envio> reporte) {
//        for (int i=0;i<reporte.size();i++) {
//            Envio e = reporte.get(i);
//            if (!e.isFirmado()) {
//                e.setMsg("El envio no fue realizado con exito");
//            }else{ e.setMsg("El envio fue realizado con exito");}
//            rep.setDisponible(true);
//            liberarRepartidor(rep);        
//        }
//    }    
}
