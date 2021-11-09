/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import datos.Cliente;
import datos.Vehiculo;
import java.util.ArrayList;

/**
 *
 * @author 57321
 */
public class Registro {
    private ArrayList<Vehiculo> vehiculosVendidos;
    private Cliente cliente;
    private Long totalGanancia;
    
    public Registro() {
        this.vehiculosVendidos = new ArrayList();
    }

    public ArrayList<Vehiculo> mostrarVehiculos() {
        return vehiculosVendidos;
    }

    public void setVehiculosVendidos(ArrayList<Vehiculo> vehiculosVendidos) {
        this.vehiculosVendidos = vehiculosVendidos;
    }

    public Long getTotalGanancia() {
        return totalGanancia;
    }

    public void setTotalGanancia(Long totalGanancia) {
        this.totalGanancia = totalGanancia;
    }
    
    public boolean agregarVehiculo(Vehiculo vehiculo){
        if(vehiculo == null){
            return false;
        }
        if(this.vehiculosVendidos.add(vehiculo)){
            return true;
        }
        return false;
    }
    
    
    
}
