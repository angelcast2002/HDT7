/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package HDT7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Angel
 */
public class AccionesTest {
    
    /**
     *
     */
    public AccionesTest() {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of Separar method, of class Acciones.
     */
    @Test
    public void testSeparar() {
        System.out.println("Separar");
        Acciones instance = new Acciones();
        instance.Separar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CrearArboles method, of class Acciones.
     */
    @Test
    public void testCrearArboles() {
        System.out.println("CrearArboles");
        Acciones instance = new Acciones();
        instance.CrearArboles();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class Acciones.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        String id = "";
        Acciones instance = new Acciones();
        String expResult = "";
        String result = instance.eliminar(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Insertar method, of class Acciones.
     */
    @Test
    public void testInsertar() {
        System.out.println("Insertar");
        String id = "";
        String espanol = "";
        String frances = "";
        Acciones instance = new Acciones();
        String expResult = "";
        String result = instance.Insertar(id, espanol, frances);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Traducir method, of class Acciones.
     */
    @Test
    public void testTraducir() {
        System.out.println("Traducir");
        String nombreArchivo = "";
        Acciones instance = new Acciones();
        String expResult = "";
        String result = instance.Traducir(nombreArchivo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
