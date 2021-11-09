/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import datos.Vehiculo;
import java.util.ArrayList;

/**
 *
 * @author 57321
 */
public class ConeccionBaseDatos {
    
    public void conectar(){
        
    }
    
    public boolean agregar(){
        return false;
    }
    
    public boolean actualizar(){
        return false;
    }
    
    public boolean eliminar(){
        return false;
    }
    
    public Vehiculo consultar(){
        Vehiculo vehiculo = new Vehiculo();
        return vehiculo;
    }
    
    public ArrayList<Vehiculo> cargarVehiculosComprados(){
        ArrayList vehiculosComprados = null;
        return vehiculosComprados;
    }
    
    public ArrayList<Vehiculo> cargarVehiculosVendidos(){
        ArrayList vehiculosVendidos = null;
        return vehiculosVendidos;
    }
}
