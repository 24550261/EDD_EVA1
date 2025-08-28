/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_cambiar_size;

/**
 *
 * @author oujeffu
 */
public class EVA1_9_CAMBIAR_SIZE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here 
        int [] arreglo= new int [10];
        int [] copia_arreglo= new int[arreglo.length];
        
        llenar(arreglo);
        imprimir(arreglo);
        System.out.println(arreglo);
        System.out.println("    ");
        System.out.println("COPIAAAAA");
        System.out.println("    ");
        
        copiarArreglo(arreglo, copia_arreglo);
        imprimir(copia_arreglo);
        System.out.println(copia_arreglo);
        
        arreglo= new int[15];
        copiarArreglo(copia_arreglo, arreglo);
        imprimir(arreglo);
        
        
        
    }
    
     public static void llenar (int[] datos){
        
        for (int i = 0; i < datos.length; i++) {
            datos[i]= (int) (Math.random()*100);
        }
    }
    
    
    public static void imprimir (int[] datos){
        for (int i = 0; i <datos.length; i++) {
            System.out.print("["+datos[i]+"]");
        }
        System.out.println("");
    }
    
    
    public static void copiarArreglo(int[] datos, int[] datos_copia){
        for (int i = 0; i < datos.length; i++) {
            datos_copia[i]=datos[i];
        }
    
        
        
        
        
}
    
    
    }
    
    

