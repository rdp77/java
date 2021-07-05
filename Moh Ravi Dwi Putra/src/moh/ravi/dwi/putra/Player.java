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
public class Player implements Players{
    String name;
    int hp;
    
    public Player(String name,int hp){
        setName(name);
        setHP(hp);
    }
    
    void setName(String name){
        this.name = name;
    }
    
    String getName(){
        return this.name;
    }
    
    void setHP(int hp){
        this.hp = hp;
    }
    
    int getHP(){
        return this.hp;
    }
    
    void attack(){
        System.out.println(getName()+" Attacking!! "+getHP());
        
    }
    
    
    @Override
    public void dead() {
        System.out.println(getName()+" MATI");
    }
}
