/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemanomina;

/**
 *
 * @author Ivan Rojo
 */
public class EmpleadoPorComision extends Empleado{
    
    private double ventasBrutas;
    private double tarifaComision;
    
    public EmpleadoPorComision(String nom, String paterno, String materno, String nss, double ventas, double tarifa){
        super(nom, paterno, materno,nss);
        
        establecerVentasBrutas(ventas);
        establecerTarifaComision(tarifa);
        
    }
    
    public void establecerTarifaComision(double tarifa){
        if(tarifa>0.0 && tarifa<1.0){
            tarifaComision = tarifa;
        }
        else{
            tarifa =0.0;
        }
    }
    
    public double obtenerTarifaComision(){
        return tarifaComision;
    }
    
    public void establecerVentasBrutas(double ventas){
        if(ventas <0.0){
            ventasBrutas = 0.0;
        }
        else{
            ventasBrutas = ventas;
        }
    }
    
    public double obtenerVentasBrutas(){
        return ventasBrutas;
    }
    
    @Override
    public double ingresos(){
        return obtenerTarifaComision()*obtenerVentasBrutas();
    }
    
    @Override
    public String toString(){
        return String.format("Empleado por comision: %s\n%s: $%,.2f", 
                super.toString(),"ventas brutas", obtenerVentasBrutas(),
                "Tarifa de comisión", obtenerTarifaComision());
    }
    
}
