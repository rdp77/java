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
public class Manager extends Employee{
    private String department;
    
    public Manager(String name,double salary,String dept){
        super (name,salary);
        department = dept;
    }
    
    public Manager(String n,String dept){
        super(n);
        department = dept;
    }
    
    public Manager (String dept){
        super();
        department = dept;
    }
    
    public String GetDept(){
        return department;
    }
}
