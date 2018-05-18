/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;

import BD.DBManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Logica.*;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Clint
 */
public class RepositorioVehiculo {
 
        int cont =0;    
        private static DBManager database = new DBManager();

    public static void insertarAuto ( Vehiculo vehiculo) {
        try {
            
            String query = "INSERT INTO public.vehiculo(placa, horaentrada)VALUES (?,?);";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
           // sentenciaP.setInt(1, recreacionista.getId());
            
            sentenciaP.setString(1, vehiculo.getPlaca());
            sentenciaP.setString(2, vehiculo.getHorae());

            
            sentenciaP.executeUpdate();
            sentenciaP.close();
            database.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
    public static ArrayList<Vehiculo> obtenerTodos() {
        ArrayList<Vehiculo> eventos = new ArrayList<Vehiculo>();

        try {
            String query = "SELECT * FROM vehiculo;";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            ResultSet resultado = sentenciaP.executeQuery();
//String nombre,String horaI, String horaF, String Usuario,String descripcion,String fechaS
            while (resultado.next()) {
                eventos.add(Vehiculo.crearV(resultado.getString("placa"), resultado.getString("horaentrada")));
            }
            
            sentenciaP.close();
            database.close();
            
            return eventos;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return eventos;
    }
    
    
}
