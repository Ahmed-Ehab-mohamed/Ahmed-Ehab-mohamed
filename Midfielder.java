/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication27;

/**
 *
 * @author DELL
 */
public class Midfielder extends Player
{
  public Midfielder()
    {
        super("null","null",0,0,0,0);
    }

    public Midfielder(String name, String Team, int playernum, int age, int Score, int rank) 
    {
        super(name, Team, playernum, age, Score, rank);
    }     

    @Override
    public void print_information() {
        super.print_information(); 
        System.out.println("An association football position and links between the defeneders and forward players");
    }
    
}
