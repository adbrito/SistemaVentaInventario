/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JTable;
import model.Cliente;
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
public class ControladorVendedorTest {
    
    public ControladorVendedorTest() {
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
     * Test of mostrarPrincipal method, of class ControladorVendedor.
     */
    @Test
    public void testMostrarPrincipal() {
        System.out.println("mostrarPrincipal");
        ControladorVendedor instance = new ControladorVendedor();
        instance.mostrarPrincipal();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarRegistroCliente method, of class ControladorVendedor.
     */
    @Test
    public void testMostrarRegistroCliente() {
        System.out.println("mostrarRegistroCliente");
        ControladorVendedor instance = new ControladorVendedor();
        instance.mostrarRegistroCliente();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarVenta method, of class ControladorVendedor.
     */
    @Test
    public void testMostrarVenta() {
        System.out.println("mostrarVenta");
        ControladorVendedor instance = new ControladorVendedor();
        instance.mostrarVenta();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registroCliente method, of class ControladorVendedor.
     */
    @Test
    public void testRegistroCliente() {
        System.out.println("registroCliente");
        Cliente c = null;
        ControladorVendedor instance = new ControladorVendedor();
        instance.registroCliente(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarBusquedaNombre method, of class ControladorVendedor.
     */
    @Test
    public void testMostrarBusquedaNombre() {
        System.out.println("mostrarBusquedaNombre");
        ControladorVendedor instance = new ControladorVendedor();
        instance.mostrarBusquedaNombre();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarBusquedaCat method, of class ControladorVendedor.
     */
    @Test
    public void testMostrarBusquedaCat() {
        System.out.println("mostrarBusquedaCat");
        ControladorVendedor instance = new ControladorVendedor();
        instance.mostrarBusquedaCat();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarBusquedaDescripcion method, of class ControladorVendedor.
     */
    @Test
    public void testMostrarBusquedaDescripcion() {
        System.out.println("mostrarBusquedaDescripcion");
        ControladorVendedor instance = new ControladorVendedor();
        instance.mostrarBusquedaDescripcion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of busquedaNombre method, of class ControladorVendedor.
     */
    @Test
    public void testBusquedaNombre() {
        System.out.println("busquedaNombre");
        String nombre = "";
        JTable j = null;
        ControladorVendedor instance = new ControladorVendedor();
        instance.busquedaNombre(nombre, j);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of busquedaCat method, of class ControladorVendedor.
     */
    @Test
    public void testBusquedaCat() {
        System.out.println("busquedaCat");
        String categoria = "";
        JTable j = null;
        ControladorVendedor instance = new ControladorVendedor();
        instance.busquedaCat(categoria, j);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of busquedaDescripcion method, of class ControladorVendedor.
     */
    @Test
    public void testBusquedaDescripcion() {
        System.out.println("busquedaDescripcion");
        String descripcion = "";
        JTable j = null;
        ControladorVendedor instance = new ControladorVendedor();
        instance.busquedaDescripcion(descripcion, j);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
