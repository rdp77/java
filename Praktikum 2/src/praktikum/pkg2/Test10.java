/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.pkg2;

/**
 *
 * @author RDP77
 */
public class Test10 {
    boolean newAcct = true;
    double deposit = 17.29;
    
    public void check(){
        if (newAcct == true ){
            double balance = 100.0;
        }
     
        if (deposit > 0){
            balance += deposit;
        }
        System.out.println("Balance = "+balance);
    }
    
    public static void main (String[] args){
        Test10 test = new Test10();
        test.check();
    }
}
