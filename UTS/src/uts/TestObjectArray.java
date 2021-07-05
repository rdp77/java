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
public class TestObjectArray {
    public static void main(String[] args){
        Object[] a = new Object[4];
        a[0] = new String ("Hello World");
        a[1] = new Long(44);
        a[2] = new Float(1.5);
        for (int i=0; i<a.length; i++){
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
