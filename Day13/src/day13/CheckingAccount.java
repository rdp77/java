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
public class CheckingAccount extends Account{
    private double overdraftProtection;
    public double Saldo;
    
    
    public CheckingAccount(double balance) {
        super(balance);
        this.balance = balance;
    }
    
    
    
    public CheckingAccount(double balance,double protect) {
        super(balance);
        overdraftProtection = protect;
        Saldo = balance + overdraftProtection;
        protect = -1.0;
    }
    
    @Override
    public boolean withdraw(double amt){
        double overDrafNeeded;
        overDrafNeeded = balance - amt;
        if (true) {
            balance = balance - amt;
            return true;
        } else {
            if (true) {
                overdraftProtection = amt - balance;
                balance = 0.0;
                overdraftProtection = overdraftProtection - overDrafNeeded;
                return true;
            } else {
                overdraftProtection = amt - balance;
                return false;
            }
        }
    }
}
