/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Envio;
import Modelo.JefeBodega;
import Modelo.Repartidor;
import Modelo.RutaEntrega;
import Vista.PrincipalJB;
import Vista.ReporteEnvio;
import Vista.Ruta;

/**
 *
 * @author allis
 */
public class ControladorJefeBodega {        
    Envio e = new Envio();
    RutaEntrega re = new RutaEntrega();
    //JefeBodega jb = new JefeBodega();
    
    public void mostrarPrincipal() {
        PrincipalJB j = new PrincipalJB();
        j.setVisible(true);        
    }
    
    public void mostrarRutaEntrega() {
        Ruta r = new Ruta();
        r.setVisible(true);
    }
    
    public void mostrarReporteEnvio() {
        ReporteEnvio r2 = new ReporteEnvio();
        r2.setVisible(true);
    }        
    
    public void agregarProducto(String p, int c) {        
        e.agregarProducto(p, c);
    }
    
//    public void agregarPedido(String des, String dir) {
//        System.out.println("el pedido ha sido agregado: ");
//        System.out.println("Destino: "+des);
//        System.out.println("Direccion: "+dir);
//        System.out.println("Lista productos: "+ e.getListaProductos());
//    }      
//            
//    public void crearRuta() {
//        re.crearRuta();
//    }
//    
//    public void asignarRuta() {
//        re.asignarRuta();
//    }        
}
