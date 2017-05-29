/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 *
 * @author Toshiba
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Conexion a MySQL");
      
    }
    
    void limpiar(){
        cuadro2.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cuadro1 = new javax.swing.JTextField();
        cuadro2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(320, 240));
        getContentPane().setLayout(null);

        jButton1.setText("conectar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(146, 122, 75, 23);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("user");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(29, 48, 21, 14);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(29, 77, 46, 14);

        cuadro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadro1ActionPerformed(evt);
            }
        });
        getContentPane().add(cuadro1);
        cuadro1.setBounds(121, 45, 174, 20);

        cuadro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadro2ActionPerformed(evt);
            }
        });
        getContentPane().add(cuadro2);
        cuadro2.setBounds(121, 74, 174, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conexion/Melissa Rauch.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setPreferredSize(new java.awt.Dimension(340, 440));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 340, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

      
        String a1, a2;
        a1=cuadro1.getText();
        a2=cuadro2.getText();
        Connection con=null;
        
        
        
          
       try {
           //cargar nuestro driver
           Class.forName("com.mysql.jdbc.Driver");
           
          
           con=DriverManager.getConnection("jdbc:mysql://localhost/Blog","root",a2);
           System.out.println("conexion establecida");
           JOptionPane.showMessageDialog(null, "conexion establecida");
           Ven op=new Ven();
       op.setVisible(true);
           
           
       } catch (ClassNotFoundException | SQLException e) {
           System.out.println("error de conexion");
           JOptionPane.showMessageDialog(null, "error de conexion "+e);
           limpiar();
       
       }
        
       
       
       
     
       


    }//GEN-LAST:event_jButton1ActionPerformed

    private void cuadro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadro2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuadro2ActionPerformed

    private void cuadro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadro1ActionPerformed
cuadro1.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_cuadro1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cuadro1;
    private javax.swing.JTextField cuadro2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
