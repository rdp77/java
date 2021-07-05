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
public class SadObject extends MoodyObject{
    protected String getMood(){
        return "sad";
    }
    
    public void cry(){
        System.out.println("boo hoo");
    }
}
