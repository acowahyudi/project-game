import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ufo2 extends ufo
{
    int skor;
    private int vx=0;
    private boolean toRemove=false;
    
    public ufo2()
    {
        
        
    }
    
    public ufo2 (int v)
    {
        vx=v;
    }
       
    public void kenatembak(){
        //removeTouching(ufo.class);
        pecah();
        BG my =(BG)getWorld();
        my.updSkor(20);
         Greenfoot.playSound("Bom1.mp3");
        if (isAtEdge())toRemove=true;
    }
        
    public void gerak()
    {
        move(5);
        if (isAtEdge()){
            turn(180);
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
          
        BG my =(BG)getWorld();
        getWorld().showText("SKOR :"+ my.getSkor(),50,30);        
        if (isTouching(peluru.class)){
         kenatembak();
        }
        
        if(!toRemove)gerak();
        else getWorld().removeObject(this);
    }
}
