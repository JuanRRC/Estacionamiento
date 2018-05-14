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
        String h=he;
        String h2=hs;
        
       
        String[] parts = h.split(":");
        String horas1 = parts[0]; // 123
        String minutos1 = parts[1]; // 654321
        String segundos1 = parts[2];
        System.out.println(minutos1);
        int hoen=Integer.parseInt(minutos1);
        
        String[] parts2 = h2.split(":");
        String horas2 = parts2[0]; // 123
        String minutos2 = parts2[1]; // 654321
        String segundos2 = parts2[2];
        System.out.println(minutos2);
        int hosa = Integer.parseInt(minutos2);
        
        
    }
    
    
    public static String DiferenciaFechas(String vinicio, String vfinal){
 
            Date dinicio = null, dfinal = null;
            long milis1, milis2, diff;
 
            SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 
            try {
                    // PARSEO STRING A DATE
                    dinicio = sdf.parse(vinicio);
                    dfinal = sdf.parse(vfinal);                    
                   
            } catch (ParseException e) {
 
                    System.out.println("Se ha producido un error en el parseo");
            }
           
            //INSTANCIA DEL CALENDARIO GREGORIANO
            Calendar cinicio = Calendar.getInstance();
            Calendar cfinal = Calendar.getInstance();
 
            //ESTABLECEMOS LA FECHA DEL CALENDARIO CON EL DATE GENERADO ANTERIORMENTE
             cinicio.setTime(dinicio);
             cfinal.setTime(dfinal);
 
 
         milis1 = cinicio.getTimeInMillis();
 
         milis2 = cfinal.getTimeInMillis();
 
 
         diff = milis2-milis1;
 
 
         // calcular la diferencia en segundos
 
     long diffSegundos =  Math.abs (diff / 1000);
 
 
     // calcular la diferencia en minutos
 
     long diffMinutos =  Math.abs (diff / (60 * 1000));
 
     
     long restominutos = diffMinutos%60;
 
 
 
     // calcular la diferencia en horas
 
     long diffHoras =   (diff / (60 * 60 * 1000));
 
 
 
     // calcular la diferencia en dias
 
     long diffdias = Math.abs ( diff / (24 * 60 * 60 * 1000) );
 
 
     /*
     System.out.println("En segundos: " + diffSegundos + " segundos.");
 
     System.out.println("En minutos: " + diffMinutos + " minutos.");
 
     System.out.println("En horas: " + diffHoras + " horas.");
 
     System.out.println("En dias: " + diffdias + " dias.");
     */
 
     
     String devolver = String.valueOf(diffHoras + "H " + restominutos + "m ");
 
            return devolver;
    }
    
    
    
    
    
}
