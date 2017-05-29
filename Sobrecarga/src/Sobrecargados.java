/*
 * Clase que muestra como funciona los metodos sobrecargados
 */

/**
 *
 * @author Ivan Rojo
 */
public class Sobrecargados {
    public void sumar(){
        System.out.println("Este metodo no recibe parametros");
    }
    
    public void sumar(int x, int y){
        System.out.println("Este metodo recibe dos enteros");
    }
    public void sumar(int x){
        System.out.println("Este metodo recibe un entero");
    }
    public void sumar(double x){
        System.out.println("Este metodo recibe un double");
    }
    
    public static void main(String[] args) {
        Sobrecargados sobreC = new Sobrecargados();
        
        sobreC.sumar();//llama al primer metodo
        sobreC.sumar(2,2);//utiliza el metodo que pide dos argumentos enteros
        sobreC.sumar(4.4);//utliza el ultimo metodo
    }
    
}
