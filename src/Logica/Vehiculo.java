/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Clint
 */
public class Vehiculo {
    
    
    private String placa;
    private String horae;
    private String fechae;

    public Vehiculo(String placa, String horae,String fechae) {
        
        this.placa = placa;
        this.horae = horae;
        this.fechae=fechae;
    }

    public String getFechae() {
        return fechae;
    }

    public void setFechae(String fechae) {
        this.fechae = fechae;
    }

  
    
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getHorae() {
        return horae;
    }

    public void setHorae(String horae) {
        this.horae = horae;
    }
    
    public static Vehiculo crearV(String placa,String horae,String fechae) {
        return new Vehiculo(placa,horae,fechae);
        
    }
    
    
}
