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
public class RutaEntregaTest {

    public RutaEntregaTest() {
    }

    //verificar si una ruta de entrega al crearse como nueva es diferente a null
    @Test
    public void testCreaRepartidor() {
        RutaEntrega re = new RutaEntrega();
        assertNotNull(re);

    }
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
////
////    /**
////     * Test of agregarEnvio method, of class RutaEntrega.
////     */
////    @Test
////    public void testAgregarEnvio() {
////        System.out.println("agregarEnvio");
////        Envio envio = null;
////        RutaEntrega instance = new RutaEntrega();
////        instance.agregarEnvio(envio);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of getEntregasAsig method, of class RutaEntrega.
////     */
////    @Test
////    public void testGetEntregasAsig() {
////        System.out.println("getEntregasAsig");
////        RutaEntrega instance = new RutaEntrega();
////        int expResult = 0;
////        int result = instance.getEntregasAsig();
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of setEntregasAsig method, of class RutaEntrega.
////     */
////    @Test
////    public void testSetEntregasAsig() {
////        System.out.println("setEntregasAsig");
////        int entregasAsig = 0;
////        RutaEntrega instance = new RutaEntrega();
////        instance.setEntregasAsig(entregasAsig);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of getPedidosAsig method, of class RutaEntrega.
////     */
////    @Test
////    public void testGetPedidosAsig() {
////        System.out.println("getPedidosAsig");
////        RutaEntrega instance = new RutaEntrega();
////        List<Envio> expResult = null;
////        List<Envio> result = instance.getPedidosAsig();
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of setPedidosAsig method, of class RutaEntrega.
////     */
////    @Test
////    public void testSetPedidosAsig() {
////        System.out.println("setPedidosAsig");
////        List<Envio> pedidosAsig = null;
////        RutaEntrega instance = new RutaEntrega();
////        instance.setPedidosAsig(pedidosAsig);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of crearRuta method, of class RutaEntrega.
////     */
////    @Test
////    public void testCrearRuta() {
////        System.out.println("crearRuta");
////        RutaEntrega instance = new RutaEntrega();
////        instance.crearRuta();
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of asignarRuta method, of class RutaEntrega.
////     */
////    @Test
////    public void testAsignarRuta() {
////        System.out.println("asignarRuta");
////        RutaEntrega instance = new RutaEntrega();
////        instance.asignarRuta();
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }

}
