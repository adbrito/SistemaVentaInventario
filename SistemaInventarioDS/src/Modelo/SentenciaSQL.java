/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.mysql.jdbc.Connection;

/**
 *
 * @author allis
 */
public interface SentenciaSQL {
    ConexionBD conexion = new ConexionBD();
    public void ejecutarSentencia();
    public boolean selectQuery(ConexionBD sentencia);
    public boolean updateQuery(String sentencia);
    public boolean deleteQuery(String sentencia);
    public boolean insertQuery(Connection conection, Cliente cliente);
    
    
}
