/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import static OOP.Coach.*;
import static OOP.Players.*;
import static OOP.Employees.*;
import OOP.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author huong.nguyen
 */
public class Menu {
        
    public void Theme(){
        System.out.println("");
        System.out.println("\t\t================================================");
	System.out.println("\t\t*                                              *");
	System.out.println("\t\t*        FOOTBALL CLUB MANAGEMENT SYSTEM       *");
	System.out.println("\t\t*                                              *");
	System.out.println("\t\t<==============================================>\n\n");
    }
    
    public void menu(){
        System.out.println("\t============================ < MENU > ===========================");
	System.out.println("\t||                                                             ||");
	System.out.println("\t||       PLEASE SELECT ONE OPINION WHICH YOU WANNA DO          ||");
	System.out.println("\t||    1. Add one more Object                                   ||");
        System.out.println("\t||    2. Delete an Object                                      ||");
        System.out.println("\t||    3. Update information of an Object                       ||");
	System.out.println("\t||    4. Display the information                               ||");
        System.out.println("\t||    5. Calculate the salary                                  ||");
	System.out.println("\t||    6. Display the salary                                    ||");
        System.out.println("\t||    7. Profit statistics                                     ||");
        System.out.println("\t||                                                             ||");
	System.out.println("\t=================================================================\n");
    }
    
    public void menuEmployee(){
        System.out.println("\t============================ < MENU > ===========================");
	System.out.println("\t||                                                             ||");
	System.out.println("\t||       PLEASE SELECT ONE OPINION WHICH YOU WANNA DO          ||");
	System.out.println("\t||    1. Display the information                               ||");
        System.out.println("\t||    2. Sell tickets                                          ||");
        System.out.println("\t||    3. delete a tickets                                      ||");
	System.out.println("\t=================================================================\n");
    }
    
    
    public void menuAddObject(){
        System.out.println("\n\t====================== ADD ONE MORE OBJECT ======================");
	System.out.println("\t||                                                             ||");
	System.out.println("\t||       PLEASE SELECT ONE OPINION WHICH YOU WANNA DO          ||");
	System.out.println("\t||    1.Add one more Player                                    ||");
	System.out.println("\t||    2.Add one more Coach                                     ||");
        System.out.println("\t||    3.Add one more Employee                                  ||");
        System.out.println("\t||                                                             ||");
	System.out.println("\t=================================================================\n");
    }
    
    
    
    public void menuDeleteObject(){
        System.out.println("\n\t====================== ADD ONE MORE OBJECT ======================");
	System.out.println("\t||                                                             ||");
	System.out.println("\t||       PLEASE SELECT ONE OPINION WHICH YOU WANNA DO          ||");
	System.out.println("\t||    1.Delete a Player                                        ||");
	System.out.println("\t||    2.Delete a Coach                                         ||");
        System.out.println("\t||    3.Delete an Employee                                     ||");
        System.out.println("\t||                                                             ||");
	System.out.println("\t=================================================================\n");
    }
    
    public void menuUpdateObject(){
        System.out.println("\n\t=============== UPDATE INFORMATION OF AN OBJECT ================");
	System.out.println("\t||                                                             ||");
	System.out.println("\t||       PLEASE SELECT ONE OPINION WHICH YOU WANNA DO          ||");
	System.out.println("\t||    1.Update a Player                                        ||");
	System.out.println("\t||    2.Update a Coach                                         ||");
        System.out.println("\t||    3.Update an Employee                                     ||");
        System.out.println("\t||                                                             ||");
	System.out.println("\t=================================================================\n");
    }
    
    
    public void menuCalculateObject(){
        System.out.println("\n\t===================== CALCULATE THE SALARY =====================");
	System.out.println("\t||                                                             ||");
	System.out.println("\t||       PLEASE SELECT ONE OPINION WHICH YOU WANNA DO          ||");
	System.out.println("\t||    1.PayRoll For Player                                     ||");
	System.out.println("\t||    2.PayRoll For Coach                                      ||");
        System.out.println("\t||    3.PayRoll For Employee                                   ||");
        System.out.println("\t||                                                             ||");
	System.out.println("\t=================================================================\n");
    }
    
