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
public class Vehiculof {
    
        
        private String placa;
        private String horae;
        private String horas;
        private double tarifa;

    public Vehiculof(String placa, String horae, String horas,double tarifa) {
        
        this.placa = placa;
        this.horae = horae;
        this.horas = horas;
        this.tarifa=tarifa;
    }

  
    

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
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

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }
        
        
    public static Vehiculof crearV(String placa, String horae, String horas,double tarifa) {
        return new Vehiculof(placa,horae,horas,tarifa);
        
    }
        
        
}
