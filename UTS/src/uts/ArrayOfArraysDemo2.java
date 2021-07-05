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
public class ArrayOfArraysDemo2 {
    public static void main(String[] args){
        int [][] aMatrix = new int [4][];
        //Populate Matrix
        for (int i=0; i<aMatrix.length; i++){
            aMatrix[i] = new int[5]; //Create Sub Array
            for (int j=0; j<aMatrix.length; j++){
                aMatrix[i][j] = i+j;
            }
        }
        //Print Matrix
        for (int i=0; i<aMatrix.length; i++){
            for (int j=0; j<aMatrix[i].length; j++){
                System.out.print(aMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
