package javaapplication27;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public abstract class Player extends EgyptianLeague
{
   private String name;
   private String Team;
   private int playernum;
   private int age;
   private int Score;
   private int rank;
   private String captain;

    public Player(String name,String Team, int playernum, int age, int Score, int rank) 
    {
        this.name = name;
        this.Team = Team;
        this.playernum = playernum;
        this.age = age;
        this.Score = Score;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String Team) {
        this.Team = Team;
    }

    public int getPlayernum() {
        return playernum;
    }

    public void setPlayernum(int playernum) {
        this.playernum = playernum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int Score) {
        this.Score = Score;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    
    public void setcaptain(String captain)
    {
        this.captain = captain;
    }
    public boolean iscaptain(String c)
    {
        if (c == captain)
            return true;
        else
            return false;
    }
    
    public void print_information()
    {
        System.out.println(("name is: "+name+"Team is: "+Team+"Player number: "+playernum+"Age: "+age+"Score: "+Score+"Rank: "+rank+"Captain"+captain));
    }
    public void PrintTeamPlayers()
    {
    System.out.println("Enter The Team ");
    Scanner input=new Scanner(System.in);
    String team=input.next();
    if(this.Team==team)
    {
    System.out.println(name);
    }
    }
    
    public static void Write(String name,String Team, int playernum, int age , int score, int rank, String captain,File Player)throws IOException
           {
               FileWriter Playerr=new FileWriter(Player,true);
               Playerr.Write(name, Team,playernum,age,score,rank,captain);
               
           }

}
