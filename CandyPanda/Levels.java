import greenfoot.*;

/**
 * Write a description of class Levels here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Levels
{
    public int timer=5400;
    void setTimer(int timer);
    void setTimerLevel();
    int getTimer();
    String getNextLevelMessage();
    GreenfootImage changeLevelBackground();

    /**
     * Constructor for objects of class Levels.
     * 
     */
   
}
