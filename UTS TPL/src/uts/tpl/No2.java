/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.tpl;
/**
 *
 * @author RDP77
 */
public class No2 {
    public static void main(String[] args){
        String data = "PEMROGRAMAN DASAR";
        data = data.replaceAll("A","");
        System.out.println("INPUT : PEMROGRAMAN DASAR");
        System.out.println("HAPUS : A");
        System.out.println("OUTPUT : "+data);
    }
}
