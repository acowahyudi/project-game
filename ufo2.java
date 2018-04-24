import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ufo2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ufo2 extends ufo
{
    /**
     * Act - do whatever the ufo2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int skor;
    public void act() 
    {
        // Add your action code here.
        BG my =(BG)getWorld();
        getWorld().showText("SKOR :"+ my.getSkor(),50,30);
        kenatembak();
        int a=5;
        int b=180;
        move(a);
        
        if (isAtEdge()){
            turn(b);
           
            
        }
    }   
    
    public void kenatembak(){
        if (isTouching(peluru.class)){
        BG my =(BG)getWorld();
        removeTouching(ufo.class);
        my.updSkor(10);
        }
    }
}
