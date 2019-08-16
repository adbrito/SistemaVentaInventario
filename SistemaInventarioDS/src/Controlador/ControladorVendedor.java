/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Venta;

/**
 *
 * @author allis
 */
public class ControladorVendedor {

    public ControladorVendedor(String user, char[] contraseña) {
        Venta venta = new Venta();
        //venta.show();
        venta.setVisible(true);
    }
}
