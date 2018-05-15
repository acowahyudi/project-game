import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BG_End here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BG_End extends World
{

    /**
     * Constructor for objects of class BG_End.
     * 
     */
    public BG_End()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 400, 1); 
        Greenfoot.playSound("Gameover.mid");
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Menu_utama menu_utama = new Menu_utama();
        addObject(menu_utama,358,362);
        menu_utama.setLocation(352,363);
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        Greenfoot.setWorld(new BG_Awal());
    }
    
    
}
