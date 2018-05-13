/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamiento;

import Grafico.Ventana;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Clint
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                    LocalDateTime fecha_actual = LocalDateTime.now();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
                    String fecha1 = fecha_actual.format(formatter);
                    
                    System.out.println(fecha1);
                    
                    
                    
                    
                    
                    
                    Ventana v=new Ventana();
                    v.setVisible(true);
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
        
    }
    
}
