/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
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
    public void busquedaNombre(String name, JTable table) {

        try {
            LinkedList<Producto> lista = new LinkedList<>();
            DefaultTableModel tm = new DefaultTableModel();
            tm.setColumnCount(8);
            ConexionBD con = new ConexionBD();
            Connection conection = con.abrirConexion();
            String query = "SELECT * FROM PRODUCTO WHERE nombre like '%" + name + "%';";
            Statement consulta = conection.createStatement();
            System.out.println(query);
            ResultSet rs = consulta.executeQuery(query);
            System.out.println("el rs.next: " + rs.next());
            while (!rs.wasNull()) {
                
                int cod = rs.getInt(1);
                
                String nombre = rs.getString(2);
                
                String descripcion = rs.getString(3);
                int cantExist = rs.getInt(4);
               
                String cat = rs.getString(5);
               
                float precioAlXMayor = rs.getFloat(6);
                float precio = rs.getFloat(7);
                char estado = rs.getString(8).charAt(0);
                Producto p = new Producto(cod, nombre, descripcion, cat, estado, precioAlXMayor, precio, cantExist);
               
                lista.add(p);
                if (!rs.next()) {
                    break;
                }
            }
            for (int i = 0; i < lista.size(); i++) {
                Object[] row = {lista.get(i).getCodigo(), lista.get(i).getNombre(), lista.get(i).getDescripcion(), lista.get(i).getCategoria(), lista.get(i).getCantExist(), lista.get(i).getPrecioAlXMayor(), lista.get(i).getPrecio(), lista.get(i).getEstado()};
                tm.addRow(row);
                
                table.setModel(tm);
            }
            rs.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Busqueda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void busquedaCategoria(String categoria, JTable table) {
        try {
            LinkedList<Producto> lista = new LinkedList<Producto>();
            DefaultTableModel tm = new DefaultTableModel();
            tm.setColumnCount(8);
            ConexionBD con = new ConexionBD();
            Connection conection = con.abrirConexion();
            String query = "SELECT * FROM PRODUCTO WHERE categoria like '%" + categoria + "%';";
            Statement consulta = conection.createStatement();
            ResultSet rs = consulta.executeQuery(query);
            System.out.println("el rs.next: " + rs.next());
            while (!rs.wasNull()) {
                int cod = rs.getInt(1);
                
                String nombre = rs.getString(2);
               
                String descripcion = rs.getString(3);
                int cantExist = rs.getInt(4);
                String cat = rs.getString(5);
                float precioAlXMayor = rs.getFloat(6);
                float precio = rs.getFloat(7);
                char estado = rs.getString(8).charAt(0);
                Producto p = new Producto(cod, nombre, descripcion, cat, estado, precioAlXMayor, precio, cantExist);
                lista.add(p);
                if (!rs.next()) {
                    break;
                }
            }
            for (int i = 0; i < lista.size(); i++) {
                Object[] row = {lista.get(i).getCodigo(), lista.get(i).getNombre(), lista.get(i).getDescripcion(), lista.get(i).getCategoria(), lista.get(i).getCantExist(), lista.get(i).getPrecioAlXMayor(), lista.get(i).getPrecio(), lista.get(i).getEstado()};
                tm.addRow(row);
                System.out.println("entra al for");
                table.setModel(tm);
            }

            
        } catch (SQLException ex) {
            Logger.getLogger(Busqueda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void busquedaDescripcion(String descrip, JTable table) {
        try {
            LinkedList<Producto> lista = new LinkedList<Producto>();
            DefaultTableModel tm = new DefaultTableModel();
            tm.setColumnCount(8);
            ConexionBD con = new ConexionBD();
            Connection conection = con.abrirConexion();
            String query = "SELECT * FROM PRODUCTO WHERE descripcion like '%" + descrip + "%';";
            Statement consulta = conection.createStatement();
            
            ResultSet rs = consulta.executeQuery(query);
            System.out.println("el rs.next: " + rs.next());
            
            while (!rs.wasNull()) {
                
                int cod = rs.getInt(1);
                
                String nombre = rs.getString(2);
                
                String descripcion = rs.getString(3);
                int cantExist = rs.getInt(4);
                
                String cat = rs.getString(5);
                
                float precioAlXMayor = rs.getFloat(6);
                float precio = rs.getFloat(7);
                char estado = rs.getString(8).charAt(0);
                Producto p = new Producto(cod, nombre, descripcion, cat, estado, precioAlXMayor, precio, cantExist);
                lista.add(p);
                if (!rs.next()) {
                    break;
                }
            }
            for (int i = 0; i < lista.size(); i++) {
                Object[] row = {lista.get(i).getCodigo(), lista.get(i).getNombre(), lista.get(i).getDescripcion(), lista.get(i).getCategoria(), lista.get(i).getCantExist(), lista.get(i).getPrecioAlXMayor(), lista.get(i).getPrecio(), lista.get(i).getEstado()};
                tm.addRow(row);
                
                table.setModel(tm);
            }
            rs.close();
            // consulta = conexion.prepareStatement("UPDATE " + this.tabla + " SET titulo = ?, descripcion = ?, nivel_de_prioridad = ? WHERE id_tarea = ?");
        } catch (SQLException ex) {
            Logger.getLogger(Busqueda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
