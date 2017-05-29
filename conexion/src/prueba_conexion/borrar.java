/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ivanrojo
 */
public class borrar extends javax.swing.JFrame {

    /**
     * Creates new form borrar
     */
   DefaultTableModel model;
    public borrar() {
        initComponents();
          setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Borrar registros ");
    cargar();
    limpiar();
    bloquear();
    
    }
    
    void bloquear(){
        clave.setEnabled(false);
    }
    
     void desbloquear(){
        clave.setEnabled(true);
    }
    
    
    void limpiar(){
        buscar.setText("");
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
        String sql="SELECT * FROM profesores ";
        
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
    
    void borrare(){
        String a;
        a=buscar.getText();
        String sql="DELETE FROM profesores WHERE cue_profesor='"+a+"'";
        
        conectar cc=new conectar();
        Connection cn=cc.conexion();
        
         try {
            PreparedStatement st=cn.prepareStatement(sql);
            st.execute();
             JOptionPane.showMessageDialog( null,"Registro Borrado");
             cargar();
             limpiar();
             bloquear();
 
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog( null,ex);
            Logger.getLogger(Mostrar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        buscar = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        clave = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(480, 480));
        setResizable(false);
        getContentPane().setLayout(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
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
        jScrollPane1.setBounds(12, 13, 430, 130);

        jButton1.setText("Borrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 300, 63, 23);

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(40, 300, 77, 23);

        jLabel1.setBackground(new java.awt.Color(51, 255, 153));
        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("cve");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 270, 40, 20);

        buscar.setText("jTextField1");
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
        buscar.setBounds(110, 190, 87, 20);

        jButton3.setText("Comenzar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(340, 300, 81, 23);
        getContentPane().add(clave);
        clave.setBounds(210, 250, 63, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("Buscar");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 190, 70, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba_conexion/amarillo.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-10, -60, 510, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
borrare();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
desbloquear();      // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(borrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(borrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(borrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(borrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new borrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscar;
    private javax.swing.JTextField clave;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
