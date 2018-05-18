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
        private String fechae;
        private String fechas;

    public Vehiculof(String placa, String horae, String horas,double tarifa,String fechae,String fechas) {
        
        this.placa = placa;
        this.horae = horae;
        this.horas = horas;
        this.tarifa=tarifa;
        this.fechae=fechae;
        this.fechas=fechas;
    }

    public String getFechae() {
        return fechae;
    }

    public void setFechae(String fechae) {
        this.fechae = fechae;
    }

    public String getFechas() {
        return fechas;
    }

    public void setFechas(String fechas) {
        this.fechas = fechas;
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
        
        
    public static Vehiculof crearV(String placa, String horae, String horas,double tarifa,String fechae,String fechas) {
        return new Vehiculof(placa,horae,horas,tarifa,fechae,fechas);
        
    }
        
        
}
