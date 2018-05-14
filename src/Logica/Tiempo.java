/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Clint
 */
public class Tiempo {
    
    private String horae;
    private String horas;

    public Tiempo(String horae, String horas) {
        this.horae = horae;
        this.horas = horas;
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
    
    public void diferencia(String he,String hs) throws ParseException{
        /*
        String h=he;
        String h2=hs;
        
       
        String[] parts = h.split(":");
        String dia1 = parts[0];
        String horas1 = parts[1]; 
        String minutos1 = parts[2];
        String segundos1 = parts[3];
        System.out.println(dia1);
        int hoen=Integer.parseInt(minutos1);
        
        String[] parts2 = h2.split(":");
        String dia2 = parts2[0];
        String horas2 = parts2[1];
        String minutos2 = parts2[2];
        String segundos2 = parts2[3];
        System.out.println(dia2);
        int hosa = Integer.parseInt(minutos2);
        */
        
    }
    
    
    public long calfe(String he,String hs) throws ParseException{
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd H:m:s");
 
        Date fechaInicial=dateFormat.parse(he);
        Date fechaFinal=dateFormat.parse(hs);
        
        long diff = fechaFinal.getTime() - fechaInicial.getTime();
        long segundos = diff / 1000;
        long minutos = segundos / 60;
        System.out.println(minutos);
        System.out.println(hs);
        System.out.println(he);
        
        return minutos;
        
    }
       
}
