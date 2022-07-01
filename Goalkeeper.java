package javaapplication27;

    public class Goalkeeper extends Player
{
  public Goalkeeper() 
    {
        super("null","null",0,0,0,0);
    }

    public Goalkeeper(String name, String Team, int playernum, int age, int Score, int rank) 
    {
        super(name, Team, playernum, age, Score, rank);
    }        

    @Override
    public void print_information() {
        super.print_information();
        System.out.println("Prevent the opposing team from scoring");//To change body of generated methods, choose Tools | Templates.
    }

    
}
