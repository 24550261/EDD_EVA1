/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_mcd;

/**
 *
 * @author oujeffu
 */
public class EVA1_15_MCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("El maximo comun divisor es: "+mcd(11, 180)); 
    }
    
    public static int mcd (int dividendo, int division){
       
        int modulo= dividendo%division;
        int resu= dividendo/division;
        if (modulo==0){
            return division;
            
        }
        return mcd(division, modulo);
    }
    
    
    
}
