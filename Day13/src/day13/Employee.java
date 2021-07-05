/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day13;

import java.util.Date;

/**
 *
 * @author RDP77
 */
public class Employee {
    private static final double BASE_SALARY = 15000.00;
    private String Name = "";
    private double Salary = 0.0;
    private Date birthDate;
    
    public Employee(){}
    
    public Employee(String name, double salary, Date DoB){
        this.Name = name;
        this.Salary = salary;
        this.birthDate = DoB;
    }
    
    public Employee(String name,double salary){
        this(name,salary,null);
    }
    
    public Employee(String name,Date DoB){
        this(name,BASE_SALARY,DoB);
    }
    
    public Employee(String name){
        this(name,BASE_SALARY);
    }
    
    public String GetName(){
        return Name;
    }
    
    public double GetSalary(){
        return Salary;
    }
}
