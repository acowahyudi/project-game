import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BG_Awal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BG_Awal extends World
{

    /**
     * Constructor for objects of class BG_Awal.
     * 
     */
    public BG_Awal()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 400, 1);
        setPaintOrder(Mulai.class);
        setPaintOrder(Keluar.class);
        addObject(new Mulai(),580,286);     
        addObject(new Keluar(),580,343);
        
    }
}