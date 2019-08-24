/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
public class DetalleVentaTest {
    
    public DetalleVentaTest() {
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
     * Test of getNumVenta method, of class DetalleVenta.
     */
    @Test
    public void testGetNumVenta() {
        System.out.println("getNumVenta");
        DetalleVenta instance = null;
        String expResult = "";
        String result = instance.getNumVenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumVenta method, of class DetalleVenta.
     */
    @Test
    public void testSetNumVenta() {
        System.out.println("setNumVenta");
        String numVenta = "";
        DetalleVenta instance = null;
        instance.setNumVenta(numVenta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCant method, of class DetalleVenta.
     */
    @Test
    public void testGetCant() {
        System.out.println("getCant");
        DetalleVenta instance = null;
        int expResult = 0;
        int result = instance.getCant();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCant method, of class DetalleVenta.
     */
    @Test
    public void testSetCant() {
        System.out.println("setCant");
        int cant = 0;
        DetalleVenta instance = null;
        instance.setCant(cant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProducto method, of class DetalleVenta.
     */
    @Test
    public void testGetProducto() {
        System.out.println("getProducto");
        DetalleVenta instance = null;
        Producto expResult = null;
        Producto result = instance.getProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProducto method, of class DetalleVenta.
     */
    @Test
    public void testSetProducto() {
        System.out.println("setProducto");
        Producto producto = null;
        DetalleVenta instance = null;
        instance.setProducto(producto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubtotal method, of class DetalleVenta.
     */
    @Test
    public void testGetSubtotal() {
        System.out.println("getSubtotal");
        DetalleVenta instance = null;
        float expResult = 0.0F;
        float result = instance.getSubtotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSubtotal method, of class DetalleVenta.
     */
    @Test
    public void testSetSubtotal() {
        System.out.println("setSubtotal");
        float subtotal = 0.0F;
        DetalleVenta instance = null;
        instance.setSubtotal(subtotal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
