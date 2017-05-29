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
public class EmpleadoPorHoras extends Empleado{
  
    private double sueldo;//sueldo por hora
    private double horas;//horasTrabajadas
    
    public EmpleadoPorHoras(String nom, String paterno, String materno, String nss, double horasTrabajadas, double salarioPorHoras){
        super(nom, paterno, materno,nss);
        establecerSueldo(salarioPorHoras);
        establecerHoras(horasTrabajadas);
    }
    
    public double obtenerSueldo(){
        return sueldo;
    }
    public void establecerSueldo(double su){
        if(su<0.0){
            sueldo =0.0;
        }else{
        sueldo = su;
        }
    }
    
    public double obtenerHoras(){
        return horas;
    }
    public void establecerHoras(double h){
        if((h>=0) && (h<=168)){
        horas = h;
        }else{
        horas = 0;
            }
    }

   
    @Override
    public String toString() {
        return String.format("Empleado por horas: %s\n%s: $%,.2f", 
                super.toString(),"Salario por hora", obtenerSueldo(), 
                "horas trabajadas", obtenerHoras());
    }

    @Override
    public double ingresos() {
        if(obtenerHoras()<=40){
            return obtenerSueldo()*obtenerHoras();
        }
        else{
            return 40*obtenerSueldo()+(obtenerHoras()-40)*obtenerSueldo()*1.5;
        }
    }
    
    
}

