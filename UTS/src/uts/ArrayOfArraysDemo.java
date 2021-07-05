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
public class ArrayOfArraysDemo {
    public static void main(String[] args){
        String[][] cartoons = {
        {"Flintstones","Fred","Wilma","Pebbles","Dino"},
        {"Rubbles","Barney","Betty","Bam Bam"},
        {"Jetsons","George","Jane","Elroy","Judy","Rosie","Astro"},
        {"Scooby Doo Gang","Scooby Doo","Shaggy","Velma","Fred","Daphne"}
    };
        for(int i=0; i<cartoons.length; i++){
            System.out.print(cartoons[i][0] + ": ");
            for (int j=1; j<cartoons[i].length; j++){
                System.out.print(cartoons[j] + " ");
            }
            System.out.println();
        }
    }
}
