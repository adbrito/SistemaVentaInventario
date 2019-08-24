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
public class EmpleadoTest {
    
    public EmpleadoTest() {
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
     * Test of getSueldo method, of class Empleado.
     */
    @Test
    public void testGetSueldo() {
        System.out.println("getSueldo");
        Empleado instance = null;
        float expResult = 0.0F;
        float result = instance.getSueldo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSueldo method, of class Empleado.
     */
    @Test
    public void testSetSueldo() {
        System.out.println("setSueldo");
        float sueldo = 0.0F;
        Empleado instance = null;
        instance.setSueldo(sueldo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEstado method, of class Empleado.
     */
    @Test
    public void testIsEstado() {
        System.out.println("isEstado");
        Empleado instance = null;
        boolean expResult = false;
        boolean result = instance.isEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Empleado.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        boolean estado = false;
        Empleado instance = null;
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isTieneLocalAsignado method, of class Empleado.
     */
    @Test
    public void testIsTieneLocalAsignado() {
        System.out.println("isTieneLocalAsignado");
        Empleado instance = null;
        boolean expResult = false;
        boolean result = instance.isTieneLocalAsignado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTieneLocalAsignado method, of class Empleado.
     */
    @Test
    public void testSetTieneLocalAsignado() {
        System.out.println("setTieneLocalAsignado");
        boolean tieneLocalAsignado = false;
        Empleado instance = null;
        instance.setTieneLocalAsignado(tieneLocalAsignado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumLocalAsignado method, of class Empleado.
     */
    @Test
    public void testGetNumLocalAsignado() {
        System.out.println("getNumLocalAsignado");
        Empleado instance = null;
        String expResult = "";
        String result = instance.getNumLocalAsignado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumLocalAsignado method, of class Empleado.
     */
    @Test
    public void testSetNumLocalAsignado() {
        System.out.println("setNumLocalAsignado");
        String numLocalAsignado = "";
        Empleado instance = null;
        instance.setNumLocalAsignado(numLocalAsignado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
