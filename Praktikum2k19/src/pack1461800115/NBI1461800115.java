/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1461800115;
import java.util.StringTokenizer;
public class NBI1461800115 {
    public void proses(String str){
        StringTokenizer token = new StringTokenizer(str);
        int count = token.countTokens();
        String[] a=new String[count];
        String[] T=new String[count];
        System.out.println("Frekuensi Dari : ");
        for(int i=0; i<count; i++){
            T[i]=token.nextToken().toUpperCase();
            a[i]=T[i];}
        for (int i=0; i<count; i++){
            System.out.println(T[i]+" = "+a[i].length());}
        System.out.println("NBI:1461800115");}}
