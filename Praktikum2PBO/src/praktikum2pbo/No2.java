/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2pbo;

/**
 *
 * @author RDP77
 */
public class No2 extends Persegi{
    @Override
    public void hitung(){
        int panjang =5,lebar=5,luas;
        panjang += 10;
        lebar += 2;
        luas = panjang*lebar;
        System.out.println("Luas = "+luas);
    }
    public static void main(String[] args){
        Persegi per = new No2();
        per.hitung();
        Persegi seg = new Persegi();
        seg.hitung();
    }
}
