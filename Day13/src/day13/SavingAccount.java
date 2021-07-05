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
public class SavingAccount extends Account{
    private double interestRate;
    
    public SavingAccount(double balance, double interest_rate) {
        super(balance);
        interestRate = interest_rate;
    }
}
