/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;
import OOP.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.ArrayList; 
import java.util.Arrays; 
import java.util.Date;

/**
 *
 * @author huong.nguyen
 */

public class Tickets {
    
    private Match sche;
    private int seat,code;
    private double price;
    private String date;
    static ArrayList<Tickets> tickets = new ArrayList<Tickets>();

    
    public Tickets(int code, Match sche, int seat, String date, double price) {
        this.sche = sche;
        this.code = code;
        this.price = price;
        this.seat = seat;
        this.date = date;
    }

    Tickets() {
        
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Match getSche() {
        return sche;
    }

    public void setSche(Match sche) {
        this.sche = sche;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
    
    
}
