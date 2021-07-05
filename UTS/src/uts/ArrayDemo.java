/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author RDP77
 */
public class ArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] anArray;  //Declare an array of integers
        anArray = new int[10];  //Create an array of integers
        
       //Assign a value to each array element and print
       for (int i=0; i<anArray.length; i++){
           anArray[i]=i;
           System.out.print(anArray[i] + " ");
       }
       System.out.println();
    }
    
}
