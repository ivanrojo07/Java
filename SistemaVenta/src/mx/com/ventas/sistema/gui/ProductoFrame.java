/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ventas.sistema.gui;

import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import mx.com.ventas.sistema.datos.BaseDatos;
import mx.com.ventas.sistema.pojos.Categoria;
import mx.com.ventas.sistema.pojos.Producto;
import mx.com.ventas.sistema.pojos.Proveedor;

/**
 *
 * @author Ivan Rojo
 */
public class ProductoFrame extends javax.swing.JDialog {

    /**
     * Creates new form ArticuloFrame
     */
    DefaultComboBoxModel<Categoria> modeloCategorias;
    DefaultComboBoxModel<Proveedor> modeloProveedor;
    BaseDatos bd;
    boolean estaActualizando;
    String informacion = "";
    
    public ProductoFrame(java.awt.Frame parent, boolean modal, Producto producto, ImageIcon icon, String titulo, boolean actualizando) {
        super(parent, modal);
        modeloCategorias = new DefaultComboBoxModel<Categoria>();
        modeloProveedor = new  DefaultComboBoxModel<Proveedor>();
        bd = new BaseDatos();
        cargarModeloCat();
        cargarModeloProv();
        initComponents();
        
        this.estaActualizando = actualizando;
        this.setTitle(titulo);
        if(producto!=null){
            cargarProducto(producto, icon);
            
        }
    }
    
    private void cargarProducto(Producto producto, ImageIcon icono) {
        
        //Redimension de imagen para ajustarla al tamaño del JLabel
            Image imgProd = icono.getImage();
            int anchoEtiqueta = lblImagenArticulo.getWidth();
            int altoEtiqueta = lblImagenArticulo.getHeight();
            
            //Se crea un nuevo objeto Image con la imagen redimensionada
            Image imgRedimensionada = imgProd.getScaledInstance(anchoEtiqueta, altoEtiqueta, Image.SCALE_DEFAULT);
            
            //Crea un nuevo objeto ImagenIcon a partir de la imagen redimensionada
            ImageIcon iconRedimensionado = new ImageIcon(imgRedimensionada);
            
            //Establecemos la imagen reidmensionada como icono de la etiqueta de imagen
            lblImagenArticulo.setIcon(iconRedimensionado);
        
        
        String clave = producto.getIdProducto();
        String nombre = producto.getNomProducto();
        String descripcion = producto.getDescProducto();
        double stockRequerido = producto.getStockProducto();
        String unidad = producto.getUnidadProducto();
        double precioCompra = producto.getPrecioCompraProducto();
        double precioVenta = producto.getPrecioVentaProducto();
        
        
        campoclave.setText(clave);
        camponombre.setText(nombre);
        areaDescripcion.setText(descripcion);
        campoStock.setText(String.valueOf(stockRequerido));
        comboUnidades.setSelectedItem(unidad);
        
        campoPrecioCompra.setText(String.valueOf(precioCompra));
        campoPrecioVenta.setText(String.valueOf(precioVenta));
        
        campoclave.setEnabled(false);
        camponombre.setEnabled(false);
        
    }
    
    private void cargarModeloCat(){
        ArrayList<Categoria> listacategoria;
        listacategoria = bd.obtenerCategorias();
        for(Categoria categoria : listacategoria){
            modeloCategorias.addElement(categoria);
        }
    }
    private void cargarModeloProv(){
        ArrayList<Proveedor> listaproveedor;
        listaproveedor = bd.obtenerProveedores();
       
        for(Proveedor proveedor : listaproveedor){
            modeloProveedor.addElement(proveedor);
        }
    }
    String getInformacion() {
        return this.informacion;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabel1 = new javax.swing.JLabel();
        campoclave = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaDescripcion = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        campoStock = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboCategoria = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        comboUnidades = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campoPrecioCompra = new javax.swing.JTextField();
        campoPrecioVenta = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        comboProveedor = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        lblImagenArticulo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        camponombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Clave: ");

        jLabel2.setText("Descripcion: ");

        areaDescripcion.setColumns(20);
        areaDescripcion.setRows(5);
        jScrollPane1.setViewportView(areaDescripcion);

        jLabel3.setText("Stock requerido: ");

        jLabel4.setText("Categoria: ");

        comboCategoria.setModel(modeloCategorias);

        jButton2.setText("Nueva Categoria");

        jLabel5.setText("Unidad de medida: ");

        comboUnidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilogramo", "Pieza", "Litro" }));

        jLabel6.setText("Precio de compra: ");

        jLabel7.setText("Precio de venta: ");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel9.setText("Proveedor: ");

        comboProveedor.setModel(modeloProveedor);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        lblImagenArticulo.setBackground(new java.awt.Color(0, 0, 0));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jPanel1, org.jdesktop.beansbinding.ObjectProperty.create(), lblImagenArticulo, org.jdesktop.beansbinding.BeanProperty.create("labelFor"));
        bindingGroup.addBinding(binding);

        lblImagenArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblImagenArticuloMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblImagenArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblImagenArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel8.setText("Nombre Producto:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                                    .addComponent(campoclave))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(comboUnidades, 0, 137, Short.MAX_VALUE)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel8)
                                            .addComponent(camponombre))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(comboCategoria, javax.swing.GroupLayout.Alignment.LEADING, 0, 94, Short.MAX_VALUE)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(campoPrecioCompra, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(campoPrecioVenta)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(comboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campoStock, javax.swing.GroupLayout.Alignment.LEADING)))))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoclave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(camponombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar))
                .addGap(45, 45, 45))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents
    File imgArticleFile;
    private void lblImagenArticuloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagenArticuloMousePressed

        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "Archivos de imagen jpg, gif o png", "jpg", "gif", "png");
        chooser.setFileFilter(filter);
        
        int returnVal = chooser.showOpenDialog(this);
        if(returnVal ==JFileChooser.APPROVE_OPTION){
            int anchoImagen = lblImagenArticulo.getWidth();
            int altoImagen = lblImagenArticulo.getHeight();
            
            imgArticleFile = chooser.getSelectedFile();
            ImageIcon icono = new ImageIcon(imgArticleFile.getAbsolutePath());
            Image imagen = icono.getImage();
            Image imagenRedimensionada = imagen.getScaledInstance(anchoImagen, altoImagen, Image.SCALE_DEFAULT);
            
            ImageIcon iconoRedimensionado = new ImageIcon(imagenRedimensionada);
            
            lblImagenArticulo.setIcon(iconoRedimensionado);
            
        }
        
    }//GEN-LAST:event_lblImagenArticuloMousePressed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        String codigo = campoclave.getText().toLowerCase();
        String nombre = camponombre.getText().toLowerCase();
        String descripcion = areaDescripcion.getText().toLowerCase();
        double preciocompra = Double.parseDouble(campoPrecioCompra.getText());
        double precioventa = Double.parseDouble(campoPrecioVenta.getText());
        double stock = Double.parseDouble(campoStock.getText());
        String unidad = (String) comboUnidades.getSelectedItem();
        Categoria categoria = (Categoria) comboCategoria.getSelectedItem();
        Proveedor proveedor = (Proveedor) comboProveedor.getSelectedItem();
        
        if(estaActualizando== true){
            if(imgArticleFile == null){
                Producto producto = new Producto(codigo, nombre, descripcion, 
                        stock, null, unidad, preciocompra, precioventa,
                        0.0, categoria.getIdCategoriaProd(), proveedor.getIdProveedor());
                bd.actualizarProducto(producto, false);
            }
            else{
                Producto producto = new Producto(codigo, nombre, descripcion, 
                        stock, imgArticleFile, unidad, preciocompra, precioventa, 
                        0.0, categoria.getIdCategoriaProd(), proveedor.getIdProveedor());
                bd.actualizarProducto(producto, true);
            }
            JOptionPane.showMessageDialog(this, "Se ha guardado el producto");
            this.dispose();
            informacion="1";
        }
       
        else{     
        if(estaActualizando == false && imgArticleFile == null){
                JOptionPane.showMessageDialog(this, "Favor elegir una fotografía de producto");
        }
        else{
                Producto producto = new Producto(codigo, nombre, descripcion, stock, 
                    imgArticleFile, unidad, preciocompra, precioventa, 0.0,
                    categoria.getIdCategoriaProd(), proveedor.getIdProveedor());
           
                bd.insertarProducto(producto);
                JOptionPane.showMessageDialog(this, "Se realizó correctamente la inserción");
                this.dispose();
        }
        }
        
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(ProductoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ProductoFrame dialog = new ProductoFrame(new javax.swing.JFrame(), true,null,null, "Nuevo producto",false);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaDescripcion;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JTextField campoPrecioCompra;
    private javax.swing.JTextField campoPrecioVenta;
    private javax.swing.JTextField campoStock;
    private javax.swing.JTextField campoclave;
    private javax.swing.JTextField camponombre;
    private javax.swing.JComboBox<Categoria> comboCategoria;
    private javax.swing.JComboBox<Proveedor> comboProveedor;
    private javax.swing.JComboBox<String> comboUnidades;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImagenArticulo;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    

    
}
