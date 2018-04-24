import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pesawat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pesawat extends Actor
{
    /**
     * Act - do whatever the pesawat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        tembak();
        gerakKiri();
        gerakKanan();
        
        
        
    }    
    
    public void tembak () {
    if (Greenfoot.isKeyDown("G")) {
            if (getWorld().getObjects(peluru.class).size() <1) {
            Greenfoot.playSound("tembak.mp3");
            BG mw = (BG) getWorld();
            int posX=getX();
            int posY=getY();
            mw.addObject(new peluru(),posX,posY-10);
            }
         
        }
    }
    
    public void gerakKiri() {
        if (Greenfoot.isKeyDown("Left")) {
        setLocation(getX()-3,getY());
        }
    }
    
    public void gerakKanan() {
        if (Greenfoot.isKeyDown("Right")) {
        setLocation(getX()+ 3,getY());
        }
    }
}
