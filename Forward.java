package javaapplication27;

public class Forward extends Player
{

    public Forward() 
    {
        super("null","null",0,0,0,0);
    }

    public Forward(String name, String Team, int playernum, int age, int Score, int rank) 
    {
        super(name, Team, playernum, age, Score, rank);
    }

    @Override
    public void print_information() {
        super.print_information(); 
        System.out.println(" Players who are positioned near the opposing team's goal");
    }
    
    
}
