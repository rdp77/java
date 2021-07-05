/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moh.ravi.dwi.putra;

/**
 *
 * @author KOMPUTASI
 */
public class Mage extends Player{

    public Mage(String name, int hp) {
        super(name, hp);
    }
    
    void skillFireball(){
        System.out.println(getName()+" Tembakan APIII!!!!!!");
    }
}
