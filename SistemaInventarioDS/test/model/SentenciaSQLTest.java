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
public class SentenciaSQLTest {
    
    public SentenciaSQLTest() {
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
     * Test of ejecutarSentencia method, of class SentenciaSQL.
     */
    @Test
    public void testEjecutarSentencia() {
        System.out.println("ejecutarSentencia");
        SentenciaSQL instance = new SentenciaSQLImpl();
        instance.ejecutarSentencia();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectQuery method, of class SentenciaSQL.
     */
    @Test
    public void testSelectQuery() {
        System.out.println("selectQuery");
        ConexionBD sentencia = null;
        SentenciaSQL instance = new SentenciaSQLImpl();
        boolean expResult = false;
        boolean result = instance.selectQuery(sentencia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateQuery method, of class SentenciaSQL.
     */
    @Test
    public void testUpdateQuery() {
        System.out.println("updateQuery");
        String sentencia = "";
        SentenciaSQL instance = new SentenciaSQLImpl();
        boolean expResult = false;
        boolean result = instance.updateQuery(sentencia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteQuery method, of class SentenciaSQL.
     */
    @Test
    public void testDeleteQuery() {
        System.out.println("deleteQuery");
        String sentencia = "";
        SentenciaSQL instance = new SentenciaSQLImpl();
        boolean expResult = false;
        boolean result = instance.deleteQuery(sentencia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertQuery method, of class SentenciaSQL.
     */
    @Test
    public void testInsertQuery() {
        System.out.println("insertQuery");
        Cliente cliente = null;
        SentenciaSQL instance = new SentenciaSQLImpl();
        boolean expResult = false;
        boolean result = instance.insertQuery(cliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class SentenciaSQLImpl implements SentenciaSQL {

        public void ejecutarSentencia() {
        }

        public boolean selectQuery(ConexionBD sentencia) {
            return false;
        }

        public boolean updateQuery(String sentencia) {
            return false;
        }

        public boolean deleteQuery(String sentencia) {
            return false;
        }

        public boolean insertQuery(Cliente cliente) {
            return false;
        }
    }
    
}
