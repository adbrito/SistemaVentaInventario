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
public class JefeBodegaTest {

    public JefeBodegaTest() {
    }

    //Crear y verificar que se crea correctamente el jefe de bodega
    @Test
    public void testCreaJefeBodega() {
        JefeBodega jb = new JefeBodega("Alejandro", "Garcia", "Nuevo Leon", "0999958050", "0927363320");
        assertNotNull(jb);

    }
////    
////    @BeforeClass
////    public static void setUpClass() {
////    }
////    
////    @AfterClass
////    public static void tearDownClass() {
////    }
////    
////    @Before
////    public void setUp() {
////    }
////    
////    @After
////    public void tearDown() {
////    }

    /**
     * Test of seleccionarRepartidor method, of class JefeBodega. ////
     */
////    @Test
////    public void testSeleccionarRepartidor() {
////        System.out.println("seleccionarRepartidor");
////        JefeBodega instance = new JefeBodega();
////        Repartidor expResult = null;
////        Repartidor result = instance.seleccionarRepartidor();
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of liberarRepartidor method, of class JefeBodega.
////     */
////    @Test
////    public void testLiberarRepartidor() {
////        System.out.println("liberarRepartidor");
////        Repartidor r = null;
////        JefeBodega instance = new JefeBodega();
////        instance.liberarRepartidor(r);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of asignarRuta method, of class JefeBodega.
////     */
////    @Test
////    public void testAsignarRuta() {
////        System.out.println("asignarRuta");
////        Repartidor rep = null;
////        RutaEntrega ruta = null;
////        JefeBodega instance = new JefeBodega();
////        instance.asignarRuta(rep, ruta);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of recibirReporte method, of class JefeBodega.
////     */
////    @Test
////    public void testRecibirReporte() {
////        System.out.println("recibirReporte");
////        Repartidor rep = null;
////        List<Envio> reporte = null;
////        JefeBodega instance = new JefeBodega();
////        instance.recibirReporte(rep, reporte);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
}
