/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import datos.Registro;

import java.util.ArrayList;

/**
 *
 * @author 57321
 */
public class DepVenta {
    
    private ArrayList<Registro> registros;
    public Long gananciasGeneradas = 0L;
    
    public DepVenta() {
        if(this.registros == null){
            this.registros = new ArrayList();
        }
    }

    public void setRegistros(ArrayList<Registro> registros) {
        this.registros = registros;
    }
    
    
    public Long getGananciasGeneradas() {
        return gananciasGeneradas;
    }

    public void setGananciasGeneradas(Long gananciasGeneradas) {
        this.gananciasGeneradas = gananciasGeneradas;
    }
    
    public boolean agregarVenta(Registro registro){
        if(registro == null){
            return false;
        }
        if(this.registros.add(registro)){          
            return true;
        }
        
        return false;
    }
    public void mostrar(){
        for(int i=0; i<this.registros.size(); i++){
            System.out.println(registros.get(i).getCliente().getCedula());
        }
    }
    public ArrayList<Registro> getRegistros() {
        return registros;
    }
    
    
}