  public  void Exit(){
	Theme();
	System.out.println("\n\t\t\t\tTHOAT CHUONG TRINH\n");
	System.out.println("\n\t\tBAN CO MUON THOAT CHUONG TRINH KHONG ?\n\n\t\t1. CO.\n\t\t2. KHONG.");
        Scanner sc = new Scanner(System.in);
        int c = Integer.parseInt(sc.nextLine());
	switch(c){
		case 1:
			System.exit(0);
			break;
		case 2:
			select();
			break;
		default:
			Exit();
	}
}
  
  
   public  void Back1(){
	System.out.println("\n\n\t   Press 1 to back - Press 2 to exit - Press 3 to switch user ");
	String a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        int c = Integer.parseInt(a);
	
		switch(c)
		{
			case 1:
			{
				selectAdmin();
                                break;
			}
			case 2:
			{
				Exit();
			}
                        case 3:
			{
				switchUser();
                                break;
			}
                        default:Back1();
		}
}
   
   
    public  void Back2(){
        System.out.println("\n\n\t   Press 1 to back - Press 2 to exit - Press 3 to switch user ");
	String a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        int c = Integer.parseInt(a);
	
		switch(c)
		{
			case 1:
			{
				selectEmployee();
                                break;
			}
			case 2:
			{
				Exit();
			}
                        case 3:
			{
				switchUser();
                                break;
			}
                        default:Back2();
		}
    }  
    
    public  void switchUser(){
        System.out.println("\t============================ < User > ===========================");
	System.out.println("\t||                                                             ||");
	System.out.println("\t||       PLEASE SELECT ONE OPINION WHICH YOU WANNA DO          ||");
	System.out.println("\t||    1. Admin                                                 ||");
        System.out.println("\t||    2. Employee                                              ||");
        System.out.println("\t||    3. Player                                                ||");
        System.out.println("\t||    4. Coach                                                 ||");
        System.out.println("\t||    5. Exit                                                  ||");
        System.out.println("\t||                                                             ||");
	System.out.println("\t=================================================================\n");
        int c = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n\t Enter the role of user :");
        c = Integer.parseInt(sc.nextLine());
		switch(c)
		{
                    case 1:
                    {
                        Login("Admin", "Password");
                        break;
                    }
                    case 2:
                    {
                            selectEmployee();
                            break;
                    }
                    case 3:
                    {
                            selectEmployee();
                            break;
                    }
                    case 4:
                    {
                            selectEmployee();
                            break;
                    }
                    case 5:
                    {
                            Exit();

                    }
                    default:Back1();
            }
    }
    
    public void selectAddObject(){
        Scanner sc = new Scanner(System.in);
        Admin Ad1 = new Admin();
        menuAddObject();
        System.out.print("PLEASE SELECT ONE OPINION WHICH YOU WANNA DO: ");
        int choose = Integer.parseInt(sc.nextLine());
        switch(choose){
            case 1: 
                System.out.println("\t\t----------> Add new player <---------");
                Ad1.EnterDataPlayer();
                break;
            case 2:
                System.out.println("\t\t----------> Add new Coach <---------");
                Ad1.EnterDataCoach();
                break;
            case 3:
                System.out.println("\t\t---------> Add new Employee <---------");
                Ad1.EnterDataEmployee();
                break;
            default: 
               selectAddObject();
        } 
    }
   
    
    
    public void selectDeleteObject(){
        Scanner sc = new Scanner(System.in);
        Admin Ad2 = new Admin();
        menuDeleteObject();
        System.out.print("PLEASE SELECT ONE OPINION WHICH YOU WANNA DO: ");
        int choose = Integer.parseInt(sc.nextLine());
        switch(choose){
            case 1:
                System.out.println("\n\t\t----------> Delete a Player <---------");
                System.out.println("Enter the person's name who you want to delete : ");
                Ad2.DeletePlayer(players, sc.nextLine());
                break;
            case 2:
                System.out.println("\n\t\t----------> Delete  Coach <---------");
                System.out.println("Enter the person's name who you want to delete : ");
                Ad2.DeleteCoach(Coachs, sc.nextLine());
                break;
            case 3:
                System.out.println("\n\t\t----------> Delete an Employee <---------");
                System.out.println("Enter the person's name who you want to delete : ");
                Ad2.DeleteEmployee(employees, sc.nextLine());
                break;
            default:
                selectDeleteObject();
        }
    }
    
    
    public void selectUpdateObject(){
        Scanner sc = new Scanner(System.in);
        Admin Ad = new Admin();
        menuUpdateObject();
        System.out.print("PLEASE SELECT ONE OPINION WHICH YOU WANNA DO: ");
        int choose = Integer.parseInt(sc.nextLine());
        switch(choose){
            case 1:
                System.out.println("\n\t\t----------> Update Player <---------");
                Ad.UpdatePlayer();
                break;
            case 2:
                System.out.println("\n\t\t----------> Update  Coach <---------");
                Ad.UpdateCoach();
                break;
            case 3:
                System.out.println("\n\t\t----------> Update Employee <---------");
                Ad.UpdateEmployee();
                break;
            default:
                selectDeleteObject();
        }
    }
    
