/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ValidaUsuario;
import Vista.Login;
import Vista.Venta;

/**
 *
 * @author allis
 */
public class Controlador {

    protected Login login;
    protected ValidaUsuario validaUser = new ValidaUsuario();

    public Controlador(String user, char[] contraseña) {
        manejaControlador(user, contraseña);
    }

    public void manejaControlador(String user, char[] contraseña) {
        boolean rol = validaUser.validar(user);
        System.out.println(rol);
        System.out.println("rol: " + rol);
        System.out.println("antes del switch");
        if (rol) {
            switch (user) {
                case "Vendedor":
                    System.out.println("dentro del switch");
                    ControladorVendedor V= new ControladorVendedor();
                    V.mostrarPrincipal();
                    
                    
            }
        }
    }
}
