import greenfoot.*;
/**
 * Write a description of class FruitInterface here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CandyStore extends Actor
{   
   
   public static Candy create(CandyType select, int y) {
        Candy candy = null;
        switch (select) {
            case MILKYWAY:
                candy = new MilkyWay();
                candy.setY(y);
                break;
            case TWIX:
                candy = new Twix();
                candy.setY(y);
                break;
            case SNICKERS:
                candy = new Snickers();
                candy.setY(y);
                break;
            case GEMS:
                candy = new Gems();
                candy.setY(y);
                break;
            case KISSES:
                candy = new Kisses();
                candy.setY(y);
                break;
        }
        return candy;
    }
    
}
