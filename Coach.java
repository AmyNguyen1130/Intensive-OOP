package OOP;

import java.*;
import OOP.Humans;
import java.util.Scanner;
import java.util.ArrayList; 
import java.util.Arrays; 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author huong.nguyen
 */

public class Coach extends Humans{
    
    static ArrayList<Coach> Coachs = new ArrayList<Coach>();
    
    
    Coach(){
        
    }
    
    Coach(String FullName, String Address, int Age, String PhoneNumber){
        super(FullName, Address, Age, PhoneNumber);
    }

    
    
    public void displayData(){
        
        System.out.println("\t\t===============> COACH LIST <=============");
        System.out.println("\n");
        System.out.printf("%-30s %-25s %-10s %-50s","FullName","Address","Age","PhoneNumber");
        for(int i=0; i < Coachs.size(); i++){
           Coach temp = new Coach();
           temp = Coachs.get(i);
           System.out.printf("\n%-30s %-25s %-10d %-50s",temp.getFullName(),temp.getAddress(),temp.getAge(),temp.getPhoneNumber()); 
        }
    }
    
    public float caculate(float gio, float luong){
        float tien;
        if(gio>40)
             tien = (float) ((40*luong)+((gio-40)*1.5*luong));
	else
             tien=gio*luong;
        return tien;
    }
    
    public void PayRoll(){
        float luong;
        float gio;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.print("Nhập vào lương giờ: ");
        luong = Float.parseFloat(sc.nextLine());
        }while( luong < 0);
        do{
        System.out.print("Nhập giờ làm: ");
        gio = Float.parseFloat(sc.nextLine());
        }while( gio < 0);
        setSalary(caculate(gio,luong));
    }
    
    public static void main(String[] args) {
        Coach a = new Coach();
        a.EnterData();
        a.displayData();
        a.EnterData();
        a.displayData();
    }

    @Override
    public void EnterData() {
    }
}
