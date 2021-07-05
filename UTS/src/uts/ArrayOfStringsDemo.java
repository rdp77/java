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
public class ArrayOfStringsDemo {
    public static void main(String[] args){
        String[] anArray = {"String One", "String Two", "String Three"};
        
        for (int i=0; i<anArray.length; i++){
            System.out.println(anArray[i].toLowerCase());
        }
    }
}
