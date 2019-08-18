/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Arrays;

/**
 *
 * @author allis
 */
public class ValidaUsuario {

    


    public boolean validar(String user, char[] contraseña) {
        String convPas  = new String(contraseña);
        System.out.println(convPas);
        System.out.println(user);
        switch (user) {
            case "Vendedor":

                System.out.println("entró al vendedor");
                return true;
            default:
                return true;
        }
    }

}
