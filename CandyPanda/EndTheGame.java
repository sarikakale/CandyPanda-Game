import greenfoot.*;

/**
 * Write a description of class EndTheGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndTheGame extends World
{

    /**
     * Constructor for objects of class EndTheGame.
     * 
     */
    PointBoard p;
    public EndTheGame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
       
        
        
    }
    
    public void showScoreBoard(PointBoard p){
    
    
    
    
    }
   public void act() 
    {
        // Add your action code here.
          addObject(p, getWidth()/2, getHeight()/2);
    }    
}
