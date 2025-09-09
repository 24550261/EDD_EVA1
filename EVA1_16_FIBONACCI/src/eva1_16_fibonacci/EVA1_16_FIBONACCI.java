/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_fibonacci;

/**
 *
 * @author oujeffu
 */
public class EVA1_16_FIBONACCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              System.out.println(fib(6));
    }
    
    
    public static  int fib (int posi){
   
        if (posi==0||posi==1){
            return 1;
        }else{
            return fib(posi-2)+ fib( posi-1);
        }
        
}
}