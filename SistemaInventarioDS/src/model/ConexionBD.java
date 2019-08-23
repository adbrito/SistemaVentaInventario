/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.mysql.jdbc.Connection;
import java.sql.*;

/**
 *
 * @author allis
 */
public class ConexionBD {

    private Connection cnx;
  //  private final String pass  = "test";

    public Connection abrirConexion() {

        try {
           // cnx = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:9000/dbinventario", "root", pass);
           cnx = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbinventario", "root", "1234");
            return cnx;
        } catch (SQLException ex) {
            System.out.println("error en clase catch conexion" + ex);
        }
        return null;
    }

    public void cerrarConexion() throws SQLException {
        if (cnx != null) {
            System.out.println("se cerró");
            cnx.close();
        }
    }
}
