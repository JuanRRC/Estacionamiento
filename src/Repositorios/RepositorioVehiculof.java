/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;

import BD.DBManager;
import Logica.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Clint
 */
public class RepositorioVehiculof {
    
     int cont =0;    
        private static DBManager database = new DBManager();

    public static void insertarAutofinal ( Vehiculof vehiculo) {
        try {
            
            String query = "INSERT INTO public.vehiculofinal(\n" +
"	placa, horaentrada, horasalida, pago)\n" +
"	VALUES (?, ?, ?, ?);";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
           // sentenciaP.setInt(1, recreacionista.getId());
            
            sentenciaP.setString(1, vehiculo.getPlaca());
            sentenciaP.setString(2, vehiculo.getHorae());
            sentenciaP.setString(3, vehiculo.getHoras());
            sentenciaP.setDouble(4, vehiculo.getTarifa());

            
            sentenciaP.executeUpdate();
            sentenciaP.close();
            database.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
    
    public static ArrayList<Vehiculof> obtenerTodos() {
        ArrayList<Vehiculof> vehiculosf = new ArrayList<Vehiculof>();

        try {
            String query = "SELECT * FROM vehiculofinal;";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            ResultSet resultado = sentenciaP.executeQuery();
//String nombre,String horaI, String horaF, String Usuario,String descripcion,String fechaS
            while (resultado.next()) {
                vehiculosf.add(Vehiculof.crearV(resultado.getString("placa"), resultado.getString("horaentrada"),resultado.getString("horasalida"),resultado.getDouble("pago")));
            }

            sentenciaP.close();
            database.close();

            return vehiculosf;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return vehiculosf;
    }
    
    
    
}
