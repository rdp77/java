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
public class No3 {
    public static void main(String[] args){
        StringBuffer kata1,kata2,kata3;
        kata1 = new StringBuffer("TEKNIK");
        kata2 = new StringBuffer("PEMROGRAMAN");
        kata3 = new StringBuffer("LANJUT");
        System.out.println("INPUT : TEKNIK PEMROGRAMAN LANJUT");
        System.out.println("OUTPUT : "+kata1.reverse()+" "+kata2.reverse()+" "+kata3.reverse());
    }
}
