import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BG here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BG extends World
{
    private int skor;
    
    /**
     * Constructor for objects of class BG.
     * 
     */
    public BG()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setPaintOrder(pesawat.class);
        setPaintOrder(ufo2.class);
        addObject(new ufo2(),300,100);
        addObject(new pesawat(),300,360);
    }
    
    public int getSkor() {
        return skor;
    }
    
    
    public void updSkor(int x){
        skor+=x;
    }
    
}


