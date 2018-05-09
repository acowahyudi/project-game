import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ufo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ufo extends Actor
{
    /**
     * Act - do whatever the ufo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int skor;
    public void act() 
    {
        BG my =(BG)getWorld();
        getWorld().showText("SKOR :"+ my.getSkor(),50,30);
        int a=5;
        int b=180;
        move(a);// Add your action code here.
        
        if (isAtEdge()){
            turn(b);
           
            
        }
    }   
    

}

