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
public class PruebaSistemaNomina {
    public static void main(String[] args) {
        
        EmpleadoAsalariado asalariado = new EmpleadoAsalariado("Juan", "Rodriguez", "Fernandez", "12213-455321", 800.00);
        
        EmpleadoPorHoras horarios = new EmpleadoPorHoras("Fernanda", "Grezca", "Martinez", "00-4564-126", 16.75, 40);
        
        EmpleadoPorComision comision = new EmpleadoPorComision("Humberto", "Moreira", "Sienfuego", "4654656-4544", 10000, 0.06);
        
        EmpleadoBaseMasComision bascomision = new EmpleadoBaseMasComision("Juan", "Alberto", "Robledo", "5653-135465", 5000, 0.04, 300);
        
        System.out.println("Empleado procesados por separado: \n");
        System.out.printf("%s\n%s: $%, .2f\n\n",asalariado,"ingresos",asalariado.ingresos());
        System.out.printf("%s\n%s: $%, .2f\n\n",horarios,"ingresos",horarios.ingresos());
        System.out.printf("%s\n%s: $%, .2f\n\n",comision,"ingresos",comision.ingresos());
        System.out.printf("%s\n%s: $%, .2f\n\n",bascomision,"ingresos",bascomision.ingresos());
        
        //polimorfismo
        Empleado [] empleados = new Empleado[4];
        
        empleados[0] = asalariado;
        empleados[1] = horarios;
        empleados[2] = comision;
        empleados[3] = bascomision;
        
        System.out.println("Empleados procesados en forma polimórfica: ");
        
        //procesa en forma generica a cada elemento en el arreglo de empleados
        for(Empleado empleadoActual : empleados){
            System.out.println(empleadoActual);//invoca a toString
            
            if(empleadoActual instanceof EmpleadoBaseMasComision){
            
                //conversion descendente de la referencia de empleado
                //a una referencia de EmpleadoBaseMasComisión
                EmpleadoBaseMasComision empleado= 
                        (EmpleadoBaseMasComision)empleadoActual;
                
                double salarioBaseAnterior = empleado.obtenerSalarioBase();
                empleado.establecerSalarioBase(1.10*salarioBaseAnterior);
                
                System.out.printf("El nuevo salario base con 10%% de aumento es: $%,.2f\n",
                        empleado.obtenerSalarioBase());
            }//fin del if
            
            System.out.printf("ingresos $%,.2f\n\n", empleadoActual.ingresos());
        }
        
        //obtiene el nombre del tipo de cada objeto en el arreglo de empleados
        for(int j=0; j<empleados.length; j++){
            System.out.printf("El empleado %d es un %s\n",j, empleados[j].getClass().getName());
        }
    }
}
