import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class about_us here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class about_us extends Actor
{
    /**
     * Act - do whatever the about_us wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        Greenfoot.playSound("Click.mp3");
        Greenfoot.delay(30);
        Greenfoot.setWorld(new BG_About());
    }    
}
