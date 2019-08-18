/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Busqueda;
import Vista.BusquedaCategoria;
import Vista.BusquedaDescripcion;
import Vista.BusquedaNombre;
import Vista.PrincipalG;
import javax.swing.JTable;

/**
 *
 * @author allis
 */
public class ControladorGerente {

    public void mostrarPrincipla() {
        PrincipalG g = new PrincipalG();
        g.setVisible(true);
    }
    
    
    public void mostrarBusquedaNombre() {
        BusquedaNombre b = new BusquedaNombre();
        b.setVisible(true);
    }

    public void mostrarBusquedaCat() {
        BusquedaCategoria b = new BusquedaCategoria();
        b.setVisible(true);
    }

    public void mostrarBusquedaDescripcion() {
        BusquedaDescripcion b = new BusquedaDescripcion();
        b.setVisible(true);
    }

    public void busquedaNombre(String nombre, JTable j) {
        Busqueda b = new Busqueda();
        b.busquedaNombre(nombre, j);
    }

    public void busquedaCat(String categoria, JTable j) {
        Busqueda b = new Busqueda();
        b.busquedaCategoria(categoria, j);
    }

    public void busquedaDescripcion(String descripcion, JTable j) {
        Busqueda b = new Busqueda();
        b.busquedaDescripcion(descripcion, j);
    }

}
