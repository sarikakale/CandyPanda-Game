import greenfoot.*;

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  //   private GreenfootImage image;
   // private GreenfootImage goToNextLevel=new GreenfootImage("ButtonNextLevel.png");
  //  private GreenfootImage endGame=new GreenfootImage("EndGame.png");
    public void act() 
    {
        // Add your action code here.
        
      if(Greenfoot.mousePressed(this)){
          Greenfoot.setWorld(new EndTheGame());
        }
        
    }    
  //  public Button(GreenfootImage image){
    //    setImage(image);
        
    //}
  
    
    
}
