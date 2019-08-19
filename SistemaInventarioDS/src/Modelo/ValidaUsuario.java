/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author allis
 */
public class ValidaUsuario {

    public String validar(String user, char[] contraseña) {
        try {
            String convPas = new String(contraseña);
            ConexionBD con = new ConexionBD();
            Connection conection = con.abrirConexion();
            String query = "select id_empleado from usuario where username ='" + user + "'and password='" + convPas + "';";
            Statement consulta = conection.createStatement();
            System.out.println(query);
            
            ResultSet rs = consulta.executeQuery(query);
            System.out.println("rs.next : "+rs.next());
            System.out.println("con el get de rs: " + rs.getString(1));
  //          System.out.println("con el get de rs del rol: " + rs.getString("rol"));
//            String rol = rs.getString(1);
            while(!rs.wasNull()) {
                System.out.println("dentro del while "+rs.getString(1));
                switch (rs.getString(1).toUpperCase()) {
                    case "VENDEDOR":
                        System.out.println("entró al vendedor");
                        return rs.getString(1).toUpperCase();
                    case "JEFE_BODEGA":
                        return rs.getString(1).toUpperCase();
                    case "GERENTE":
                        return rs.getString(1).toUpperCase();
                }
            }
        } catch (SQLException ex1) {
            System.out.println("(Error al validar el ingreso de usuario " + user + " con el siguiente error: " + ex1);
            System.out.println("Sus credenciales no existen o son incorectas");

            //Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex1);
            return null;

        }

        return null;
    }

}
