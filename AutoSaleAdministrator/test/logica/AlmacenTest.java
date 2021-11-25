/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

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
public class AlmacenTest {
    
    public AlmacenTest() {
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
     * Test of getVehiculosComprados method, of class Almacen.
     */
    @Test
    public void testGetVehiculosComprados() {
        System.out.println("getVehiculosComprados");
        Almacen instance = new Almacen();
        ArrayList<Vehiculo> expResult = null;
        ArrayList<Vehiculo> result = instance.getVehiculosComprados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVehiculosComprados method, of class Almacen.
     */
    @Test
    public void testSetVehiculosComprados() {
        System.out.println("setVehiculosComprados");
        ArrayList<Vehiculo> vehiculosComprados = null;
        Almacen instance = new Almacen();
        instance.setVehiculosComprados(vehiculosComprados);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ventaVehiculo method, of class Almacen.
     */
    @Test
    public void testVentaVehiculo() {
        System.out.println("ventaVehiculo");
        Vehiculo vehiculo = null;
        Almacen instance = new Almacen();
        boolean expResult = false;
        boolean result = instance.ventaVehiculo(vehiculo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarVehiculo method, of class Almacen.
     */
    @Test
    public void testAgregarVehiculo() {
        System.out.println("agregarVehiculo");
        Vehiculo vehiculo = new Vehiculo("HYR123", "Audi", "Rojo", 2, 100000000L, 120000000L, "Deportivo");
        Almacen instance = new Almacen();
        boolean expResult = false;
        boolean result = instance.agregarVehiculo(vehiculo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarVehiculo method, of class Almacen.
     */
    @Test
    public void testBuscarVehiculo() {
        System.out.println("buscarVehiculo");
        String matricula = "";
        Almacen instance = new Almacen();
        Vehiculo expResult = new Vehiculo("HYR123", "Audi", "Rojo", 2, 100000000L, 120000000L, "Deportivo");
        Vehiculo result = instance.buscarVehiculo(matricula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarVehiculoMatricula method, of class Almacen.
     */
    @Test
    public void testBuscarVehiculoMatricula() {
        System.out.println("buscarVehiculoMatricula");
        String matricula = "HYR123";
        Almacen instance = new Almacen();
        boolean expResult = false;
        boolean result = instance.buscarVehiculoMatricula(matricula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
