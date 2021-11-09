/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import datos.Vehiculo;
import java.util.ArrayList;

/**
 *
 * @author 57321
 */
public class Almacen {
    private ArrayList<Vehiculo> vehiculosComprados;

    public Almacen() {
        this.vehiculosComprados = new ArrayList();
    }

    public ArrayList<Vehiculo> mostrarVehiculos() {
        return vehiculosComprados;
    }

    public void setVehiculosComprados(ArrayList<Vehiculo> vehiculosComprados) {
        this.vehiculosComprados = vehiculosComprados;
    }
    
    public boolean ventaVehiculo(Vehiculo vehiculo){
        if(vehiculo == null){
            return false;
        }
        if(this.vehiculosComprados.remove(vehiculo)){
            return true;
        }
        return false;
    }
    
    public boolean agregarVehiculo(Vehiculo vehiculo){
        if(vehiculo == null){
            return false;
        }
        if(this.vehiculosComprados.add(vehiculo)){
            return true;
        }
        return false;
    }
    
    public Vehiculo buscarVehiculo(String matricula){
        if(matricula == null){
            return null;
        }
        for (Vehiculo vehiculo1 : vehiculosComprados){
            if(vehiculo1.getMatricula() == matricula){
                return vehiculo1;
            }
        }
        return null;
    }
}
