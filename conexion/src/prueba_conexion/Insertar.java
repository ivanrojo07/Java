/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_conexion;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Toshiba
 */
public class Insertar extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Insertar() {
        
          initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Insertar datos");
    limpiar();
    bloquear();
    }

void limpiar()
{
    nom.setText("");
    ap1.setText("");
    ap2.setText("");
    dir.setText("");
    sueldo.setText("");
    tel.setText("");
    num.setText("");
}

void bloquear()
{
    nom.setEnabled(false);
     ap1.setEnabled(false);
      ap2.setEnabled(false);
       dir.setEnabled(false);
        sueldo.setEnabled(false);
         tel.setEnabled(false);
         nuevo.setEnabled(true);
         guardar.setEnabled(false);
         cancelar.setEnabled(false);
         num.setEnabled(false);
         
}

void desbloquear()
{
    nom.setEnabled(true);
     ap1.setEnabled(true);
      ap2.setEnabled(true);
       dir.setEnabled(true);
        sueldo.setEnabled(true);
         tel.setEnabled(true);
         nuevo.setEnabled(false);
         guardar.setEnabled(true);
         cancelar.setEnabled(true);
         num.setEnabled(true);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        ap1 = new javax.swing.JTextField();
        ap2 = new javax.swing.JTextField();
        dir = new javax.swing.JTextField();
        sueldo = new javax.swing.JTextField();
        tel = new javax.swing.JTextField();
        nuevo = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        num = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(640, 320));
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(51, 0, 0));
        jLabel1.setText("nombres");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(42, 43, 50, 14);

        jLabel2.setForeground(new java.awt.Color(51, 0, 0));
        jLabel2.setText("apellido materno");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(27, 83, 100, 14);

        jLabel3.setForeground(new java.awt.Color(51, 0, 0));
        jLabel3.setText("apellido paterno");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(27, 123, 100, 14);

        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("direccion");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(35, 163, 42, 14);

        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("sueldo");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(49, 204, 31, 14);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("telefono");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 244, 40, 14);

        nom.setText("jTextField3");
        nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomActionPerformed(evt);
            }
        });
        getContentPane().add(nom);
        nom.setBounds(187, 40, 183, 20);

        ap1.setText("jTextField4");
        ap1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ap1ActionPerformed(evt);
            }
        });
        getContentPane().add(ap1);
        ap1.setBounds(187, 80, 183, 20);

        ap2.setText("jTextField5");
        ap2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ap2ActionPerformed(evt);
            }
        });
        getContentPane().add(ap2);
        ap2.setBounds(187, 120, 183, 20);

        dir.setText("jTextField6");
        dir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dirActionPerformed(evt);
            }
        });
        getContentPane().add(dir);
        dir.setBounds(187, 160, 183, 20);

        sueldo.setText("jTextField7");
        sueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sueldoActionPerformed(evt);
            }
        });
        getContentPane().add(sueldo);
        sueldo.setBounds(187, 201, 183, 20);

        tel.setText("jTextField8");
        getContentPane().add(tel);
        tel.setBounds(187, 241, 115, 20);

        nuevo.setText("Nuevo");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });
        getContentPane().add(nuevo);
        nuevo.setBounds(470, 50, 63, 23);

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar);
        guardar.setBounds(460, 170, 71, 23);

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar);
        cancelar.setBounds(460, 100, 75, 23);

        salir.setText("salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir);
        salir.setBounds(480, 230, 51, 23);

        jLabel7.setForeground(new java.awt.Color(51, 0, 0));
        jLabel7.setText("cve_prof");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(37, 8, 43, 14);

        num.setText("jTextField1");
        getContentPane().add(num);
        num.setBounds(187, 5, 105, 20);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba_conexion/Karen-Gillan-21-620x350.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 640, 320);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
desbloquear(); 
limpiar();
num.requestFocus();// TODO add your handling code here:
    }//GEN-LAST:event_nuevoActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
bloquear();        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_salirActionPerformed

    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed
nom.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_nomActionPerformed

    private void ap1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ap1ActionPerformed
ap1.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_ap1ActionPerformed

    private void ap2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ap2ActionPerformed
ap2.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_ap2ActionPerformed

    private void dirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dirActionPerformed
dir.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_dirActionPerformed

    private void sueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sueldoActionPerformed
sueldo.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_sueldoActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
conectar cc=new conectar();
cc.conexion();

Connection cn=cc.conexion();

String cve, nm, a1, a2, dr, sue, tl;
String sql="";

cve=num.getText();
nm=nom.getText();
a1=ap1.getText();
a2=ap2.getText();
dr=dir.getText();
sue=sueldo.getText();
tl=tel.getText();

sql="INSERT INTO profesores(cue_profesor, nombre, ap1, ap2, dir,sueldo, tel) VALUES (?,?,?,?,?,?,?)";

        try {
            PreparedStatement psd=cn.prepareStatement(sql);
            psd.setString(1, cve);
            psd.setString(2, nm);
            psd.setString(3, a1);
            psd.setString(4, a2);
            psd.setString(5, dr);
            psd.setString(6, sue);
            psd.setString(7, tl);
            
           int n=psd.executeUpdate();
           if(n>0)
               JOptionPane.showMessageDialog(null, "Registro creado");
           bloquear();
           limpiar();
           
        } catch (SQLException ex) {
            Logger.getLogger(Insertar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_guardarActionPerformed

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
            java.util.logging.Logger.getLogger(Insertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insertar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ap1;
    private javax.swing.JTextField ap2;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField dir;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nom;
    private javax.swing.JButton nuevo;
    private javax.swing.JTextField num;
    private javax.swing.JButton salir;
    private javax.swing.JTextField sueldo;
    private javax.swing.JTextField tel;
    // End of variables declaration//GEN-END:variables
}
