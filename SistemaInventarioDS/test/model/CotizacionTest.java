/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
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
public class CotizacionTest {
    
    public CotizacionTest() {
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
     * Test of getNumCotizacion method, of class Cotizacion.
     */
    @Test
    public void testGetNumCotizacion() {
        System.out.println("getNumCotizacion");
        Cotizacion instance = null;
        String expResult = "";
        String result = instance.getNumCotizacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumCotizacion method, of class Cotizacion.
     */
    @Test
    public void testSetNumCotizacion() {
        System.out.println("setNumCotizacion");
        String numCotizacion = "";
        Cotizacion instance = null;
        instance.setNumCotizacion(numCotizacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaAct method, of class Cotizacion.
     */
    @Test
    public void testGetFechaAct() {
        System.out.println("getFechaAct");
        Cotizacion instance = null;
        String expResult = "";
        String result = instance.getFechaAct();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaAct method, of class Cotizacion.
     */
    @Test
    public void testSetFechaAct() {
        System.out.println("setFechaAct");
        String fechaAct = "";
        Cotizacion instance = null;
        instance.setFechaAct(fechaAct);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIva method, of class Cotizacion.
     */
    @Test
    public void testGetIva() {
        System.out.println("getIva");
        Cotizacion instance = null;
        float expResult = 0.0F;
        float result = instance.getIva();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIva method, of class Cotizacion.
     */
    @Test
    public void testSetIva() {
        System.out.println("setIva");
        float iva = 0.0F;
        Cotizacion instance = null;
        instance.setIva(iva);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubtotal method, of class Cotizacion.
     */
    @Test
    public void testGetSubtotal() {
        System.out.println("getSubtotal");
        Cotizacion instance = null;
        float expResult = 0.0F;
        float result = instance.getSubtotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSubtotal method, of class Cotizacion.
     */
    @Test
    public void testSetSubtotal() {
        System.out.println("setSubtotal");
        float subtotal = 0.0F;
        Cotizacion instance = null;
        instance.setSubtotal(subtotal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal method, of class Cotizacion.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        Cotizacion instance = null;
        float expResult = 0.0F;
        float result = instance.getTotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotal method, of class Cotizacion.
     */
    @Test
    public void testSetTotal() {
        System.out.println("setTotal");
        float total = 0.0F;
        Cotizacion instance = null;
        instance.setTotal(total);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDetalleVenta method, of class Cotizacion.
     */
    @Test
    public void testGetDetalleVenta() {
        System.out.println("getDetalleVenta");
        Cotizacion instance = null;
        List<DetalleVenta> expResult = null;
        List<DetalleVenta> result = instance.getDetalleVenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDetalleVenta method, of class Cotizacion.
     */
    @Test
    public void testSetDetalleVenta() {
        System.out.println("setDetalleVenta");
        List<DetalleVenta> detalleVenta = null;
        Cotizacion instance = null;
        instance.setDetalleVenta(detalleVenta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVendedor method, of class Cotizacion.
     */
    @Test
    public void testGetVendedor() {
        System.out.println("getVendedor");
        Cotizacion instance = null;
        Vendedor expResult = null;
        Vendedor result = instance.getVendedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVendedor method, of class Cotizacion.
     */
    @Test
    public void testSetVendedor() {
        System.out.println("setVendedor");
        Vendedor vendedor = null;
        Cotizacion instance = null;
        instance.setVendedor(vendedor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularIVA method, of class Cotizacion.
     */
    @Test
    public void testCalcularIVA() {
        System.out.println("calcularIVA");
        Cotizacion instance = null;
        instance.calcularIVA();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
