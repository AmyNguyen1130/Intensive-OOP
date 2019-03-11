/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;
import OOP.*;
import static OOP.Coach.*;
import static OOP.Players.*;
import static OOP.Employees.*;
import static OOP.Tickets.*;
import static OOP.Match.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author huong.nguyen
 */
public class Admin extends Humans {
    
    
    Admin(){
        
    }
    
    Admin(String FullName, String Address, int Age, String PhoneNumber){
        super(FullName,Address,Age,PhoneNumber);
    }
    
    
    public void EnterDataPlayer(){
        Players object = new Players();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String ten = sc.nextLine();
        object.setFullName(ten);
        
        System.out.print("Enter your address: ");
        String diachi = sc.nextLine();
        object.setAddress(diachi);
        
        do{
             System.out.print("Enter your age: ");
             int tuoi = Integer.parseInt(sc.nextLine());
             object.setAge(tuoi);
        }while(object.getAge()<0);
        
        System.out.print("Enter your phone number: ");
        String sdt = sc.nextLine();
        object.setPhoneNumber(sdt);
        
        System.out.print("Enter your location: ");
        String locate = sc.nextLine();
        object.setLocation(locate);
        
        do{
             System.out.print("Enter your clother number: ");
             int numbercl = Integer.parseInt(sc.nextLine());
             object.setClothes(numbercl);
        }while(object.getClothes()<0);
       players.add(object);
    }
    
    
    public void EnterDataCoach(){
        Coach coach1 = new Coach();
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter your full name: ");
        String ten = sc.nextLine();
        coach1.setFullName(ten);
        
        System.out.print("Enter your address: ");
        String diachi = sc.nextLine();
        coach1.setAddress(diachi);
        
        do{
             System.out.print("Enter your age: ");
             int tuoi = Integer.parseInt(sc.nextLine());
             coach1.setAge(tuoi);
        }while(coach1.getAge()<0);
        
        System.out.print("Enter your phone number: ");
        String sdt = sc.nextLine();
        coach1.setPhoneNumber(sdt);
        Coachs.add(coach1);
    }
    
    
    public void EnterDataEmployee(){
        Employees emp1 = new Employees();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String ten = sc.nextLine();
        emp1.setFullName(ten);
        
        System.out.print("Enter your address: ");
        String diachi = sc.nextLine();
        emp1.setAddress(diachi);
        
        do{
             System.out.print("Enter your age: ");
             int tuoi = Integer.parseInt(sc.nextLine());
             emp1.setAge(tuoi);
        }while(emp1.getAge()<0);
        
        System.out.print("Enter your phone number: ");
        String sdt = sc.nextLine();
        emp1.setPhoneNumber(sdt);
        
        System.out.print("Enter your Job: ");
        String locate = sc.nextLine();
        emp1.setJob(locate);
        employees.add(emp1);
    }
   
    
    public void DeleteCoach(ArrayList<Coach> coach, String name){
        for(int i=0; i< coach.size(); i++){
            
            if(coach.get(i).getFullName().equals(name)){
                System.out.println("Deleted user name "+coach.get(i).getFullName());
                coach.remove(coach.get(i));
            }
        }
        
    }
    
    
    public void DeletePlayer(ArrayList<Players> player, String name){
        for(int i=0; i< player.size(); i++){
            
            if(player.get(i).getFullName().equals(name)){
                System.out.println("Deleted user name "+player.get(i).getFullName());
                player.remove(player.get(i));
            }
        }
        
    }
    
    
    public void DeleteEmployee(ArrayList<Employees> Employees, String name){
        for(int i=0; i< Employees.size(); i++){
            
            if(Employees.get(i).getFullName().equals(name)){
                System.out.println("Deleted user name "+Employees.get(i).getFullName());
                Employees.remove(Employees.get(i));
            }
        }
        
    }
    
  
    public void DisplayMembers(){
        System.out.println("\t\t============< All members list of club >=========");
        System.out.printf("\n %-25s %-25s  %-15s %-10s %-25s %-10s","Full Name","Address","Phone Number"
                ,"Age","Job position","Clothes for Player\n");
        
        for(int i =0; i<players.size();i++){
            System.out.printf("\n %-25s %-25s  %-15s %-10d %-25s %-10d",players.get(i).getFullName(),players.get(i).getAddress(),
                    players.get(i).getPhoneNumber(),players.get(i).getAge(),players.get(i).getLocation(),players.get(i).getClothes());
        }
        
        for(int i =0; i<Coachs.size();i++){
            System.out.printf("\n %-25s %-25s  %-15s %-10d %-25s %-10s",Coachs.get(i).getFullName(),Coachs.get(i).getAddress(),
                    Coachs.get(i).getPhoneNumber(),Coachs.get(i).getAge(),"Coach","----");
        }
        
        for(int i =0; i<employees.size();i++){
            System.out.printf("\n %-25s %-25s  %-15s %-10d %-25s %-10s",employees.get(i).getFullName(),employees.get(i).getAddress(),
                    employees.get(i).getPhoneNumber(),employees.get(i).getAge(),employees.get(i).getJob(),"----");
        }
    }
    
    
    public void PayRollPlayer(){
        float luong;
        float gio;
        float tien;
        int Join = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter full name of player: ");
        String Pname = sc.nextLine();
        
        for(int i = 0;i< matchs.size();i++){
            for(int j = 0; j< matchs.get(i).getSCPlayer().length; j++){
                if(Pname.equals(matchs.get(i).getSCPlayer()[j].getFullName())){
                 Join = Join + 1;
                }
            }
        }
        System.out.println("Total number of competition times: "+Join);
        
        do{
        System.out.print("Enter your salary/hour: ");
        luong = Float.parseFloat(sc.nextLine());
        }while( luong < 0);
            
        do{
        System.out.print("Enter your number of hours worked: ");
        gio = Float.parseFloat(sc.nextLine());
        }while( gio < 0);
            
        if(gio>=224)
             tien = (float) ((224*luong)+((gio-224)*1.5*luong)+(Join*2*luong));
	else
             tien = (gio*luong)+(Join*2*luong);
        
        for(int i = 0;i< players.size();i++){
            if(Pname.equals(players.get(i).getFullName())){
                players.get(i).setSalary(tien);
            }
        }
    }
    
    
    public void PayRollCoach(){
        float luong;
        float gio;
        float tien;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter full name of coach: ");
        String Pname = sc.nextLine();
        
        do{
        System.out.print("Enter your salary/hour: ");
        luong = Float.parseFloat(sc.nextLine());
        }while( luong < 0);
            
        do{
        System.out.print("Enter your number of hours worked: ");
        gio = Float.parseFloat(sc.nextLine());
        }while( gio < 0);
            
        if(gio >= 224)
             tien = (float) ((224*luong)+((gio-224)*1.5*luong));
	else
             tien = (gio*luong);
        
        for(int i = 0;i< Coachs.size();i++){
            if(Pname.equals(Coachs.get(i).getFullName())){
                Coachs.get(i).setSalary(tien);
            }
        }
        
    }
    
    
    public void PayRollEmployee(){
        float luong;
        float gio;
        float tien;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter full name of coach: ");
        String Pname = sc.nextLine();
        
        do{
        System.out.print("Enter your salary/hour: ");
        luong = Float.parseFloat(sc.nextLine());
        }while( luong < 0);
            
        do{
        System.out.print("Enter your number of hours worked: ");
        gio = Float.parseFloat(sc.nextLine());
        }while( gio < 0);
            
        if(gio>=224)
             tien = (float) ((224*luong)+((gio-224)*1.5*luong));
	else
             tien = (gio*luong);
        
        for(int i = 0;i< employees.size();i++){
            if(Pname.equals(employees.get(i).getFullName())){
                employees.get(i).setSalary(tien);
            }
        }
    }
    
    
    public void UpdatePlayer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of player that you wanna update: ");
        String Uname = sc.nextLine();
        
