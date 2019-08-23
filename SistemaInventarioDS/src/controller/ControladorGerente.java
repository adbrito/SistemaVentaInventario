/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Busqueda;
import view.BusquedaCategoria1;
import view.BusquedaDescripcion1;
import view.BusquedaNombre1;
import view.PrincipalG;
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
        BusquedaNombre1 b = new BusquedaNombre1();
        b.setVisible(true);
    }

    public void mostrarBusquedaCat() {
        BusquedaCategoria1 b = new BusquedaCategoria1();
        b.setVisible(true);
    }

    public void mostrarBusquedaDescripcion() {
        BusquedaDescripcion1 b = new BusquedaDescripcion1();
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
