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
public class Zombie extends Enemy{

    public Zombie(String name, int damage) {
        super(name, damage);
    }
    void walk(){
        System.out.println(getName()+" Walking....");
    }
}
