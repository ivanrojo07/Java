/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_conexion;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Toshiba
 */
public class Mostrar extends javax.swing.JFrame {

    /**
     * Creates new form Mostrar
     */
    DefaultTableModel model;
    public Mostrar() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Contenido de la tabla ");
    cargar();
    }
    
     void filtrar(String valor){
        String [] titulos={"cue_profesor","nombre","apellido_1","apellido_2","direccion","sueldo","tel"};
        String [] registro=new String[7];
        String sql="SELECT * FROM profesores where CONCAT(cue_profesor,' ',nombre,' ',ap1,' ',ap2,' ',dir,' ',sueldo,' ',tel  ) LIKE '%"+valor+"%'";
        
        model= new DefaultTableModel(null, titulos);
        
        conectar cc=new conectar();
        Connection cn=cc.conexion();
        
        try {
            Statement st=cn.createStatement();
            ResultSet result=st.executeQuery(sql);
            while(result.next())
            {
                registro[0]=result.getString("cue_profesor");
                registro[1]=result.getString("nombre");
                registro[2]=result.getString("ap1");
                registro[3]=result.getString("ap2");
                registro[4]=result.getString("dir");
                registro[5]=result.getString("sueldo");
                registro[6]=result.getString("tel");
                model.addRow(registro);
            }
            table.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(Mostrar.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
    void cargar(){
        String [] titulos={"cue_profesor","nombre","apellido_1","apellido_2","direccion","sueldo","tel"};
        String [] registro=new String[7];
        String sql="SELECT * FROM profesores";
        
        model= new DefaultTableModel(null, titulos);
        
        conectar cc=new conectar();
        Connection cn=cc.conexion();
        
        try {
            Statement st=cn.createStatement();
            ResultSet result=st.executeQuery(sql);
            while(result.next())
            {
                registro[0]=result.getString("cue_profesor");
                registro[1]=result.getString("nombre");
                registro[2]=result.getString("ap1");
                registro[3]=result.getString("ap2");
                registro[4]=result.getString("dir");
                registro[5]=result.getString("sueldo");
                registro[6]=result.getString("tel");
                model.addRow(registro);
            }
            table.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(Mostrar.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
        
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        buscando = new javax.swing.JLabel();
        buscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(640, 480));
        setResizable(false);
        getContentPane().setLayout(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(43, 24, 527, 180);

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(485, 330, 53, 23);

        buscando.setForeground(new java.awt.Color(255, 255, 255));
        buscando.setText("Buscar");
        getContentPane().add(buscando);
        buscando.setBounds(92, 333, 32, 14);

        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarKeyReleased(evt);
            }
        });
        getContentPane().add(buscar);
        buscar.setBounds(142, 330, 96, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba_conexion/amarillo.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -90, 800, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyReleased
filtrar(buscar.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_buscarKeyReleased

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
            java.util.logging.Logger.getLogger(Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mostrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buscando;
    private javax.swing.JTextField buscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
