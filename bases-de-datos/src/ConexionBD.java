/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ivan Rojo
 */
public class ConexionBD {
    Connection conn = null;
    //Statement st = null;//interface
    PreparedStatement st= null;
    ResultSet rs = null; //interface
    
    /*constructor de la clase*/
    public ConexionBD(){
        try{
            Class.forName("org.postgresql.Driver");
            
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/pedidos", "postgres", "toor");
            
            st = conn.prepareStatement("Select * from clientes where clienteid=?");
            st.setInt(1, 2);
            
            //st = conn.createStatement();
            //rs = st.executeQuery("SELECT * FROM clientes");
            rs = st.executeQuery();
            //st.executeUpdate("INSERT INTO clientes(clienteid, cedula_ruc, nombrecia, nombrecontacto, direccioncli)"
                    //+ "values (11, '123456789', 'Mi negocio', 'Veronica Vela', 'Domicilio desconocido')");
             //st.executeUpdate("UPDATE clientes SET nombrecia='KODIKAS' WHERE clienteid=1 ");
             //st.executeUpdate("DELETE FROM clientes WHERE clienteid=11 ");
            while(rs.next()){
                int id = rs.getInt("clienteid");
                String cedula = rs.getString(2);
                String nombrecia = rs.getString(3);
                String nombreContacto = rs.getString(4);
                String direccionCli = rs.getString(5);
                
                System.out.println("id: "+id);
                System.out.println("cedula: "+ cedula);
                System.out.println("nombrecia: "+nombrecia);
                System.out.println("nombre Contacto: "+nombreContacto);
                System.out.println("direccion Cliente: "+direccionCli);
            }
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    
    public static void main(String[] args) {
        new ConexionBD();
    }
}
