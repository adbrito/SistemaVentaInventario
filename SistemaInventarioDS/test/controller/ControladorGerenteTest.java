/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
public class ControladorGerenteTest {
    
    public ControladorGerenteTest() {
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
     * Test of mostrarPrincipla method, of class ControladorGerente.
     */
    @Test
    public void testMostrarPrincipla() {
        System.out.println("mostrarPrincipla");
        ControladorGerente instance = new ControladorGerente();
        instance.mostrarPrincipla();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarBusquedaNombre method, of class ControladorGerente.
     */
    @Test
    public void testMostrarBusquedaNombre() {
        System.out.println("mostrarBusquedaNombre");
        ControladorGerente instance = new ControladorGerente();
        instance.mostrarBusquedaNombre();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarBusquedaCat method, of class ControladorGerente.
     */
    @Test
    public void testMostrarBusquedaCat() {
        System.out.println("mostrarBusquedaCat");
        ControladorGerente instance = new ControladorGerente();
        instance.mostrarBusquedaCat();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarBusquedaDescripcion method, of class ControladorGerente.
     */
    @Test
    public void testMostrarBusquedaDescripcion() {
        System.out.println("mostrarBusquedaDescripcion");
        ControladorGerente instance = new ControladorGerente();
        instance.mostrarBusquedaDescripcion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of busquedaNombre method, of class ControladorGerente.
     */
    @Test
    public void testBusquedaNombre() {
        System.out.println("busquedaNombre");
        String nombre = "";
        JTable j = null;
        ControladorGerente instance = new ControladorGerente();
        instance.busquedaNombre(nombre, j);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of busquedaCat method, of class ControladorGerente.
     */
    @Test
    public void testBusquedaCat() {
        System.out.println("busquedaCat");
        String categoria = "";
        JTable j = null;
        ControladorGerente instance = new ControladorGerente();
        instance.busquedaCat(categoria, j);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of busquedaDescripcion method, of class ControladorGerente.
     */
    @Test
    public void testBusquedaDescripcion() {
        System.out.println("busquedaDescripcion");
        String descripcion = "";
        JTable j = null;
        ControladorGerente instance = new ControladorGerente();
        instance.busquedaDescripcion(descripcion, j);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
