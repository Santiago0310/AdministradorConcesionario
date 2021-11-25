/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import datos.Cliente;
import datos.Vehiculo;
import logica.Almacen;
import logica.DepVenta;
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
public class ConeccionBaseDatosTest {
    
    public ConeccionBaseDatosTest() {
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
     * Test of conectar method, of class ConeccionBaseDatos.
     */
    @Test
    public void testConectar() {
        System.out.println("conectar");
        ConeccionBaseDatos.conectar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AgregarVehiculo method, of class ConeccionBaseDatos.
     */
    @Test
    public void testAgregarVehiculo() {
        System.out.println("AgregarVehiculo");
        Vehiculo v = new Vehiculo("HYR123", "Audi", "Rojo", 2, 100000000L, 120000000L, "Deportivo");
        ConeccionBaseDatos.AgregarVehiculo(v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AgregarCliente method, of class ConeccionBaseDatos.
     */
    @Test
    public void testAgregarCliente() {
        System.out.println("AgregarCliente");
        Cliente c = new Cliente(1030654, "David");
        Vehiculo v = new Vehiculo("HYR123", "Audi", "Rojo", 2, 100000000L, 120000000L, "Deportivo");
        ConeccionBaseDatos.AgregarCliente(c, v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVenta method, of class ConeccionBaseDatos.
     */
    @Test
    public void testGetVenta() {
        System.out.println("getVenta");
        DepVenta expResult = null;
        DepVenta result = ConeccionBaseDatos.getVenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVenta method, of class ConeccionBaseDatos.
     */
    @Test
    public void testSetVenta() {
        System.out.println("setVenta");
        DepVenta venta = null;
        ConeccionBaseDatos.setVenta(venta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlmacen method, of class ConeccionBaseDatos.
     */
    @Test
    public void testGetAlmacen() {
        System.out.println("getAlmacen");
        Almacen expResult = null;
        Almacen result = ConeccionBaseDatos.getAlmacen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAlmacen method, of class ConeccionBaseDatos.
     */
    @Test
    public void testSetAlmacen() {
        System.out.println("setAlmacen");
        Almacen almacen = null;
        ConeccionBaseDatos.setAlmacen(almacen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
