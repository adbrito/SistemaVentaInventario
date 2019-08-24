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
public class ClienteTest {
    
    public ClienteTest() {
    }
    //Crea un nuevo cliente y verifica que no sea un objeto null
    @Test
    public void testCreaCliente(){
    Cliente c = new Cliente("efectivo", "Armando", "Ponce", "Cdla Las Cumbres", "363320", "12938471");
    assertNotNull(c);
            
    }

    /**
     * Test of getFormaPago method, of class Cliente.
     */
   
    //Registra un nuevo cliente en la base de datos (como es un registro con una pk si se ejecuta mas de una vez botará error)
    @Test
    public void testRegistroCliente(){
        Cliente c = new Cliente("tarjeta debito", "Andrea", "Vera", "Cdla. Paraiso","0991279378", "1203212131");
        boolean insertQuery = c.insertQuery(c);
        assertTrue(insertQuery);
        System.out.println(insertQuery);
    }
    
}
