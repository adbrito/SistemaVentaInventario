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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author allis
 */
public class Busqueda implements IBusqueda {

    @Override
    public void busquedaCategoria(String categoria, JTable table) {

        try {
            LinkedList<Producto> lista = new LinkedList<Producto>();
            DefaultTableModel tm = new DefaultTableModel();
            tm.setColumnCount(8);
            table.setModel(tm);
            ConexionBD con = new ConexionBD();
            Connection conection = con.abrirConexion();
            String query = "SELECT * FROM PRODUCTO WHERE nombre like '%" + categoria + "%';";
            Statement consulta = conection.createStatement();
            System.out.println(query);
            ResultSet rs = consulta.executeQuery(query);
            System.out.println("el rs.next: " + rs.next());
            System.out.println("antes del while");
            while (!rs.wasNull()) {
                System.out.println("sout dentro del while: 1 ---->" + rs.getInt(1));
                int cod = rs.getInt(1);
                System.out.println("sout dentro del while:2 " + rs.getString(2));
                String nombre = rs.getString(2);
                System.out.println("sout dentro del while: 3" + rs.getString(3));
                String descripcion = rs.getString(3);
                int cantExist = rs.getInt(4);
                System.out.println("sout dentro del while: 4" + rs.getInt(4));
                String cat = rs.getString(5);
                System.out.println("sout dentro del while: 5" + rs.getString(5));
                float precioAlXMayor = rs.getFloat(6);
                float precio = rs.getFloat(7);
                char estado = rs.getString(8).charAt(0);
                Producto p = new Producto(cod, nombre, descripcion, cat, estado, precioAlXMayor, precio, cantExist);
                System.out.println(p.toString());
                lista.add(p);
                if (!rs.next()) {
                    break;
                }

            }
            for (int i = 0; i < lista.size(); i++) {
                Object[] row = {lista.get(i).getCodigo(), lista.get(i).getNombre(), lista.get(i).getDescripcion(), lista.get(i).getCategoria(), lista.get(i).getCantExist(), lista.get(i).getPrecioAlXMayor(), lista.get(i).getPrecio(), lista.get(i).getEstado()};
                tm.addRow(row);
                System.out.println("entra al for");            table.setModel(tm);

            }


            // consulta = conexion.prepareStatement("UPDATE " + this.tabla + " SET titulo = ?, descripcion = ?, nivel_de_prioridad = ? WHERE id_tarea = ?");
        } catch (SQLException ex) {
            Logger.getLogger(Busqueda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void busquedaNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void busquedaDescripcion(String descripcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