    public void PayRollObject(){
        Scanner sc = new Scanner(System.in);
        Admin Ad = new Admin();
        menuCalculateObject();
        System.out.print("PLEASE SELECT ONE OPINION WHICH YOU WANNA DO: ");
        int choose = Integer.parseInt(sc.nextLine());
        switch(choose){
            case 1:
                System.out.println("\n\t\t----------> PayRoll For Player <---------");
                Ad.PayRollPlayer();
                break;
            case 2:
                System.out.println("\n\t\t----------> PayRoll For  Coach <---------");
                Ad.PayRollCoach();
                break;
            case 3:
                System.out.println("\n\t\t----------> PayRoll For Employee <---------");
                Ad.PayRollEmployee();
                break;
            default:
                selectDeleteObject();
        }
    }
    
    public void DisplaySalaryObject(){
        Scanner sc = new Scanner(System.in);
        Admin Ad = new Admin();
        Ad.DisplaySalary();
        
    }
    
    public void Profit(){
        Admin Ad = new Admin();
        Ad.ProfitStatistics();
    }
    
    public void selectAdmin() {
        Theme();
        menu();
        Scanner sc = new Scanner(System.in);
        System.out.print("PLEASE SELECT ONE OPINION WHICH YOU WANNA DO: ");
        int a = Integer.parseInt(sc.nextLine());
        switch(a){
            case 1:
                selectAddObject();
                Back1();
             break;
            case 2: 
                selectDeleteObject();
                Back1();
                break;
            case 3: 
                selectUpdateObject();
                Back1();
                break;
            case 4: 
                Admin ad4 = new Admin();
                ad4.DisplayMembers();
                Back1();
                break;
            case 5: 
                PayRollObject();
                Back1();
                break;
            case 6: 
                DisplaySalaryObject();
                Back1();
                break;
            case 7:
                System.out.println("\n\t\t---------------------Profit statistics-----------------------");
                Profit();
                Back1();
            default: 
                selectAdmin();
            }
        }
    
    public void selectEmployee() {
        Theme();
        menuEmployee();
        Scanner sc = new Scanner(System.in);
        System.out.print("PLEASE SELECT ONE OPINION WHICH YOU WANNA DO: ");
        int a = Integer.parseInt(sc.nextLine());
        switch(a){
            case 1:
                Employees em1 = new Employees();
                em1.displayData();
                Back2();
                break;
            case 2: 
                Employees em2 = new Employees();
                em2.createTicket();
                Back2();
                break;
            case 3: 
                Employees em3 = new Employees();
                em3.deleteTicket();
                Back2();
                break;
            default: 
                selectEmployee();
            }
    }
    
    public void Login(String name, String pass){
        Scanner sc = new Scanner(System.in);
        String NameLogin;
        String PassLogin;
        int index = 0;
        do {
        index ++;
        if(index != 1){
            System.out.println("\nSorry !!! Your user name or password is not correct! Please enter again");
            System.out.printf("\nEnter your name: ");
            NameLogin = sc.nextLine();
            System.out.printf("Enter your password: ");
            PassLogin = sc.nextLine();
        }else{
            System.out.printf("Enter your name: ");
            NameLogin = sc.nextLine();
            System.out.printf("Enter your password: ");
            PassLogin = sc.nextLine();
        }
        }while(!NameLogin.equals(name) || !PassLogin.equals(pass));
        
        selectAdmin();
    }
    public void create(){
        Admin ad = new Admin();
        Employees em1 = new Employees();
        ad.createPlayers();
        ad.createEmployee();
        ad.createCoachs();
        em1.createMatch();
        em1.createTicketAuto();
    }
    
    
    
    
    public static void main(String[] args) {
        
        Menu a = new Menu();
        a.create();
        a.switchUser();
    }
    
}
