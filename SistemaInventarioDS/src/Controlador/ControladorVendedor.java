/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Busqueda;
import Modelo.Cliente;
import Vista.BusquedaCategoria;
import Vista.BusquedaDescripcion;
import Vista.BusquedaNombre;
import Vista.PrincipalV;
import Vista.RegistrarUser;
import Vista.Venta;
import com.mysql.jdbc.Connection;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
