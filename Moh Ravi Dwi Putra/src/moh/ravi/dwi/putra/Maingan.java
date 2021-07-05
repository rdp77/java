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
public class Maingan {
    public static void main(String[] args){
        Player oi = new Player("RAVI", 500);
        oi.attack();
        Mage sip = new Mage("Penyihir", 100);
        sip.skillFireball();
        oi.dead();
    }
}
