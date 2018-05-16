import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Keluar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Keluar extends Actor
{
    /**
     * Act - do whatever the Keluar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("Click.mp3");
            Greenfoot.delay(30);
            System.exit(1);
        }
    }    
}
