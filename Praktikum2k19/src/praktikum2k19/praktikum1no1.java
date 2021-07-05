/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2k19;
import java.util.Scanner;
public class praktikum1no1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        rata rr = new rata();
        int b;
        System.out.print("Masukkan panjang deret = ");
        b = input.nextInt();
        rr.deretan(b);
    }
}
