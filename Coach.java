package OOP;

import java.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author huong.nguyen
 */
public class Coach extends Human{
    
    Coach(String FullName,String PhoneNumber, String Address,int Age, double Salary){
        super(FullName, PhoneNumber, Address, Age, Salary);
    }

    @Override
    void Display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    double Payroll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
