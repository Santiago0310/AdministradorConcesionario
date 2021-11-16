/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author 57321
 */
public class Vehiculo {
    private String matricula;
    private String marca;
    private String color;
    private int numPuertas;
    private Long precioCompra;
    private Long precioVenta;
    private String tipoVehiculo;

    public Vehiculo() {
    }
    
    public Vehiculo(String matricula, String marca, String color, int numPuertas, Long precioCompra, Long precioVenta, String tipoVehiculo) {
        this.matricula = matricula;
        this.marca = marca;
        this.color = color;
        this.numPuertas = numPuertas;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.tipoVehiculo = tipoVehiculo;
    }

    public Vehiculo(String matricula, String marca, String color, int numPuertas, Long precioCompra, String tipoVehiculo) {
        this.matricula = matricula;
        this.marca = marca;
        this.color = color;
        this.numPuertas = numPuertas;
        this.precioCompra = precioCompra;
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public Long getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Long precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Long getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Long precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
    
    
    
}
