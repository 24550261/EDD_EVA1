/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_factorial;

/**
 *
 * @author oujeffu
 */
public class EVA1_14_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(factorial(7));
        
    }
    
    
    public static int factorial(int valor){
        if(valor==0){
            return  1;
}else{
            return valor*factorial(valor-1);
        }
    
}
    
    
}