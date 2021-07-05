/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.pkg2;

/**
 *
 * @author RDP77
 */
public class Test5 {
    int[] x = new int [ 10 ]; 
    
    public Test5(){
        for (int i=0; i<=10; i++){
            x[i] =i;
            System.out.println("Isi x ke : " + i + " = "
                    + x[i]);
        }
    }
    public static void main(String[] args){
        Test5 test = new Test5();
    }
}
