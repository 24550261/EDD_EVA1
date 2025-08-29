/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_3_heap;

/**
 *
 * @author oujeffu
 */
public class EVA1_3_HEAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int x=5;
        Ejemplo try1 = new Ejemplo();//REFERENCIA
        Ejemplo try2 = new Ejemplo();//REFERENCIA
        System.out.println("x: "+x);
        System.out.println("Ejemplo: "+try1);
        System.out.println("Ejemplo 2:"+try2);
        System.out.println("Ejemplo 1 valor= "+try1.valor);
      try1=null;//ROMPEMOS EL ENLACE (DIRECCION) ENTRE VARIABLES Y MEMORIA
      try2=null;//ROMPEMOS EL ENLACE (DIRECCION) ENTRE VARIABLES Y MEMORIA
    }
    
}

class Ejemplo{
    int valor=10;
}
