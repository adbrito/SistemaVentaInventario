/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
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
public class EnvioTest {
    
    public EnvioTest() {
    }
    
    //Se verifica que la funcion para comprobar el estado entregado de un envio funcione adecuadamente
    @Test
    public void testIsFirmado(){
    Envio e = new Envio();
    e.hacerFirmar();
    boolean val = e.isFirmado();
    assertTrue(val);
            
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
//     * Test of getDestinatario method, of class Envio.
//     */
//    @Test
//    public void testGetDestinatario() {
//        System.out.println("getDestinatario");
//        Envio instance = new Envio();
//        Persona expResult = null;
//        Persona result = instance.getDestinatario();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setDestinatario method, of class Envio.
//     */
//    @Test
//    public void testSetDestinatario() {
//        System.out.println("setDestinatario");
//        Persona destinatario = null;
//        Envio instance = new Envio();
//        instance.setDestinatario(destinatario);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getRepAsig method, of class Envio.
//     */
//    @Test
//    public void testGetRepAsig() {
//        System.out.println("getRepAsig");
//        Envio instance = new Envio();
//        Repartidor expResult = null;
//        Repartidor result = instance.getRepAsig();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setRepAsig method, of class Envio.
//     */
//    @Test
//    public void testSetRepAsig() {
//        System.out.println("setRepAsig");
//        Repartidor repAsig = null;
//        Envio instance = new Envio();
//        instance.setRepAsig(repAsig);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getListaProductos method, of class Envio.
//     */
//    @Test
//    public void testGetListaProductos() {
//        System.out.println("getListaProductos");
//        Envio instance = new Envio();
//        HashMap<String, Integer> expResult = null;
//        HashMap<String, Integer> result = instance.getListaProductos();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setListaProductos method, of class Envio.
//     */
//    @Test
//    public void testSetListaProductos() {
//        System.out.println("setListaProductos");
//        HashMap<String, Integer> listaProductos = null;
//        Envio instance = new Envio();
//        instance.setListaProductos(listaProductos);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of isFirmado method, of class Envio.
//     */
//    @Test
//    public void testIsFirmado() {
//        System.out.println("isFirmado");
//        Envio instance = new Envio();
//        boolean expResult = false;
//        boolean result = instance.isFirmado();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setFirmado method, of class Envio.
//     */
//    @Test
//    public void testSetFirmado() {
//        System.out.println("setFirmado");
//        boolean firmado = false;
//        Envio instance = new Envio();
//        instance.setFirmado(firmado);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getMsg method, of class Envio.
//     */
//    @Test
//    public void testGetMsg() {
//        System.out.println("getMsg");
//        Envio instance = new Envio();
//        String expResult = "";
//        String result = instance.getMsg();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setMsg method, of class Envio.
//     */
//    @Test
//    public void testSetMsg() {
//        System.out.println("setMsg");
//        String msg = "";
//        Envio instance = new Envio();
//        instance.setMsg(msg);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of hacerFirmar method, of class Envio.
//     */
//    @Test
//    public void testHacerFirmar() {
//        System.out.println("hacerFirmar");
//        Envio instance = new Envio();
//        instance.hacerFirmar();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of agregarProducto method, of class Envio.
//     */
//    @Test
//    public void testAgregarProducto() {
//        System.out.println("agregarProducto");
//        String p = "";
//        int n = 0;
//        Envio instance = new Envio();
//        instance.agregarProducto(p, n);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
