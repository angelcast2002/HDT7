/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package HDT7;

import java.util.ArrayList;
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
public class LeerDatosTest {
    
    /**
     *
     */
    public LeerDatosTest() {
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
     * Test of LeerDatos method, of class LeerDatos.
     * @throws java.lang.Exception
     */
    @Test
    public void testLeerDatos() throws Exception {
        System.out.println("LeerDatos");
        ArrayList expResult = null;
        ArrayList result = LeerDatos.LeerDatos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LeerDatos2 method, of class LeerDatos.
     * @throws java.lang.Exception
     */
    @Test
    public void testLeerDatos2() throws Exception {
        System.out.println("LeerDatos2");
        String NombreArchivo = "";
        ArrayList expResult = null;
        ArrayList result = LeerDatos.LeerDatos2(NombreArchivo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
