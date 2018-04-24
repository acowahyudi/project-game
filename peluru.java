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
        ufohancur();
 
        }    public void gerakPeluru(){
        int myX=getX();
        int myY=getY();
        int newX=myX;
        int newY=myY-5;
        setLocation(newX,newY); 
        if (isAtEdge()){
            BG mw = (BG) getWorld();
            mw.removeObject(this);
        
        }
    }
    
    public void ufohancur (){
    
        if (isTouching(ufo2.class)){
            removeTouching(ufo2.class);
            Greenfoot.playSound("bom1.mp3");
            BG mw = (BG) getWorld();
            mw.addObject(new ufo2(),200,Greenfoot.getRandomNumber(50));
            
        }
    }
    
}
