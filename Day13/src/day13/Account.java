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
public class Account {
    double balance;
    
    Account(double initBalance){
        this.balance = initBalance;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public boolean deposit(double amt){
        return true;
    }
    
    public boolean withdraw(double amt){
        return true;
    }
}
