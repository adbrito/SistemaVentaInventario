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
public class LocalTest {
    
    public LocalTest() {
    }
   

    /**
     * Test of setEsMatriz method, of class Local.
     */
    @Test
    public void testSiNoEsSucursal() {
        System.out.println("setEsMatriz");
        boolean esSucursal = false;
        Local l = new Local(1, "TecnoImport S.A. - 9 Octubre", "Guayaquil", "9oct y Boyaca", false, true, false);
        assertTrue(esSucursal == l.isEsMatriz());
    }

    /**
     * Test of isEsSucursal method, of class Local.
     */
    @Test
    public void testSiEsSucursal() {
        System.out.println("isEsSucursal");
        Local l = new Local(0, "TecnoImport S.A. - 9 Octubre", "Guayaquil", "9oct y Boyaca", false, true, false);
        boolean expResult = true;
        boolean result = l.isEsSucursal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setEsSucursal method, of class Local.
     */


    /**
     * Test of isEsBodega method, of class Local.
     */
  /*  @Test
    public void testIsEsBodega() {
        System.out.println("isEsBodega");
        Local instance = null;
        boolean expResult = false;
        boolean result = instance.isEsBodega();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of setEsBodega method, of class Local.
     */
    @Test
    public void testVerificandoSucursalConMatriz() {
        System.out.println("setEsBodega");
        Local l = new Local(1, "TecnoImport S.A. - Sur", "Guayaquil","Fco de Orellana", true,false, false);
        Local l1 = new Local(2, "TecnoImport S.A. - 9 Octubre", "Guayaquil","9 octubre y Boyaca", false,true, false);
        assertNotEquals(l, l1);
        
    }
    
}
