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
public class TestGreeting {
        public static void main(String[] args) {
        Greeting hello = new Greeting();
        hello.greet();
    }
    
}

class Greeting{
    public void greet(){
        System.out.println("hi");
    }
}