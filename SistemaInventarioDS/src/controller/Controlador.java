/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.ValidaUsuario;
import Vista.Login;
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
            
            switch (rol.toUpperCase()) {
                case "VENDEDOR":
                    
                    ControladorVendedor V = new ControladorVendedor();
                    V.mostrarPrincipal();
                    break;
                case "GERENTE":
                    
                    ControladorGerente g = new ControladorGerente();
                    g.mostrarPrincipla();
                    break;
                case "JEFE_BODEGA":
                    
                    ControladorJefeBodega JB = new ControladorJefeBodega();
                    
                    break;
            }
        } catch (Exception ex) {
            System.out.println("Error: "+ ex);
            JOptionPane.showMessageDialog(null, "Usuario no existe o no se ha encontrado", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

}
