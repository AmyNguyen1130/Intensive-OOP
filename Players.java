
 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OOP;

import java.*;
import OOP.Humans;
import java.util.Scanner;
import java.util.ArrayList; 
import java.util.Arrays; 

/**
 *
 * @author Administrator
 */

public class Players extends Humans{
    protected String Location;
    protected int Clothes;
    
    static ArrayList<Players> players = new ArrayList<Players>();
    
    Players(){
        
    }
    
    Players(String FullName, String Address, int Age, String PhoneNumber,String location, int Clothes){
        super(FullName, Address, Age, PhoneNumber);
        this.Location = location;
        this.Clothes = Clothes;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public int getClothes() {
        return Clothes;
    }

    public void setClothes(int Clothes) {
        this.Clothes = Clothes;
    }
    
    @Override
    public void EnterData() {

    }

    @Override
    public void displayData() {
        System.out.println("\t\t===============> PLAYER LIST <=============");
        System.out.println("\n");
        System.out.printf("%-30s %-25s %-10s %-50s %-25s %-20s","FullName","Address","Age","PhoneNumber","location","Clothes Number");
        for(int i=0; i < players.size(); i++){
           Players temp = new Players();
           temp = players.get(i);
           System.out.printf("\n%-30s %-25s %-10d %-30s %-25s %-20d",temp.getFullName(),temp.getAddress(),temp.getAge()
           ,temp.getPhoneNumber(),temp.getLocation(),temp.getClothes()); 
        }
    }
}
