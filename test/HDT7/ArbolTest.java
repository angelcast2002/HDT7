/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package HDT7;

import static java.lang.String.valueOf;
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
public class ArbolTest {
    
    /**
     *
     */
    public ArbolTest() {
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
     * Test of insertar method, of class Arbol.
     */
    @Test
    public void testInsertar() {
        System.out.println("---insertar---");
        String id = "dog";
        String idF = "chien";
        String contenido = "perro";
        Arbol arbolIngles = new Arbol();
        Arbol arbolFrances = new Arbol();
        arbolIngles.insertar(id, contenido);
        arbolFrances.insertar(idF, contenido);

        assertEquals(arbolIngles.raiz.id, id);
        assertEquals(arbolFrances.raiz.id, idF);
        assertEquals(arbolIngles.raiz.contenido, contenido);
        assertEquals(arbolFrances.raiz.contenido, contenido);
        if (arbolIngles.raiz.id != id || arbolFrances.raiz.id != idF || arbolIngles.raiz.contenido != contenido || arbolFrances.raiz.contenido != contenido) {
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of eliminar method, of class Arbol.
     */
    @Test
    public void testEliminar() {
        System.out.println("---eliminar---");
        String id = "dog";
        Arbol instance = new Arbol();
        instance.insertar(id, "perro");
        String expResult = "null";
        instance.eliminar(id);
        String result = instance.buscar(id);
        result = valueOf(result);
        assertEquals(expResult, result);
        if (expResult != result) {
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of buscar method, of class Arbol.
     */
    @Test
    public void testBuscar() {
        System.out.println("---buscar---");
        String id = "dog";
        Arbol instance = new Arbol();
        instance.insertar(id, "perro");
        String expResult = "dog";
        String result = instance.buscar(id);
        assertEquals(expResult, result);
        if (expResult != result) {
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        }
    }
    
}
