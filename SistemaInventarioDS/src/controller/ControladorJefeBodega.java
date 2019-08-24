/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Envio;
import model.RutaEntrega;
import view.PrincipalJB;
import view.ReporteEnvio;
import view.Ruta;

/**
 *
 * @author allis
 */
public class ControladorJefeBodega {        
    Envio e = new Envio();
    RutaEntrega re = new RutaEntrega();
    
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
                
    public void crearRuta() {
        re.crearRuta();
    }
    
    public void asignarRuta() {
        re.asignarRuta();
    }        
}
