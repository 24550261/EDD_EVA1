/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_paso_referencia;

/**
 *
 * @author oujeffu
 */
public class EVA1_6_PASO_REFERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arreglo= new int[10];
        llenar(arreglo);
        imprimir(arreglo);
        int [] arreglo2= new int[50];
        llenar(arreglo2);
        imprimir(arreglo2);
    }
    
    public static void llenar (int[] datos){
        
        for (int i = 0; i < datos.length; i++) {
            datos[i]= (int) (Math.random()*100);
        }
    }
    
    
    public static void imprimir (int[] datos){
        for (int i = 0; i <datos.length; i++) {
            System.out.println("["+datos[i]+"]");
        }
        System.out.println("");
    }
    
}
