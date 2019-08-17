/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.mysql.jdbc.Connection;
import java.sql.*;

/**
 *
 * @author allis
 */
public class ConexionBD {

    private Connection cnx = null;

    public Connection abrirConexion() {
        if (cnx == null) {
            System.out.println("if de conexionbd");
            try {
                Connection cnx = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbinventario", "root", "1234");
                System.out.println("calse conexionbd try"+cnx);
                System.out.println("se conectó");
                return cnx;
            } catch (SQLException ex) {
                System.out.println("error en clase catch conexion"+ex);
            }
        }
        return cnx;
    }

    public void cerrarConexion() throws SQLException {
        if (cnx != null) {
            System.out.println("se cerró");
            cnx.close();
        }
    }
}
