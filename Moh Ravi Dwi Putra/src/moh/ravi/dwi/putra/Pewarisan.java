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
public class Pewarisan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        Zombie zo = new Zombie("Zomdos",500);
        zo.walk();
        zo.attack();
        zo.destroy();
        
//        Enemy en = new Enemy();
//        en.setName("Zombie And Plants");
//        System.out.println("Name = "+en.getName());
//        
//        en.setDamage(50);
//        System.out.println("Damage = "+en.getDamage());
    }
}
