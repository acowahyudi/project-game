import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ufo3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ufo3 extends Actor
{
    int skor;
    private int v=1;
    private boolean toRemove=false;
    
   
       
    public void kenatembak(){
        //removeTouching(ufo.class);
        pecah();
        BG my =(BG)getWorld();
        my.updSkor(20);
        //Greenfoot.playSound("Bom1.mp3");
        if (isAtEdge())toRemove=true;
    }
        
    public void gerak()
    {
        move(15);
        if (isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
    
    public void pecah()
    {
        for(int i=0;i<10;i++){
        int px=-20+Greenfoot.getRandomNumber(40);
        int py=-20+Greenfoot.getRandomNumber(40);
        getWorld().addObject(new pecahan(getImage()),getX()+px,getY()+py);
        }
        toRemove=true;
    }
    
    public void act(){       
        if (isTouching(peluru.class)){
         kenatembak();
        }
        
        if(!toRemove)gerak();
        else getWorld().removeObject(this);
    }  
}
