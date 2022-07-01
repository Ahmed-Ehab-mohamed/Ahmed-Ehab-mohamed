package javaapplication27;
import java.io.File;
import java.io.FileWriter;

public class Team extends EgyptianLeague 
{
   private String name;
   private int Id;
   private int playernum;
   private String captain;
   private int TotalScore;
   private static int counter;
public Team() 
    {
        this("null",0,0,"none",0);
       
    }
   
public Team(String name, int Id, int playernum, String captain, int TotalScore) 
    {
        this.name = name;
        this.Id = Id;
        this.playernum = playernum;
        this.captain = captain;
        this.TotalScore = TotalScore;
        counter++;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public int getId() 
    {
        return Id;
    }

    public void setId(int Id) 
    {
        this.Id = Id;
    }

    public int getPlayernum() 
    {
        return playernum;
    }

    public void setPlayernum(int playernum) 
    {
        this.playernum = playernum;
    }

    public String getCaptain() 
    {
        return captain;
    }

    public void setCaptain(String captain) 
    {
        this.captain = captain;
    }

    public int getTotalScore() 
    {
        return TotalScore;
    }

    public void setTotalScore(int TotalScore) 
    {
        this.TotalScore = TotalScore;
    }

    public static int getCounter() 
    {
        return counter;
    }

    public static void setCounter(int counter) 
    {
        Team.counter = counter;
    }

    public File getTeams() 
    {
        return Teams;
    }

    public void setTeams(File Teams) 
    {
        this.Teams = Teams;
    }
   
   
   File Teams=new File("Teams.txt");
}
