/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
public class IBusquedaTest {
    
    public IBusquedaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of busquedaCategoria method, of class IBusqueda.
     */
    @Test
    public void testBusquedaCategoria() {
        System.out.println("busquedaCategoria");
        String nombre = "";
        JTable table = null;
        IBusqueda instance = new IBusquedaImpl();
        instance.busquedaCategoria(nombre, table);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of busquedaNombre method, of class IBusqueda.
     */
    @Test
    public void testBusquedaNombre() {
        System.out.println("busquedaNombre");
        String categoria = "";
        JTable table = null;
        IBusqueda instance = new IBusquedaImpl();
        instance.busquedaNombre(categoria, table);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of busquedaDescripcion method, of class IBusqueda.
     */
    @Test
    public void testBusquedaDescripcion() {
        System.out.println("busquedaDescripcion");
        String descripcion = "";
        JTable table = null;
        IBusqueda instance = new IBusquedaImpl();
        instance.busquedaDescripcion(descripcion, table);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IBusquedaImpl implements IBusqueda {

        public void busquedaCategoria(String nombre, JTable table) {
        }

        public void busquedaNombre(String categoria, JTable table) {
        }

        public void busquedaDescripcion(String descripcion, JTable table) {
        }
    }
    
}
