/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2pbo;
import java.util.Scanner;
/**
 *
 * @author RDP77
 */
public class No1 {
    public static void main(String[] args){
       ExportData praktikum = new ExportData();
       String nama;
        System.out.print("Kalimat = ");
        Scanner inputan = new Scanner(System.in);
        nama = inputan.nextLine();
        praktikum.tugas(nama);
    }
}
