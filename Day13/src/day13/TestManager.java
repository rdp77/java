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
public class TestManager {
    public static void main(String[] args){
        Manager manager = new Manager("John",5000000,"Financial");
        
        // call parent class function
        System.out.println("Name : "+manager.GetName());
        // call parent class function
        System.out.println("Salary : "+manager.GetSalary());
        //call class function
        System.out.println("Dept : "+manager.GetDept());
        
        
        manager = new Manager("Michael","Accounting");
        
        // call parent class function
        System.out.println("Name : "+manager.GetName());
        // call parent class function
        System.out.println("Salary : "+manager.GetSalary());
        // call class function
        System.out.println("Dept : "+manager.GetDept());
    }
}
