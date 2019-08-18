/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ValidaUsuario;
import Vista.Login;
import Vista.Venta;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author allis
 */
public class Controlador {

    protected Login login;
    protected ValidaUsuario validaUser = new ValidaUsuario();

    public Controlador(String user, char[] contraseña, JFrame f) {
        manejaControlador(user, contraseña, f);
    }

    public void manejaControlador(String user, char[] contraseña, JFrame f) {
        try {
            String rol = validaUser.validar(user, contraseña);
            System.out.println(rol);
            System.out.println("rol: " + rol);
            System.out.println("antes del switch");
            switch (rol.toUpperCase()) {
                case "VENDEDOR":
                    System.out.println("Bienvenido vendedor");
                    ControladorVendedor V = new ControladorVendedor();
                    
                    V.mostrarPrincipal();
                    break;
                case "GERENTE":
                    System.out.println("Bienvenido GERENTE");
                    ControladorGerente g = new ControladorGerente();
                    g.mostrarPrincipla();
                    break;
            }
        } catch (Exception ex) {
            System.out.println("Error: "+ ex);
            
            JOptionPane.showMessageDialog(null, "Usuario no existe o no encontrado", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

}
