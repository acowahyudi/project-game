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
    
    private int jeda=0;
    public void tembak () {
            if (Greenfoot.isKeyDown("space")) {
            if(jeda>0)jeda--;
            if(jeda==1) getWorld().addObject(new peluru(),getX(),getY()-10);
            if(jeda==0)jeda=12;
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


