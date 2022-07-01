/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication27;

  public class Defender extends Player
{

    public Defender() 
    {
        super("null","null",0,0,0,0);
    }

    public Defender(String name, String Team, int playernum, int age, int Score, int rank) 
    {
        super(name, Team, playernum, age, Score, rank);
    }    

    @Override
    public void print_information() {
        super.print_information(); 
        System.out.println("Stop the attack during the game and prevent the opposing team form scoring goals");

    }
   
}
