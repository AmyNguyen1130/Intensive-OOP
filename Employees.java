/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OOP;
import java.*;
import OOP.Humans;
import java.util.Scanner;
import java.util.ArrayList;
import static OOP.Tickets.tickets;
import java.util.Arrays; 
import static OOP.Match.*;
import java.util.Date;

/**
 *
 * @author huong.nguyen
 */
public class Employees extends Humans{
    
    protected String Job;
    static ArrayList<Employees> employees = new ArrayList<Employees>();
    
    Employees(){
        
    }
    
    Employees (String FullName, String Address, int Age, String PhoneNumber,String Job){
        super(FullName, Address, Age, PhoneNumber);
        this.Job = Job;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String Job) {
        this.Job = Job;
    }
    
    public void displayData(){
        
        Scanner sc = new Scanner(System.in);
        int check = 0;
        do{
            check = 0;
            System.out.println("\nEnter your name: ");
            String name = sc.nextLine();
            
            for(int i = 0; i < employees.size(); i++){
                if(i == 0){
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.printf("\n|%-30s | %-15s | %-10s | %-20s | %-20s | %10s","Full Name","Address","Age","Phone number","Job","Salary");
                    System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------------");
                }
                if(name.equals(employees.get(i).getFullName())){
                    check = 1;
                    System.out.printf("\n|%-30s | %-15s | %-10d | %-20s | %-20s | %10.1f",employees.get(i).getFullName(),
                    employees.get(i).getAddress(),employees.get(i).getAge()
                    ,employees.get(i).getPhoneNumber(),employees.get(i).getJob(),employees.get(i).getSalary()); 
                    System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------------");
                }
            }
        }while(check !=1);
        
    }
    
    public void createTicket(){
        
        Scanner sc = new Scanner(System.in);
        Tickets tic1 = new Tickets();
        String code;
        int check = 0;
            do{
                check = 0;
                System.out.print("Enter the schedule's code: ");
                code = sc.nextLine();
                for(int i = 0; i< matchs.size();i++){
                    if(code.equals(matchs.get(i).getCode())){
                       check = 1; 
                       tic1.setSche(matchs.get(i));
                    }
                }
            }while(check != 1);
            
            System.out.print("Enter the seat: ");
            tic1.setSeat(Integer.parseInt(sc.nextLine()));  
            
            System.out.print("Enter the price: ");
            tic1.setPrice(Double.parseDouble(sc.nextLine()));
            
            System.out.print("Enter the price: ");
            tic1.setDate(sc.nextLine());

            tickets.add(tic1);
    }
    
    
    public void deleteTicket(){
        Scanner sc = new Scanner(System.in);
        String code;
        int check = 0;
        do{
            check = 0;
            System.out.print("Enter the ticket's code: ");
            code = sc.nextLine();
            for(int i = 0; i< tickets.size(); i++){
                if(code.equals(tickets.get(i).getCode())){
                    check = 1;
                    tickets.remove(tickets.get(i));
                }
            }
        }while(check!=1);
    }
   
     public void createMatch() {
        
        Players[] playArr = new Players[11];
        Players[] revArr = new Players[2];
            Players player1 = new Players("Nguyen Cong Phuong", "Nghe An", 25, "0125631488","Stricker", 10);
            Players player2 = new Players("Nguyen Van Toan", "Dak Lak", 23, "0125631488","Defender", 11);
            Players player3 = new Players("Doan Van Hau", "Quang Tri", 22, "0125631488","Midfielder", 14);
            Players player4 = new Players("Pham Duc Van", "Quang Binh", 21, "0125631488","Stricker", 19);
            Players player5 = new Players("Phan Van Duc", "Hue", 26, "0125631488","Stricker", 7);
            Players player6 = new Players("Nguyen Hai Phong", "Da Nang", 30, "0125631488","Midfielder", 8);
            Players player7 = new Players("Nguyen Phi Son", "Thanh Hoa", 29, "0125631488","Midfielder", 9);
            Players player8 = new Players("Luong Xuan Truong", "Ha Noi", 25, "0125631488","Midfielder", 21);
            Players player9 = new Players("Pham Xuan Manh", "Hai Duong", 28, "0125631488","Stricker", 3);
            Players player10 = new Players("Nguyen Duy Manh", "Binh Phuoc", 25, "0125631488","Midfielder", 6);
            Players player11 = new Players("Ha Duc Chinh", "Hai Lang", 20, "0125631488","Stricker", 1);
        playArr[0] = player1;
        playArr[1] = player2;
        playArr[2] = player3;
        playArr[3] = player4;
        playArr[4] = player5;
        playArr[5] = player6;
        playArr[6] = player7;
        playArr[7] = player8;
        playArr[8] = player9;
        playArr[9] = player10;
        playArr[10] = player11;
        
        Players player12 = new Players("Nguyen Van Quyet", "Gio Linh", 27, "0125631488","Midfielder", 18);
        Players player13 = new Players("Bui Tien Dung", "Nghe An", 20, "0125631488","Goalkeeper", 25);
        revArr[0] = player12;
        revArr[1] = player13;
        
        Match match1 = new Match("1", "Real", "Lech Chay", "4/12/2019",
                11,2, playArr, revArr);
        Match match2 = new Match("2", "Croatia", "My Dinh", "4/12/2018",
                11,2, playArr, revArr);
        Match match3 = new Match("3", "Colombia", "The Rose Bowl", "4/12/2107",
                11,2, playArr, revArr);
        matchs.add(match1);
        matchs.add(match2);
        matchs.add(match3);
        
    }
     
     
     public void createTicketAuto(){
         Tickets tk1 = new Tickets(1, matchs.get(0), 25, "12/12/2019", 12000000);
         Tickets tk2 = new Tickets(1, matchs.get(1), 25, "12/12/2019", 12000000);
         Tickets tk3 = new Tickets(1, matchs.get(2), 25, "12/12/2019", 12000000);
         tickets.add(tk3);
         tickets.add(tk2);
         tickets.add(tk1);
                 
     }

    @Override
    public void EnterData() {

    }
}
