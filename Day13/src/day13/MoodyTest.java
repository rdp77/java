/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day13;

/**
 *
 * @author RDP77
 */
public class MoodyTest {
    public static void main(String[] args){
        // Test parent class
        MoodyObject m = new MoodyObject();
        m.speak();
        
        // Test inheritnace class
        m = new MoodyObject();
        m.speak();
        m.laugh();
        
        // Test inheritance class
        m = new SadObject();
        m.speak();
        m.cry();
    }

}
