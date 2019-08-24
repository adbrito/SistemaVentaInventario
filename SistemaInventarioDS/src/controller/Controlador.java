/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.ValidaUsuario;
import view.Login;
import javax.swing.JOptionPane;

/**
 *
 * @author allis
 */
public final class Controlador {

    protected Login login;
    protected ValidaUsuario validaUser = new ValidaUsuario();

    public Controlador(String user, char[] pass) {
        manejaControlador(user, pass);
    }

    public void manejaControlador(String user, char[] pass) {
        try {
            String rol = validaUser.validar(user, pass);
            
            switch (rol.toUpperCase()) {
                case "VENDEDOR":
                    
                    ControladorVendedor v = new ControladorVendedor();
                    v.mostrarPrincipal();
                    break;
                case "GERENTE":
                    
                    ControladorGerente g = new ControladorGerente();
                    g.mostrarPrincipla();
                    break;
                case "JEFE_BODEGA":
                    
                    ControladorJefeBodega jb = new ControladorJefeBodega();
                    jb.mostrarPrincipal();
                    break;
            }
        } catch (Exception ex) {
            System.out.println("Error: "+ ex);
            JOptionPane.showMessageDialog(null, "Usuario no existe o no se ha encontrado", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

}
