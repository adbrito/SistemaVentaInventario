/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author allis
 */
public interface IBusqueda {
    public void busquedaCategoria(String nombre, JTable table);
    public void busquedaNombre(String categoria, JTable table);
    public void busquedaDescripcion(String descripcion, JTable table);
}
