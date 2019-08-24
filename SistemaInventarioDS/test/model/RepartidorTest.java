/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author allis
 */
public class RepartidorTest {
    
    public RepartidorTest() {
    }
    
    //Prueba para verificar que se cre correctamente un repartidor
    @Test
    public void testCreaRepartidor(){        
    Repartidor r = new Repartidor("Santiago", "Solorzano", "Florida", "0933218020", "09230777719" );
    assertNotNull(r);
            
    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of getVehiculoAsig method, of class Repartidor.
//     */
//    @Test
//    public void testGetVehiculoAsig() {
//        System.out.println("getVehiculoAsig");
//        Repartidor instance = null;
//        String expResult = "";
//        String result = instance.getVehiculoAsig();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setVehiculoAsig method, of class Repartidor.
//     */
//    @Test
//    public void testSetVehiculoAsig() {
//        System.out.println("setVehiculoAsig");
//        String vehiculoAsig = "";
//        Repartidor instance = null;
//        instance.setVehiculoAsig(vehiculoAsig);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getRutaAsig method, of class Repartidor.
//     */
//    @Test
//    public void testGetRutaAsig() {
//        System.out.println("getRutaAsig");
//        Repartidor instance = null;
//        RutaEntrega expResult = null;
//        RutaEntrega result = instance.getRutaAsig();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setRutaAsig method, of class Repartidor.
//     */
//    @Test
//    public void testSetRutaAsig() {
//        System.out.println("setRutaAsig");
//        RutaEntrega rutaAsig = null;
//        Repartidor instance = null;
//        instance.setRutaAsig(rutaAsig);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of isDisponible method, of class Repartidor.
//     */
//    @Test
//    public void testIsDisponible() {
//        System.out.println("isDisponible");
//        Repartidor instance = null;
//        boolean expResult = false;
//        boolean result = instance.isDisponible();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setDisponible method, of class Repartidor.
//     */
//    @Test
//    public void testSetDisponible() {
//        System.out.println("setDisponible");
//        boolean disponible = false;
//        Repartidor instance = null;
//        instance.setDisponible(disponible);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of calcularSalario method, of class Repartidor.
//     */
//    @Test
//    public void testCalcularSalario() {
//        System.out.println("calcularSalario");
//        List<Envio> reporte = null;
//        Repartidor instance = null;
//        float expResult = 0.0F;
//        float result = instance.calcularSalario(reporte);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
