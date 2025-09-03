/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_falso_for;

/**
 *
 * @author oujeffu
 */
public class EVA1_13_FALSO_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        falsoFor(5);//5-4-3-2-1
        System.out.println("");
        falsoForUp(10,1);
    }
    
    public static void falsoFor(int val){
        System.out.print(val+"-");//resolver un problema
       if(val>1) falsoFor(val-1);//llamarse a si mismo
        //debemos detener la recursivcidad
    }
    
    
    public static void falsoForUp(int val, int start){
       
         
        System.out.print(start+"-");//resolver un problema
              
        
        
        if(start<val) {
                  falsoForUp(val,start+1);
              }




//llamarse a si mismo
        //debemos detener la recursivcidad
    }
}
