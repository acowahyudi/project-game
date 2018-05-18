import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BG_How here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BG_How extends World
{

    /**
     * Constructor for objects of class BG_How.
     * 
     */
    public BG_How()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 400, 1); 
        
        setPaintOrder(Menu_utama.class);     
        addObject(new Menu_utama(),110,350);
    }
}