        for(int i = 0; i<players.size();i++){
            
            if(Uname.equals(players.get(i).getFullName())){
                System.out.printf("\n | %-25s | %-25s  | %-15s | %-10s | %-25s | %-10s","Full Name","Address","Phone Number"
                ,"Age","Job position","Clothe number");
                
                System.out.printf("\n %-25s %-25s  %-15s %-10d %-25s %-10d",players.get(i).getFullName(),players.get(i).getAddress(),
                players.get(i).getPhoneNumber(),players.get(i).getAge(),players.get(i).getLocation(),players.get(i).getClothes());
                System.out.println("\n\t=====< Update Information >======");
                System.out.print("Enter your full name: ");
                players.get(i).setFullName(sc.nextLine());

                System.out.print("Enter your address: ");
                players.get(i).setAddress(sc.nextLine());
                
                do{
                     System.out.print("Enter your age: ");
                     players.get(i).setAge(Integer.parseInt(sc.nextLine()));
                }while(players.get(i).getAge()<0);

                System.out.print("Enter your phone number: ");
                players.get(i).setPhoneNumber(sc.nextLine());

                System.out.print("Enter your location: ");
                players.get(i).setLocation(sc.nextLine());

                do{
                     System.out.print("Enter your clother number: ");
                     players.get(i).setClothes(Integer.parseInt(sc.nextLine()));
                }while(players.get(i).getClothes()<0);
                System.out.println("\n\t=====< Update Information >======");
                System.out.printf("\n %-25s %-25s  %-15s %-10s %-25s %-10s","Full Name","Address","Phone Number"
                ,"Age","Job position","Clothe number");
                System.out.printf("\n %-25s %-25s  %-15s %-10d %-25s %-10d",players.get(i).getFullName(),players.get(i).getAddress(),
                players.get(i).getPhoneNumber(),players.get(i).getAge(),players.get(i).getLocation(),players.get(i).getClothes());
                }
             }
        }
    
    
    
        public void UpdateCoach(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of coach that you wanna update: ");
        String Uname = sc.nextLine();
        
        for(int i = 0; i<Coachs.size();i++){
            if(Uname.equals(Coachs.get(i).getFullName())){
                System.out.printf("\n %-25s %-25s  %-15s %-10s","Full Name","Address","Phone Number"
                ,"Age");
                System.out.printf("\n %-25s %-25s  %-15s %-10d %-25s %-10d",Coachs.get(i).getFullName(),Coachs.get(i).getAddress(),
                Coachs.get(i).getPhoneNumber(),Coachs.get(i).getAge());
                
                System.out.println("\t=====< Update Information >======");
                System.out.print("Enter your full name: ");
                Coachs.get(i).setFullName(sc.nextLine());

                System.out.print("Enter your address: ");
                Coachs.get(i).setAddress(sc.nextLine());
                
                do{
                     System.out.print("Enter your age: ");
                     Coachs.get(i).setAge(Integer.parseInt(sc.nextLine()));
                }while(Coachs.get(i).getAge()<0);

                System.out.print("Enter your phone number: ");
                Coachs.get(i).setPhoneNumber(sc.nextLine());
                
                System.out.println("===============================================================");
                System.out.printf("\n %-25s %-25s  %-15s %-10s","Full Name","Address","Phone Number"
                ,"Age");
                System.out.printf("\n %-25s %-25s  %-15s %-10d %-25s %-10d",Coachs.get(i).getFullName(),Coachs.get(i).getAddress(),
                Coachs.get(i).getPhoneNumber(),Coachs.get(i).getAge());
            }
        }
    }
        
        
        
        public void UpdateEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of coach that you wanna update: ");
        String Uname = sc.nextLine();
        
        for(int i = 0; i<employees.size();i++){
            if(Uname.equals(employees.get(i).getFullName())){
                System.out.printf("\n %-25s %-25s  %-15s %-10s %-20s","Full Name","Address","Phone Number","Age");
                System.out.printf("\n %-25s %-25s  %-15s %-10d %-20s",employees.get(i).getFullName(),employees.get(i).getAddress(),
                employees.get(i).getPhoneNumber(),employees.get(i).getAge(), employees.get(i).getJob());
                
                System.out.println("\t=====< Update Information >======");
                System.out.print("Enter your full name: ");
                employees.get(i).setFullName(sc.nextLine());

                System.out.print("Enter your address: ");
                employees.get(i).setAddress(sc.nextLine());
                
                do{
                     System.out.print("Enter your age: ");
                     employees.get(i).setAge(Integer.parseInt(sc.nextLine()));
                }while(employees.get(i).getAge()<0);

                System.out.print("Enter your phone number: ");
                employees.get(i).setPhoneNumber(sc.nextLine());
                
                System.out.println("===============================================================");
                System.out.printf("\n %-25s %-25s  %-15s %-10s %-20s","Full Name","Address","Phone Number","Age");
                System.out.printf("\n %-25s %-25s  %-15s %-10d %-20s",employees.get(i).getFullName(),employees.get(i).getAddress(),
                employees.get(i).getPhoneNumber(),employees.get(i).getAge(), employees.get(i).getJob());
            }
        }
    }
        
        
       public void DisplaySalary(){

           System.out.println("\n\t===============================================================");
           System.out.printf("\n %-25s %-25s %-30s %-20s","Full Name","Address","Position","Salary");
           for(int i = 0; i< players.size(); i++){
               System.out.printf("\n %-25s %-30s %-25s %-20.2f",players.get(i).getFullName(),players.get(i).getAddress(),
                       players.get(i).getLocation(),players.get(i).getSalary());
           }
           for(int i = 0; i< employees.size(); i++){
               System.out.printf("\n %-25s %-30s %-25s %-20.2f",employees.get(i).getFullName(),employees.get(i).getAddress(),
                       employees.get(i).getJob(),employees.get(i).getSalary());
           }
           for(int i = 0; i< Coachs.size(); i++){
               System.out.printf("\n %-25s %-30s %-25s %-20.2f",Coachs.get(i).getFullName(),Coachs.get(i).getAddress(),
                       " ",Coachs.get(i).getSalary());
           }
           
       } 
        
       
       
       
       public void ProfitStatistics(){
            Scanner sc = new Scanner(System.in); 
            double totalPlayers = 0,totalTickets = 0, totalRent = 0;
            double Profit = 0;
            
            System.out.print("Enter the total money that to rent the yard: ");
                totalRent = Double.parseDouble(sc.nextLine());
                
            for(int i = 0; i < players.size();i++){
                totalPlayers = totalPlayers + players.get(i).getSalary();
            }
            
            for(int i = 0; i< tickets.size();i++){
                totalTickets = totalTickets + tickets.get(i).getPrice();
            }
            
            Profit = totalTickets - (totalPlayers + totalRent);
            
            System.out.printf("\n%-20s %-20s %-20s %-20s","Total Players'Salary","Rent the yard","Total Tickets","Profit");
            System.out.printf("\n%-20.1f %-20.1f %-20.1f %-20.1f",totalPlayers,totalRent,totalTickets,Profit);
       } 
       
       
       
       public void createPlayers(){
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
           Players player12 = new Players("Nguyen Van Quyet", "Gio Linh", 27, "0125631488","Midfielder", 18);
           Players player13 = new Players("Bui Tien Dung", "Nghe An", 20, "0125631488","Goalkeeper", 25);
           Players player14 = new Players("Dang Van Lam", "Nghe An", 21, "0125631488","Goalkeeper", 13);
           players.add(player1);
           players.add(player2);
           players.add(player3);
           players.add(player4);
           players.add(player5);
           players.add(player6);
           players.add(player7);
           players.add(player8);
           players.add(player9);
           players.add(player10);
           players.add(player11);
           players.add(player12);
           players.add(player13);
           players.add(player14);
       }
 
    public void createCoachs(){
          Coach coach1 = new Coach("Nguyen Hong Son", "Vietnam", 40, "01256241475");
          Coach coach2 = new Coach("Pack HangSeo", "Korea", 50, "01256251575");
          Coach coach3 = new Coach("Leonardo Jardim", "American", 45, "01256241475");
          Coach coach4 = new Coach("Carlo Ancelotti", "Italy", 55, "01256241475");
          Coach coach5 = new Coach("Massimiliano Allegri", "Switland", 40, "01256241475");
          Coach coach6 = new Coach("Zinedine Zidane", "French", 43, "01256241475");
          Coachs.add(coach1);
          Coachs.add(coach2);
          Coachs.add(coach3);
          Coachs.add(coach5);
          Coachs.add(coach4);
          Coachs.add(coach6);
}
    
    public void createEmployee(){
        
          Employees emp1 = new Employees("Nguyen Thi Anh Ngoc", "Nghe An", 19, "0125478657","Medical staff");
          Employees emp2 = new Employees("Le Thi Hien", "Hung Yen", 21, "0125478657","Medical staff");
          Employees emp3 = new Employees("Bui Vinh Phuc", "Ha Noi", 20, "0125478657","Ticket manager");
          Employees emp4 = new Employees("Le Van Dat", "Khanh Hoa", 19, "0125478657","Medical staff");
          Employees emp5 = new Employees("Duong Huy Vu", "Bac Kan", 23, "0125478657","Medical staff");
          Employees emp6 = new Employees("Tran Phuong Thao", "Thanh Hoa", 40, "0125478657","Ticket manager");
          
          employees.add(emp6);
          employees.add(emp5);
          employees.add(emp4);
          employees.add(emp3);
          employees.add(emp2);
          employees.add(emp1);
          
}

    
    
    
    @Override
    public void EnterData() {
    }

    @Override
    public void displayData() {
    }


}
