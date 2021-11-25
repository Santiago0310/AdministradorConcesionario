/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import datos.Cliente;
import datos.Registro;
import datos.Vehiculo;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 57321
 */
public class DepVentaTest {
    
    public DepVentaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of setRegistros method, of class DepVenta.
     */
    @Test
    public void testSetRegistros() {
        System.out.println("setRegistros");
        ArrayList<Registro> registros = null;
        DepVenta instance = new DepVenta();
        instance.setRegistros(registros);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGananciasGeneradas method, of class DepVenta.
     */
    @Test
    public void testGetGananciasGeneradas() {
        System.out.println("getGananciasGeneradas");
        DepVenta instance = new DepVenta();
        Long expResult = null;
        Long result = instance.getGananciasGeneradas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGananciasGeneradas method, of class DepVenta.
     */
    @Test
    public void testSetGananciasGeneradas() {
        System.out.println("setGananciasGeneradas");
        Long gananciasGeneradas = null;
        DepVenta instance = new DepVenta();
        instance.setGananciasGeneradas(gananciasGeneradas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarVenta method, of class DepVenta.
     */
    @Test
    public void testAgregarVenta() {
        System.out.println("agregarVenta");
        Cliente c = new Cliente(1030654, "David");
        Vehiculo v = new Vehiculo("HYR123", "Audi", "Rojo", 2, 100000000L, 120000000L, "Deportivo");
        Registro registro = new Registro(c, v);
        DepVenta instance = new DepVenta();
        boolean expResult = false;
        boolean result = instance.agregarVenta(registro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrar method, of class DepVenta.
     */
    @Test
    public void testMostrar() {
        System.out.println("mostrar");
        DepVenta instance = new DepVenta();
        instance.mostrar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRegistros method, of class DepVenta.
     */
    @Test
    public void testGetRegistros() {
        System.out.println("getRegistros");
        DepVenta instance = new DepVenta();
        ArrayList<Registro> expResult = null;
        ArrayList<Registro> result = instance.getRegistros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
