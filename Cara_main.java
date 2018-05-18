import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cara_main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cara_main extends Actor
{
    /**
     * Act - do whatever the Cara_main wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        Greenfoot.playSound("Click.mp3");
        Greenfoot.delay(30);
        Greenfoot.setWorld(new BG_How());
    }    
}
