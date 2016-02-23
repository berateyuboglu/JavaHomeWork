/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahomework;

/**
 *
 * @author 'Berat
 */
public class JavaHomeWork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        power2List();
        isPower2(2);
    }
    
    
        static boolean isPower2(int n) {
        return (n & n - 1) == 0;
    }
     
    static void power2List(){
        for (int i=1; i<=100; i++){
    
        float a = (float)Math.pow(2, i); 
		
        System.out.println( "2nin " +i+ ". kuvveti= " +a );
		
        } 
    }
    
}
