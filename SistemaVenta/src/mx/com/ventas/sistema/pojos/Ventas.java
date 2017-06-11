/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ventas.sistema.pojos;

import java.sql.Date;



/**
 *
 * @author Ivan Rojo
 */
public class Ventas {
    private int idVenta;
    private double montoVenta;
    private Date fechaVenta;

    public Ventas( double montoVenta, Date fechaVenta) {
        //this.idVenta = idVenta;
        this.montoVenta = montoVenta;
        this.fechaVenta = fechaVenta;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public double getMontoVenta() {
        return montoVenta;
    }

    public void setMontoVenta(double montoVenta) {
        this.montoVenta = montoVenta;
    }
    
    
}
