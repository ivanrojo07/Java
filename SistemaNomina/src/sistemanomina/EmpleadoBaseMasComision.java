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
public class EmpleadoBaseMasComision extends EmpleadoPorComision{
    private double salarioBase;
    
    public EmpleadoBaseMasComision(String nom, String paterno, String materno, String nss, double ventas, double tarifa, double salario){
        super(nom, paterno, materno,nss, ventas, tarifa);
        establecerSalarioBase(salario);
    }
    
    public void establecerSalarioBase(double salario){
        if(salario < 0.0){
            salarioBase = 0.0;
        }
        else{
            salarioBase = salario;
        }
    }
    
    public double obtenerSalarioBase(){
        return salarioBase;
    }
    
    @Override
    public double ingresos(){
        return obtenerSalarioBase()+super.ingresos();
    }
}
