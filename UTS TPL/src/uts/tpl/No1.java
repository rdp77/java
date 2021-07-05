/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.tpl;
import java.util.Scanner;
/**
 *
 * @author RDP77
 */
public class No1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int inputan,i,banyak=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bilangan : ");
        inputan = input.nextInt();
        
        i=inputan;
        
        while(i>0){
            i=(i-(i%10))/10;
            banyak++;
        }
        System.out.println("Banyak Digit : "+banyak);
    }
}