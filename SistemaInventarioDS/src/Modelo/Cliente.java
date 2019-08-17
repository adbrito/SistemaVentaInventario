/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mysql.jdbc.Connection;

/**
 *
 * @author allis
 */
public class Cliente extends Persona implements SentenciaSQL {

    protected ConexionBD con = new ConexionBD();
    protected String formaPago;
    protected boolean estado;

    public Cliente(String formaPago, String nombre, String apellido, String direccion, String telefono, String cedula) {
        super(nombre, apellido, direccion, telefono, cedula);
        this.formaPago = formaPago;
        this.estado = true;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public void ejecutarSentencia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean selectQuery(ConexionBD sentencia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateQuery(String sentencia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteQuery(String sentencia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean insertQuery(Cliente cliente) {
        try {
            Connection conection=con.abrirConexion();
            Statement consulta = conection.createStatement();
            String query = "INSERT INTO Cliente (id_cliente, nombre, apellido, direccion, telefono, estado) "
                    + "VALUES('"+ cliente.getCedula()  + "','" + cliente.getNombre()+"','" 
                    +cliente.getApellido()+ "', '"+cliente.getDireccion()+"', '"+cliente.getTelefono()+"', 'A')";

            // consulta = conexion.prepareStatement("UPDATE " + this.tabla + " SET titulo = ?, descripcion = ?, nivel_de_prioridad = ? WHERE id_tarea = ?");
            System.out.println("deberia haber guardado en la base");
            System.out.println(query);
            consulta.executeUpdate(query);
            return true;
        } catch (SQLException ex1) {
            System.out.println("error den exceptionsql de grabar" + ex1);
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex1);
        }
        return false;

    }


}
