/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Vista.Principal;
import Vista.RegistrarUser;
import Vista.Venta;
import com.mysql.jdbc.Connection;

/**
 *
 * @author allis
 */
public class ControladorVendedor {
    protected Cliente c;

    public ControladorVendedor() {
        
      /*  Venta venta = new Venta();
        //venta.show();
        venta.setVisible(true);*/
    }
    
    public void mostrarPrincipal(){
        Principal p = new Principal();
        p.setVisible(true);
    }
    
    public void mostrarRegistroCliente(){
        RegistrarUser r = new RegistrarUser();
        r.setVisible(true);
    }
    public void mostrarVenta(){
        Venta venta = new Venta();
        venta.setVisible(true);
    }
    public void registroCliente(Cliente c){
        c.insertQuery(c);
    }
    
}
