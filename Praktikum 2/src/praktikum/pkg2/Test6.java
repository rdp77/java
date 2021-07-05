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
public class Test6 {
    int[] x = new int [10];
    int val = 20;
    
    public Test6(){
        for (int i=0; i<10; i++){
            x[i] = i;
            float res = val / x[i];
            System.out.println("result "+" = "+res);
        }
    }
    
    public static void main(String[] args){
        Test6 test = new Test6();
    }
}
