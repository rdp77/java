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
public class HappyObject extends MoodyObject{
    protected String getMood(){
        return "happy";
    }

    public void laugh(){
        System.out.println("Ha Ha Ha.");
        }
}
