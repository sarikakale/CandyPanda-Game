import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.Random;
/**
 * Write a description of class Msg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Msg extends Actor implements Msgobs
{
    //GreenfootImage g;
    static String msg;
   
    public Msg()
    {
    }
    
    public void update(int score, CandyPanda fw){
        Depict sh = new Depict();
        if(score>=250 && score<=300){
         msg="That is GREAT!! ";
         sh.display(msg,fw);
        }
        else if(score>=500 && score<=550){
         msg="THAT IS AWSOME!!!!";
         sh.display(msg,fw);
        }
        else if(score>=750 && score<=800){
         msg="You are THE Dragon Warrior!! ";
         sh.display(msg,fw);
        }
        else if(score>=1000 && score<=1050){
         msg=" This is Legendary!!!!!!!!!!!! ";
         sh.display(msg,fw);
        }
        else if(score>=1250 && score<=1300){
         msg=" You are the MASTER!! We are proud of you :)!!! ";
         sh.display(msg,fw);
        }
        else if(score>=1500 && score<=1550){
         msg=" You are the ultimate KUNG FU PANDA !! ";
         sh.display(msg,fw);
        }
     }   
    }


