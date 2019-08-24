/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.JFrame;
import javax.swing.JTable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author allis
 */
public class BusquedaTest {
    
    public BusquedaTest() {
    }

    /**
     * Test of busquedaDescripcion method, of class Busqueda.
     */
    @Test
    public void testBusquedaDescripcion() {
        System.out.println("busquedaDescripcion");
        String descrip = "";
        JTable table = new JTable();
        Busqueda instance = new Busqueda();
        instance.busquedaDescripcion(descrip, table);
        JFrame frame = new JFrame();
        frame.add(table);
        frame.setVisible(true);
        
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
