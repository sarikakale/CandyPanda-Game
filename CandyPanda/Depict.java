import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Display here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Depict extends Actor
{
    /**
     * Act - do whatever the Display wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Msg m;
    public Depict(){
        m = new Msg();
        
    }
    public void act() 
    {
        // Add your action code here.
    }    
    public void display(String msg, CandyPanda candyPanda){
      //  Msg m = new Msg();
        GreenfootImage g = new GreenfootImage(msg, 20, Color.WHITE, Color.BLACK); 
        m.setImage(g);
        candyPanda.addObject(m, 275 , 50);
        
    }
    
    public void remove(CandyPanda candyPanda){
        System.out.println("Removing");
        candyPanda.removeObject(m);
    }
}
