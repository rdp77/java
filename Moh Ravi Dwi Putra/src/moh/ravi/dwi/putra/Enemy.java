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
public class Enemy implements Enemies{
    String name;
    int damage;
    
    public Enemy(String name,int damage){
        setName(name);
        setDamage(damage);
    }
    
    void setName(String name){
        this.name = name;
    }
    
    String getName(){
        return this.name;
    }
    
    void setDamage(int damage){
        this.damage = damage;
    }
    
    int getDamage(){
        return this.damage;
    }
    
    void attack(){
        System.out.println(getName()+" Attacking!! "+getDamage());
        
    }
    

    @Override
    public void destroy() {
        System.out.println(getName()+" DESTROYED!!!!");
    }
}
