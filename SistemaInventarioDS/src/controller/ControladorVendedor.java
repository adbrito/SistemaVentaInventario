/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Busqueda;
import model.Cliente;
import view.BusquedaCategoria;
import view.BusquedaDescripcion;
import view.BusquedaNombre;
import view.PrincipalV;
import view.RegistrarUser;
import view.Venta;
import javax.swing.JTable;

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

    public void mostrarPrincipal() {
        PrincipalV p = new PrincipalV();
        p.setVisible(true);
    }

    public void mostrarRegistroCliente() {
        RegistrarUser r = new RegistrarUser();
        r.setVisible(true);
    }

    public void mostrarVenta() {
        Venta venta = new Venta();
        venta.setVisible(true);
    }

    public void registroCliente(Cliente c) {
        c.insertQuery(c);
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
