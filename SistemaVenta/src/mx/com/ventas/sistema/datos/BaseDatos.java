/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ventas.sistema.datos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.ventas.sistema.pojos.Categoria;
import mx.com.ventas.sistema.pojos.DetalleVenta;
import mx.com.ventas.sistema.pojos.Producto;
import mx.com.ventas.sistema.pojos.Proveedor;
import mx.com.ventas.sistema.pojos.Ventas;

/**
 *
 * @author Ivan Rojo
 */
public class BaseDatos {
    
    Connection conn = null;
    PreparedStatement st= null;
    ResultSet rs = null; //interface
    
    public BaseDatos(){
        try {
            Class.forName("org.postgresql.Driver");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void insertarProducto(Producto producto){
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db-sistema", "postgres", "toor");
            File fileFoto = producto.getFotoProducto();
            FileInputStream fis = new FileInputStream(fileFoto);
            String sql = "INSERT INTO cat_productos (id_prod, nombre_prod,"
                    + " desc_prod, stock_prod, foto_prod, unidad_prod, "
                    + "precio_compra_prod, precio_venta_prod, existencia_prod,"
                    + "id_categoria_prod,id_proveedor) values(?,?,?,?,?,?,?,?,?,?,?)";
            st = conn.prepareStatement(sql);
            
           
            st.setString(1, producto.getIdProducto());
            st.setString(2, producto.getNomProducto());
            st.setString(3, producto.getDescProducto());
            st.setDouble(4, producto.getStockProducto());
            long tamanoFoto = fileFoto.length();
            st.setBinaryStream(5, fis, tamanoFoto);
            st.setString(6, producto.getUnidadProducto());
            st.setDouble(7, producto.getPrecioCompraProducto());
            st.setDouble(8, producto.getPrecioVentaProducto());
            st.setDouble(9, producto.getExistenciasProducto());
            st.setInt(10, producto.getIdCategoria());
            st.setInt(11, producto.getIdProveedor());
            
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                st.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    public void insertarCategoria(Categoria categoria){
       
            try {
                conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db-sistema", "postgres", "toor");
                String sql = "INSERT INTO cat_categorias ( nom_categoria_prod,"
                    + "desc_categoria_prod) values(?,?)";
                st = conn.prepareStatement(sql);
            
                //st.setInt(1, categoria.getIdCategoriaProd());
                st.setString(1, categoria.getNomCategoria());
                st.setString(2, categoria.getDescripCategoria());
            
                st.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally {
                try {
                    st.close();
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }             
    }
    
    
    public void insertarProveedor(Proveedor proveedor){
        try{
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db-sistema", "postgres", "toor");//Crear una nueva conexion
            String sql = "INSERT INTO cat_proveedores ( nom_proveedor, "
                    + "dir_proveedor, telefono_proveedor, email_proveedor, "
                    + "contacto_proveedor) values(?,?,?,?,?)";
            
            st = conn.prepareStatement(sql);
            
            //st.setInt(1, proveedor.getIdProveedor());
            st.setString(1, proveedor.getNomProveedor());
            st.setString(2, proveedor.getDirProveedor());
            st.setString(3, proveedor.getTelefonoProveedor());
            st.setString(4, proveedor.getEmailProveedor());
            st.setString(5, proveedor.getContactoProveedor());
            
            st.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try {
                st.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void insertarDetalleVenta(DetalleVenta detalleventa){
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db-sistema", "postgres", "toor");
            String sql =  "INSERT INTO detalle_venta (id_venta, "
                    + "id_prod, cantidad_vendida) values(?,?,?)";
            
            st = conn.prepareStatement(sql);
            
            //st.setInt(1, detalleventa.getIdDetalleVenta());
            st.setInt(1, detalleventa.getIdVenta());
            st.setString(2, detalleventa.getIdProducto());
            st.setDouble(3, detalleventa.getCantidadVendida());
            
            st.executeUpdate(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        finally{
            try {
                st.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    public void insertarVenta(Ventas venta){
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db-sistema", "postgres", "toor");
            String sql = "INSERT INTO ventas (monto_venta, fecha_venta) "
                    + "values(?,?)";
            st = conn.prepareStatement(sql);
            
            //st.setInt(1, venta.getIdVenta());
            st.setDouble(1, venta.getMontoVenta());
            st.setDate(2, venta.getFechaVenta());
            
            st.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try {
                conn.close();
                st.close();
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public ArrayList<Producto> obtenerProductos(){
        
        ArrayList<Producto> listaProductos = new ArrayList<Producto>();
       
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db-sistema", "postgres", "toor");
            
            String sql = "SELECT * FROM cat_productos ORDER BY id_prod";
            
            st = conn.prepareStatement(sql);
            
            rs = st.executeQuery();
            
           while(rs.next()){
               String idProd = rs.getString(1);
               String nomProd = rs.getString(2);
               String descProd = rs.getString(3);
               double stockProd = rs.getDouble(4);
//               byte fotoProd = rs.getByte(5);
               String unidadProd = rs.getString(6);
               double preciocomProd = rs.getDouble(7);
               double precioventProd = rs.getDouble(8);
               double existenProd = rs.getDouble(9);
               int idCategProd = rs.getInt(10);
               int idProveedor = rs.getInt(11);
               
               Producto producto = new Producto(idProd, nomProd, descProd, stockProd, 
                       null, unidadProd, preciocomProd, precioventProd, existenProd, idCategProd, idProveedor);
               listaProductos.add(producto);
                
//               System.out.println("ID: "+ idProd);
//               System.out.println("nombre: "+nomProd);
//               System.out.println("Descuento: "+descProd);
//               System.out.println("Stock: "+descProd);
//               //System.out.println("Foto: "+fotoProd);
//               System.out.println("Unidades: "+unidadProd);
//               System.out.println("Precio Compra: "+preciocomProd);
//               System.out.println("Precio Venta: "+precioventProd);
//               System.out.println("Existencia: "+existenProd);
//               System.out.println("Id Categoria: "+idCategProd);
//               System.out.println("Id Proveedor: "+idProveedor);
           }
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                st.close();
                conn.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        return listaProductos;
    }
    
    public ArrayList<Categoria> obtenerCategorias(){
        ArrayList<Categoria> listacategoria = new ArrayList<Categoria>();
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db-sistema", "postgres", "toor");
            
            String sql = "SELECT * FROM cat_categorias";
            
            st = conn.prepareStatement(sql);
            
            rs = st.executeQuery();
            
           while(rs.next()){
               int idcat= rs.getInt(1);
               String nombcat = rs.getString(2);
               String desccat = rs.getString(3);
               
               Categoria categoria = new Categoria(idcat, nombcat, desccat);
               
               listacategoria.add(categoria);
           }
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                st.close();
                conn.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        return listacategoria;
    }
    
    public ArrayList<Proveedor> obtenerProveedores(){
        ArrayList<Proveedor> listaproveedor = new ArrayList<Proveedor>();
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db-sistema", "postgres", "toor");
            String sql = "SELECT * FROM cat_proveedores";
            st = conn.prepareStatement(sql);
            
            rs = st.executeQuery();
            
            while(rs.next()){
                int idProve= rs.getInt(1);
                String nomProve = rs.getString(2);
                String dirProve = rs.getString(3);
                String telefProve= rs.getString(4);
                String emailProve= rs.getString(5);
                String contacProve= rs.getString(6);
                
                Proveedor proveedor = new Proveedor(idProve, nomProve, dirProve,
                        telefProve, emailProve, contacProve);
                
                listaproveedor.add(proveedor);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try {
                conn.close();
                st.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listaproveedor;
    }
    
    public ArrayList<DetalleVenta> obtenerDetalleVentas(){
        ArrayList<DetalleVenta> listadetalleventa = new ArrayList<DetalleVenta>();
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db-sistema", "postgres", "toor");
            String sql = "SELECT * FROM detalle_venta";
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                int idDetaVent = rs.getInt(1);
                int idVenta = rs.getInt(2);
                String idProd = rs.getString(3);
                double cantVendi= rs.getDouble(4);
                
                DetalleVenta detalleventa = new DetalleVenta(idDetaVent, idVenta,
                        idProd, cantVendi);
                
                listadetalleventa.add(detalleventa);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                conn.close();
                st.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return listadetalleventa;
    }
    
    public ArrayList<Ventas> obtenerVentas(){
        ArrayList<Ventas> listaventa = new ArrayList<Ventas>();
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db-sistema", "postgres", "toor");
            String sql = "SELECT * FROM ventas";
            st= conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                int idVenta = rs.getInt(1);
                double montoVenta= rs.getDouble(2);
                Date fechaVenta=rs.getDate(3);
                
                Ventas venta = new Ventas(idVenta, montoVenta, fechaVenta);
                listaventa.add(venta);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                conn.close();
                st.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return listaventa;
    }
    
    public void actualizarInventario(Producto producto, double cantidad){
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db-sistema", "postgres", "toor");
            String sql = "UPDATE cat_productos SET existencia_prod =? WHERE "
                    + "id_prod=?";
            st = conn.prepareStatement(sql);
            
           
            st.setDouble(1, cantidad);
            st.setString(2, producto.getIdProducto());
            
            
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                st.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
//    public static void main(String[] args) {
//        Categoria categoria = new Categoria(1, "Prueba2", "todo tipo de prueba");
//        BaseDatos base = new BaseDatos();
//        base.insertarCategoria(categoria);
//    }
//    public static void main(String[] args) {
//        BaseDatos bd = new BaseDatos();
//        bd.obtenerProductos();
//    }
    
}
