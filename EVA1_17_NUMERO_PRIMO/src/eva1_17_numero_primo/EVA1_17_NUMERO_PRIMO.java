/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_numero_primo;

import java.util.Scanner;

/**
 *
 * @author oujeffu
 */
public class EVA1_17_NUMERO_PRIMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cap=new Scanner (System.in);
       
        long num=999999999;
        
        System.out.print("su numero es");
         if(verificarPrimoNoEficiente(num)==true){
             System.out.print("   primo");
         }else{
             System.out.print("  No primo");
         }
         
         
         
        
    }
    
    
    public static boolean verificarPrimoEficiente(long num){
       
        if(num<=1){
            return false;
        }
        
        for (int i = 2; i < Math.sqrt(num); i++) {
            if(num%i==0){
                return false;
                
            }
            
        }
        
        return true;
        
        
    }
    
    public static boolean verificarPrimoNoEficiente(long num){
     
        if (num<=1){
            return false;
        }
        
        
        for (int i = 2; i < num-1; i++) {
            if(num%i==0){
                return false;
            }
            
        }
            return true;
        
    }
}
