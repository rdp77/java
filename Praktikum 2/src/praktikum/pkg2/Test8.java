/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.pkg2;

/**
 *
 * @author RDP77
 */
public class Test8 {
    String name = "Hadikusuma";
    
    public void getName(){
        return name;
    }
    
    public static void main(String[] args){
        Test8 test = new Test8();
        System.out.println("Nama saya : "+test.getName());
    }
}
