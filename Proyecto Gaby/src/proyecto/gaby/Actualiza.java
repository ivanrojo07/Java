/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.gaby;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Ivan Rojo
 */
public class Actualiza extends javax.swing.JFrame {
DefaultTableModel model;
    /**
     * Creates new form Actualiza
     */
    public Actualiza() {
        initComponents();
        limpiar();
        bloquear();
        cargar();
    }
    
    void filtrar(String valor){
        String [] titulos={"clvasig","grupo","mat","profesor","lunes","martes","miercoles","jueves","viernes","salon","cupo"};
        String [] registro=new String[11];
        String sql="SELECT * FROM unsemestre where CONCAT(clvasig,' ',grupo,' ',mat,' ',profesor,' ',lunes,' ',martes,' ',miercoles,' ',jueves,' ',viernes,' ',salon,' ',cupo ) LIKE '%"+valor+"%'";
        
        model= new DefaultTableModel(null, titulos);
        
        conectar cc=new conectar();
        Connection cn=cc.conexion();
        
        try {
            Statement st=cn.createStatement();
            ResultSet result=st.executeQuery(sql);
            while(result.next())
            {
                registro[0]=result.getString("clvasig");
                registro[1]=result.getString("grupo");
                registro[2]=result.getString("mat");
                registro[3]=result.getString("profesor");
                registro[4]=result.getString("lunes");
                registro[5]=result.getString("martes");
                registro[6]=result.getString("miercoles");
                registro[7]=result.getString("jueves");
                registro[8]=result.getString("viernes");
                registro[9]=result.getString("salon");
                registro[10]=result.getString("cupo");
                model.addRow(registro);
            }
            table.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(Mostrar.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
    void cargar(){
        String [] titulos={"clvasig","grupo","mat","profesor","lunes","martes","miercoles","jueves","viernes","salon","cupo"};
        String [] registro=new String[11];
        String sql="SELECT * FROM unsemestre";
        
        model= new DefaultTableModel(null, titulos);
        
        conectar cc=new conectar();
        Connection cn=cc.conexion();
        
        try {
            Statement st=cn.createStatement();
            ResultSet result=st.executeQuery(sql);
            while(result.next())
            {
                registro[0]=result.getString("clvasig");
                registro[1]=result.getString("grupo");
                registro[2]=result.getString("mat");
                registro[3]=result.getString("profesor");
                registro[4]=result.getString("lunes");
                registro[5]=result.getString("martes");
                registro[6]=result.getString("miercoles");
                registro[7]=result.getString("jueves");
                registro[8]=result.getString("viernes");
                registro[9]=result.getString("salon");
                registro[10]=result.getString("cupo");
                model.addRow(registro);
            }
            table.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(Mostrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void limpiar(){
        clave.setText("");
        grupo.setText("");
        mat.setText("");
        profesor.setText("");
        lunes.setText("");
        martes.setText("");
        miercoles.setText("");
        jueves.setText("");
        viernes.setText("");
        salon.setText("");
        cupo.setText("");
        
    }
    
    void bloquear(){
        clave.setEnabled(false);
        grupo.setEnabled(false);
        mat.setEnabled(false);
        profesor.setEnabled(false);
        lunes.setEnabled(false);
        martes.setEnabled(false);
        miercoles.setEnabled(false);
        jueves.setEnabled(false);
        viernes.setEnabled(false);
        salon.setEnabled(false);
        cupo.setEnabled(false);
        botonmodificar.setEnabled(true);
        botonguardar.setEnabled(false);
        botoncancelar.setEnabled(false);
    }
    void seleccion(){
    int fila=table.getSelectedRow();
if(fila>=0){
    

clave.setText(table.getValueAt(fila, 0).toString());
grupo.setText(table.getValueAt(fila, 1).toString());
mat.setText(table.getValueAt(fila, 2).toString());
profesor.setText(table.getValueAt(fila, 3).toString());
lunes.setText(table.getValueAt(fila, 4).toString());
martes.setText(table.getValueAt(fila, 5).toString());
miercoles.setText(table.getValueAt(fila, 6).toString());
jueves.setText(table.getValueAt(fila, 7).toString());
viernes.setText(table.getValueAt(fila, 8).toString());
salon.setText(table.getValueAt(fila, 9).toString());
cupo.setText(table.getValueAt(fila, 10).toString());
numero.setText(table.getValueAt(fila, 0).toString());
    }                                     
else {
    JOptionPane.showMessageDialog(null, "Actualizado");
}
}
    void desbloquear(){
        clave.setEnabled(true);
        grupo.setEnabled(true);
        mat.setEnabled(true);
        profesor.setEnabled(true);
        lunes.setEnabled(true);
        martes.setEnabled(true);
        miercoles.setEnabled(true);
        jueves.setEnabled(true);
        viernes.setEnabled(true);
        salon.setEnabled(true);
        cupo.setEnabled(true);
        botonmodificar.setEnabled(false);
        botonguardar.setEnabled(true);
        botoncancelar.setEnabled(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        clave = new javax.swing.JTextField();
        grupo = new javax.swing.JTextField();
        mat = new javax.swing.JTextField();
        profesor = new javax.swing.JTextField();
        lunes = new javax.swing.JTextField();
        martes = new javax.swing.JTextField();
        miercoles = new javax.swing.JTextField();
        jueves = new javax.swing.JTextField();
        viernes = new javax.swing.JTextField();
        salon = new javax.swing.JTextField();
        cupo = new javax.swing.JTextField();
        botonmodificar = new javax.swing.JButton();
        botonguardar = new javax.swing.JButton();
        botoncancelar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        numero = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        botonsalir = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("clvasig");

        jLabel2.setText("grupo");

        jLabel3.setText("mat");

        jLabel4.setText("profesor");

        jLabel5.setText("llunes");

        jLabel6.setText("martes");

        jLabel7.setText("miercoles");

        jLabel8.setText("jueves");

        jLabel9.setText("viernes");

        jLabel10.setText("salon");

        jLabel11.setText("cupo");

        clave.setText("jTextField1");
        clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claveActionPerformed(evt);
            }
        });

        grupo.setText("jTextField2");
        grupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupoActionPerformed(evt);
            }
        });

        mat.setText("jTextField3");
        mat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matActionPerformed(evt);
            }
        });

        profesor.setText("jTextField4");
        profesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profesorActionPerformed(evt);
            }
        });

        lunes.setText("jTextField5");
        lunes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lunesActionPerformed(evt);
            }
        });

        martes.setText("jTextField6");
        martes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                martesActionPerformed(evt);
            }
        });

        miercoles.setText("jTextField7");
        miercoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miercolesActionPerformed(evt);
            }
        });

        jueves.setText("jTextField8");
        jueves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juevesActionPerformed(evt);
            }
        });

        viernes.setText("jTextField9");
        viernes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viernesActionPerformed(evt);
            }
        });

        salon.setText("jTextField10");
        salon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salonActionPerformed(evt);
            }
        });

        cupo.setText("jTextField11");
        cupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cupoActionPerformed(evt);
            }
        });

        botonmodificar.setText("Modificar");
        botonmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonmodificarActionPerformed(evt);
            }
        });

        botonguardar.setText("Guardar");
        botonguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonguardarActionPerformed(evt);
            }
        });

        botoncancelar.setText("Cancelar");
        botoncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoncancelarActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table);

        jLabel12.setText("insertar clvasig");

        botonsalir.setText("Salir");
        botonsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mat, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cupo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(clave, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                .addComponent(viernes, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jueves, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(miercoles)
                                .addComponent(grupo, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(martes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                    .addComponent(profesor)
                                    .addComponent(lunes))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(salon, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(220, 220, 220)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonguardar)
                            .addComponent(botonmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botoncancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(157, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(botonmodificar)
                        .addGap(127, 127, 127)
                        .addComponent(botoncancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mat, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(profesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(botonguardar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lunes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(martes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(miercoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jueves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(viernes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(botonsalir))))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonmodificarActionPerformed
        desbloquear();
    clave.requestFocus();
// TODO add your handling code here:
    }//GEN-LAST:event_botonmodificarActionPerformed

    private void botoncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoncancelarActionPerformed
    bloquear();        // TODO add your handling code here:
    }//GEN-LAST:event_botoncancelarActionPerformed

    private void botonguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonguardarActionPerformed
    conectar cc= new conectar();
    cc.conexion();
    
    Connection cn=cc.conexion();
    
    
    String clv,mate,grup,prof,lun,mart,mier,jue,vier,sal,cup;
    String sql="";
    
    clv=clave.getText();
    mate=mat.getText();
    prof=profesor.getText();
    lun=lunes.getText();
    mart=martes.getText();
    mier=miercoles.getText();
    jue=jueves.getText();
    vier=viernes.getText();
    sal=salon.getText();
    cup=cupo.getText();
    grup=grupo.getText();
    
    sql="update unsemestre set clvasig='"+clv+"', grupo='"+grup+"', mat='"+mate+
            "', profesor='"+prof+"', lunes='"+lun+"', martes='"+mart+"', miercoles='"+
            mier+"', jueves='"+jue+"', viernes='"+vier+"', salon='"+sal+"', cupo='"
            +cup+"' WHERE clvasig='"+numero.getText()+"';";
    
            try {
            PreparedStatement psd=cn.prepareStatement(sql);
            psd.executeUpdate();
               JOptionPane.showMessageDialog(null, "Listo");
               cargar();
           
           
        } catch (SQLException ex) {
            Logger.getLogger(Insertar.class.getName()).log(Level.SEVERE, null, ex);
        }

    
            
    // TODO add your handling code here:
    }//GEN-LAST:event_botonguardarActionPerformed

    private void claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claveActionPerformed
    clave.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_claveActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

        seleccion();// TODO add your handling code here:
    }//GEN-LAST:event_tableMouseClicked

    private void grupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupoActionPerformed
     
        grupo.transferFocus();// TODO add your handling code here:
    }//GEN-LAST:event_grupoActionPerformed

    private void matActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matActionPerformed

        mat.transferFocus();// TODO add your handling code here:
    }//GEN-LAST:event_matActionPerformed

    private void profesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profesorActionPerformed

        profesor.transferFocus();// TODO add your handling code here:
    }//GEN-LAST:event_profesorActionPerformed

    private void lunesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lunesActionPerformed
lunes.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_lunesActionPerformed

    private void martesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_martesActionPerformed

        martes.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_martesActionPerformed

    private void miercolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miercolesActionPerformed

        miercoles.transferFocus();// TODO add your handling code here:
    }//GEN-LAST:event_miercolesActionPerformed

    private void juevesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juevesActionPerformed

        jueves.transferFocus();// TODO add your handling code here:
    }//GEN-LAST:event_juevesActionPerformed

    private void viernesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viernesActionPerformed
viernes.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_viernesActionPerformed

    private void salonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salonActionPerformed

        salon.transferFocus();// TODO add your handling code here:
    }//GEN-LAST:event_salonActionPerformed

    private void cupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cupoActionPerformed

        cupo.transferFocus();// TODO add your handling code here:
    }//GEN-LAST:event_cupoActionPerformed

    private void botonsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonsalirActionPerformed
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_botonsalirActionPerformed

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
            java.util.logging.Logger.getLogger(Actualiza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actualiza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actualiza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actualiza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actualiza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botoncancelar;
    private javax.swing.JButton botonguardar;
    private javax.swing.JButton botonmodificar;
    private javax.swing.JButton botonsalir;
    private javax.swing.JTextField clave;
    private javax.swing.JTextField cupo;
    private javax.swing.JTextField grupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jueves;
    private javax.swing.JTextField lunes;
    private javax.swing.JTextField martes;
    private javax.swing.JTextField mat;
    private javax.swing.JTextField miercoles;
    private javax.swing.JTextField numero;
    private javax.swing.JTextField profesor;
    private javax.swing.JTextField salon;
    private javax.swing.JTable table;
    private javax.swing.JTextField viernes;
    // End of variables declaration//GEN-END:variables
}
