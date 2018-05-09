import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class peluru here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class peluru extends Actor
{
    /**
     * Act - do whatever the peluru wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        gerakPeluru();
 
        }    public void gerakPeluru(){
        int myX=getX();
        int myY=getY();
        int newX=myX;
        int newY=myY-10;
        setLocation(newX,newY); 
        if (isAtEdge()){
            BG mw = (BG) getWorld();
            mw.removeObject(this);
        
        }
    }   
    
}
