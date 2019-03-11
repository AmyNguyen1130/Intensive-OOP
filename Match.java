/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OOP;
import java.*;
import OOP.*;
import static OOP.Players.*;
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
public class Match {
    private String code;
    private String Opponents, Location;
    private int QuanPlayers,Reserve;
    private Players[] SCplayer = new Players[QuanPlayers];
    private Players[] SCreserve = new Players[Reserve];
    private String Time;
    static ArrayList<Match> matchs = new ArrayList<Match>();
    
    
    Match(){
            
    }
    
    public Match(String code, String Opponents, String Location, String Time,int QuanPlayers,int Reserve) {
        this.code = code;
        this.Opponents = Opponents;
        this.Location = Location;
        this.Time = Time;
        this.QuanPlayers = QuanPlayers;
        this.Reserve = Reserve;
        
    }
    public Match(String code, String Opponents, String Location, String Time,int QuanPlayers,int Reserve, Players[] playArr, Players[] RevArr) {
        
        this.code = code;
        this.Opponents = Opponents;
        this.Location = Location;
        this.Time = Time;
        this.QuanPlayers = QuanPlayers;
        this.Reserve = Reserve;
        this.SCplayer = playArr;
        this.SCreserve = RevArr;
        
    }
    
    public void setSCPlayer(Players[] arr){
        this.SCplayer = arr;
    }
    
    public Players[] getSCPlayer(){
        return this.SCplayer;
    }
    
    
    public void setSCreserve(Players[] arr){
        this.SCreserve = arr;
    }
    
    public Players[] getSCreserve(){
        return this.SCreserve;
    }
    
    
    
    public String getOpponents() {
        return Opponents;
    }

    public void setOpponents(String Opponents) {
        this.Opponents = Opponents;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    public int getQuanPlayers() {
        return QuanPlayers;
    }

    public void setQuanPlayers(int QuanPlayers) {
        this.QuanPlayers = QuanPlayers;
    }

    public int getReserve() {
        return Reserve;
    }

    public void setReserve(int Reserve) {
        this.Reserve = Reserve;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    
    
    public void EnterDataMatch() throws ParseException {
        Match match1 = new Match(); 
        Players[] tempPlayer = new Players[this.QuanPlayers];
        Players[] tempReserve = new Players[this.Reserve];
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter the code: ");
        match1.setCode(sc.nextLine());
        
        System.out.print("\nEnter the Opponents: ");
        match1.setOpponents(sc.nextLine());
        
        System.out.print("Enter the time: ");
        String date = sc.nextLine();
        match1.setTime(date);
        
        System.out.print("Enter the location: ");
        match1.setLocation(sc.nextLine());
            
        System.out.print("Enter the quantity players : ");
        match1.setQuanPlayers(Integer.parseInt(sc.nextLine()));
        
            for(int i=0; i<match1.getQuanPlayers();i++){
                int check = 0;
                    do{
                        check = 0;
                        System.out.printf("\nEnter the Players' name %1d: ",i+1);
                        String namePlayers = sc.nextLine();
                        
                        for(int j = 0; j<players.size(); j++){
                            
                            if(players.get(j).equals(namePlayers)){
                               check = 1;
                               tempPlayer[i].setFullName(players.get(j).getFullName());
                               tempPlayer[i].setAddress(players.get(j).getAddress());
                               tempPlayer[i].setAge(players.get(j).getAge());
                               tempPlayer[i].setPhoneNumber(players.get(j).getPhoneNumber());
                               tempPlayer[i].setClothes(players.get(j).getClothes());
                               tempPlayer[i].setLocation(players.get(j).getLocation());
                               tempPlayer[i].setSalary(players.get(j).getSalary());
                            }
                        }
                    
                    }while(check!=1);
            }
            
            match1.setSCPlayer(tempPlayer);
            System.out.print("Enter the reserves: ");
            match1.setReserve(Integer.parseInt(sc.nextLine()));
            
            for(int i=0; i<match1.getReserve();i++){
                int check = 0;
                    do{
                        check = 0;
                        System.out.printf("\nEnter the Reserve's name %1d: ",i);
                        String nameReserve = sc.nextLine();
                        
                        for(int j = 0; j < players.size(); j++){
                            if(players.get(j).equals(nameReserve)){
                               check = 1;
                               tempReserve[i].setFullName(players.get(j).getFullName());
                               tempReserve[i].setAddress(players.get(j).getAddress());
                               tempReserve[i].setAge(players.get(j).getAge());
                               tempReserve[i].setPhoneNumber(players.get(j).getPhoneNumber());
                               tempReserve[i].setClothes(players.get(j).getClothes());
                               tempReserve[i].setLocation(players.get(j).getLocation());
                               tempReserve[i].setSalary(players.get(j).getSalary());
                            }
                        }
                    
                    }while(check!=1);
            }
            match1.setSCreserve(tempReserve);
            matchs.add(match1);
    }
    
    
    public void displayData(){
        
        System.out.println("\t\t===============> SCHEDULE LIST <=============");
        System.out.println("\n");
        System.out.printf("%-30s %-25s %-50s","Opponents","Location","Time");
        for(int i=0; i < matchs.size(); i++){
           Match temp = new Match();
           temp = matchs.get(i);
           System.out.printf("\n%-30s %-25s %-50s",temp.getOpponents(),temp.getLocation(),temp.getTime()); 
        }
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
    
}
