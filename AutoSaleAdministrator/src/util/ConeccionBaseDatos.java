/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import datos.Cliente;
import datos.Registro;
import datos.Vehiculo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import logica.Almacen;
import logica.DepVenta;

/**
 *
 * @author 57321
 */
public class ConeccionBaseDatos {
    
    private static ArrayList<Vehiculo> vehiculos;
    private static ArrayList<Cliente>  clientes;
    private static DepVenta venta;
    private static Almacen almacen;
    
    public static void conectar(){
        vehiculos = new ArrayList();
        clientes = new ArrayList();
        venta = new DepVenta();
        almacen = new Almacen();
        Scanner escaner = new Scanner(System.in);
        Connection connection ;
	int numPuertas1,cedula1;
        Long precioCompra1, precioVenta1;
	String matricula1, marca1, color1, tipoVehciulo1, nombre1;                                       /* connection = DriverManager.getConnection (url ,user, pass);*/
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection ("jdbc:mysql://localhost:3306/basedatosautosale", "root", "0310");
        Statement statement = connection.createStatement();    
        //statement.executeUpdate("INSERT INTO vehiculos(matricula, marca, color, numPuertas, tipoVehiculo, precioCompra, precioVenta)"+"VALUES('ERT101', 'AUDI', 'NEGRO', 4, 'CARRO', 45000000, 50000000)");
        //statement.executeUpdate("INSERT INTO clientes(cedula, nombre, matricula)"+"VALUES(1030696, 'Daniel','ERT101')");
            ResultSet leer = statement.executeQuery("SELECT * FROM vehiculos");
            while (leer.next())
            {
	        matricula1   = leer.getString("matricula");
                marca1 = leer.getString("marca");
	        color1 = leer.getString("color");
                numPuertas1 = leer.getInt("numPuertas");
	        tipoVehciulo1 = leer.getString("tipoVehiculo");
                precioCompra1 = leer.getLong("precioCompra");
                precioVenta1 = leer.getLong("precioVenta");
                Vehiculo vehiculo = new Vehiculo(matricula1, marca1, color1, numPuertas1, precioCompra1, precioVenta1, tipoVehciulo1);
                vehiculos.add(vehiculo);
	        System.out.println(matricula1 + " " + marca1 + " " + color1 + " " + numPuertas1 + " " + tipoVehciulo1 + " " + precioCompra1 + " " + precioVenta1);
	    }
        leer.close(); //Cerrando resultset
        ResultSet leer2 = statement.executeQuery("SELECT * FROM clientes");
            while (leer2.next())
            {
	        cedula1   = leer2.getInt("cedula");
                nombre1 = leer2.getString("nombre");
	        matricula1 = leer2.getString("matricula");
                Cliente cliente = new Cliente(cedula1, nombre1);
                Gestion(cliente, matricula1);
                clientes.add(cliente);
	        System.out.println(cedula1 + " " + nombre1 + " " + matricula1);
	    }
        leer2.close(); //Cerrando resultset
        almacen.setVehiculosComprados(vehiculos);        
	statement.close(); //Cerrando statement
	connection.close(); //Cerrando connection
        }catch(SQLException e ){
            System.out.println("Error en MySQL");
        }catch(ClassNotFoundException e ){
            e.printStackTrace();
        }catch(Exception e ){
            System.out.println("Se ha encontrado el siguiente error: "+e.getMessage());
        }  
    }

    private static void Gestion(Cliente cliente, String matricula1) {
        for(int i = 0; i<vehiculos.size(); i++){
            if(vehiculos !=null && vehiculos.get(i).getMatricula().equals(matricula1)){
                Registro registro = new Registro(cliente, vehiculos.get(i));
                venta.agregarVenta(registro);
                venta.gananciasGeneradas += vehiculos.get(i).getPrecioVenta();
                vehiculos.remove(i);
            }
        }
    }
    
    public static void AgregarVehiculo(Vehiculo v){
        Connection connection ;
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection ("jdbc:mysql://localhost:3306/basedatosautosale", "root", "0310");
        Statement statement = connection.createStatement();    
        statement.executeUpdate("INSERT INTO vehiculos(matricula, marca, color, numPuertas, tipoVehiculo, precioCompra, precioVenta)"+"VALUES('"+v.getMatricula()+"', '"+v.getMarca()+"', '"+v.getColor()+"', "+v.getNumPuertas()+", '"+v.getTipoVehiculo()+"', "+v.getPrecioCompra()+", "+v.getPrecioVenta()+")");
        statement.close(); //Cerrando statement
	connection.close(); //Cerrando connection
        }catch(SQLException e ){
            System.out.println("Error en MySQL");
        }catch(ClassNotFoundException e ){
            e.printStackTrace();
        }catch(Exception e ){
            System.out.println("Se ha encontrado el siguiente error: "+e.getMessage());
        } 
    }
    
    public static void AgregarCliente(Cliente c, Vehiculo v) {
        Connection connection ;
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection ("jdbc:mysql://localhost:3306/basedatosautosale", "root", "0310");
        Statement statement = connection.createStatement();    
        statement.executeUpdate("INSERT INTO clientes(cedula, nombre, matricula)"+"VALUES("+c.getCedula()+", '"+c.getNombre()+"','"+v.getMatricula()+"')");
        statement.close(); //Cerrando statement
	connection.close(); //Cerrando connection
        }catch(SQLException e ){
            System.out.println("Error en MySQL");
        }catch(ClassNotFoundException e ){
            e.printStackTrace();
        }catch(Exception e ){
            System.out.println("Se ha encontrado el siguiente error: "+e.getMessage());
        } 
    }

    public static DepVenta getVenta() {
        return venta;
    }

    public static void setVenta(DepVenta venta) {
        ConeccionBaseDatos.venta = venta;
    }

    public static Almacen getAlmacen() {
        return almacen;
    }

    public static void setAlmacen(Almacen almacen) {
        ConeccionBaseDatos.almacen = almacen;
    }

    
    
    

}
