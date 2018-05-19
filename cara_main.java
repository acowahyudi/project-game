import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cara_main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cara_main extends Actor
{
    /**
     * Act - do whatever the cara_main wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("Click.mp3");
            Greenfoot.setWorld(new BG_CaraMain());
        }
    }    
}
