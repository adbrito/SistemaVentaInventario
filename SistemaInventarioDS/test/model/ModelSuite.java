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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author allis
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({model.RepartidorTest.class, model.RutaEntregaTest.class, model.ClienteTest.class, model.DetalleVentaTest.class, model.ConexionBDTest.class, model.ProductoTest.class, model.EnvioTest.class, model.BusquedaTest.class, model.VendedorTest.class, model.VentaTest.class, model.EmpleadoTest.class, model.GerenteTest.class, model.IBusquedaTest.class, model.SentenciaSQLTest.class, model.ValidaUsuarioTest.class, model.CotizacionTest.class, model.JefeBodegaTest.class, model.PersonaTest.class, model.LocalTest.class})
public class ModelSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
