/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.*;
import org.apache.catalina.CometEvent;



/**
 *
 * @author Ivan Rojo
 */
public class LoginAction {
    
    private String user;
    private String password;
    private String name;
    
    public String execute(){
        
        CometEvent.EventType ret = ERROR;
        Connection conn=null;
        
        try{
            String URL="jdbc:mysql://localhost/struts_tutorial";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL,"root","root123");
            String sql= "SELECT name FROM login WHERE";
            sql +=" user = ? AND password = ?";
            PreparedStatement ps= conn.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, password);
            ResultSet rs= ps.executeQuery();
            
            while(rs.next()){
                name=rs.getString(1);
                ret=SUCCESS;
            }
        }catch (Exception e){
            ret=ERROR;
        }finally{
            if (conn != null){
                try{
                    conn.close();
                }catch(Exception e){
                    
                }
            }
        }
        return ret;
    }
    public String getUser(){
        return user;
    }
    public void setUser(String user){
        this.user = user;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
