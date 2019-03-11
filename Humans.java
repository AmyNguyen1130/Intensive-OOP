package OOP;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author huong.nguyen
 */

abstract public class Humans{
    
    protected String FullName, Address,PhoneNumber;
    protected int Age;
    protected double Salary;
    

    Humans(){
        
    }

    public Humans(String FullName, String Address, int Age, String PhoneNumber) {
        this.FullName = FullName;
        this.Address = Address;
        this.Age = Age;
        this.PhoneNumber = PhoneNumber;
    }
    

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }
    
    public abstract void EnterData();
    
    public abstract void displayData();
    
}
