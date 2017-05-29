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
public class EmpleadoAsalariado extends Empleado{
    
    private double salario;

    public EmpleadoAsalariado(String nom, String paterno, String materno, String nss, double salario){
        super(nom, paterno, materno, nss);
        establecerSalarioSemanal(salario);
    }
    
    @Override
    public double ingresos() {
        return obtenerSalarioSemanal();
    }
    
    public void establecerSalarioSemanal(double sal){
        salario = sal;
    }
    
    public double obtenerSalarioSemanal(){
        return salario;
    }
    
    @Override
    public String toString(){
        return String.format("Empleado asalariado: %s\n%s: $%,.2f", 
                super.toString(),"Salario Semanal", obtenerSalarioSemanal());
    }
    
}
