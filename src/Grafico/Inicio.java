/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafico;

/**
 *
 * @author Clint
 */

import BD.DBManager;
import Logica.*;
import Repositorios.RepositorioVehiculo;
import java.sql.Connection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
public class Inicio extends javax.swing.JFrame {

    
    ArrayList<Vehiculo> lista1 = new ArrayList<Vehiculo>();
    ArrayList<Vehiculof> lista2 = new ArrayList<Vehiculof>();
    ArrayList<LugarE> lista3 = new ArrayList<LugarE>();
    Map<Integer, String> lugares = new HashMap<Integer, String>();
    Estacionamiento es;
    Vehiculo ve;
    Vehiculof vef;
    int cont=0;
    
    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        placa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(697, 380));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Placa :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 60, 70, 22);
        getContentPane().add(placa);
        placa.setBounds(90, 60, 90, 20);

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(70, 100, 90, 23);

        jToggleButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Clint\\Documents\\NetBeansProjects\\estacionamiento\\src\\imagenes\\e.jpg")); // NOI18N
        jToggleButton1.setMaximumSize(new java.awt.Dimension(261, 137));
        jToggleButton1.setMinimumSize(new java.awt.Dimension(261, 137));
        jToggleButton1.setPreferredSize(new java.awt.Dimension(261, 137));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(50, 240, 50, 50);

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Clint\\Documents\\NetBeansProjects\\estacionamiento\\src\\imagenes\\salida.jpg")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(130, 240, 50, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Clint\\Documents\\NetBeansProjects\\estacionamiento\\src\\imagenes\\titan3.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(230, -10, 500, 360);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Clint\\Documents\\NetBeansProjects\\estacionamiento\\src\\imagenes\\regis.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 230, 350);

        jMenu1.setText("Herramientas");

        jMenuItem2.setText("Consultas");
        jMenu1.add(jMenuItem2);

        jMenuItem1.setText("Generar Reporte");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        // TODO add your handling code here:
        Salida s = new Salida();
        s.cargad(lugares,lista1);
        
        s.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            String p = placa.getText();
            int lugar = (int) (Math.random() * 30) + 1;
            LocalDateTime fecha_actual = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String fecha1 = fecha_actual.format(formatter);
            String fecha2 = fecha_actual.format(formatter2);
            if(!lugares.containsValue(p)){
                if(lugares.size()<30){
                    cont++;
                    lugares.put(lugar, p);
                    Vehiculo v = new Vehiculo(p,fecha1,fecha2);
                    lista1.add(v);
                    RepositorioVehiculo.insertarAuto(v);
                    JOptionPane.showMessageDialog(this, "Auto estacionado en el espacio : "+lugar, "Bien", JOptionPane.INFORMATION_MESSAGE);

                }else{
                   JOptionPane.showMessageDialog(this, "PARQUEADERO LLENO");
                }
            }else{
                JOptionPane.showMessageDialog(this, "AUTO YA REGISTRADO");
            }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        //lista1=RepositorioVehiculo.obtenerTodos();
        //Registros r = new Registros();
        //r.setVisible(true);
        
        try {
            JasperReport reporte = JasperCompileManager.compileReport("reporteVehiculoF.jrxml");
            JasperPrint print = JasperFillManager.fillReport(reporte,null,ce );
            JasperViewer.viewReport(print);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:

        Estacionamiento e = new Estacionamiento();
        e.mostrar(lugares);
        e.ocupar();
        e.setVisible(true);

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField placa;
    // End of variables declaration//GEN-END:variables
DBManager c = new DBManager();
Connection ce = c.open();
}
