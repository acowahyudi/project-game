import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BG_Awal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BG_Awal extends World
{
    public GreenfootSound bgmusic = new GreenfootSound("MainMenu.mid");
    
    
    public BG_Awal()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(700, 400, 1);
        setPaintOrder(Mulai.class);
        setPaintOrder(Keluar.class);
        setPaintOrder(cara_main.class);
        setPaintOrder(about.class);
        
        addObject(new Mulai(),580,286);     
        addObject(new Keluar(),580,343);
        addObject(new cara_main(),120,286);
        addObject(new about(),120,343);
    }
    
    public void started()
    {
        bgmusic.playLoop();
    }
    
    public void stopped()
    {
        bgmusic.stop();
    }
}

