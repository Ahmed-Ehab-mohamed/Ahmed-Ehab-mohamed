package javaapplication27;
import java.util.*;

public class Match 
{
    private int ID;
    private int Score;
    private String FootBall_Referee;
    private String Stadium_Name;
    private int random_month;
    private int random_day;
    Match()
    {
    this(0,0,"null","null",0,0);
    }

    public Match(int ID, int Score, String FootBall_Referee, String Stadium_Name, int random_month, int random_day) {
        this.ID = ID;
        this.Score = Score;
        this.FootBall_Referee = FootBall_Referee;
        this.Stadium_Name = Stadium_Name;
        this.random_month = random_month;
        this.random_day = random_day;
    }
    
    public void setdate()
    {
      Random random = new Random(); 
      int day = 31;
      random_day= random.nextInt(day);
      
      
      int month = 13;
      random_month = random.nextInt(month);
      
      
      
    }
    public void getdate()
      {
          System.out.println(random_day+"/"+random_month+"/2021");
          
      }
    public void Display()
    {
    System.out.println(""+ID+""+Score+""+FootBall_Referee+""+Stadium_Name+""+random_month+random_day);
    }
    public void DisplayMatch(int day, int month)
    {
    if(month>random_month)
    {
    if(day>random_day)
    {
    System.out.println("Held Matches"+ID+"The Score was "+Score);
    
    
    }
    else
    {
    System.out.println("Matches still To Be Held"+ID+"Matches Are To Be Held ON"+random_day);
    }
    }
    else
    {
    System.out.println("Matches still To Be Held"+ID+"Matches Are To Be Held ON"+random_day+random_month);
    }
    }
}         
