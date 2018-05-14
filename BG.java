import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BG extends World
{
    private int skor;
    private int jeda=0;
    private int timer=3600;
    public void act()
    {
        if(timer==2400)
        {
            setPaintOrder(ufo3.class);
            addObject(new ufo3(),Greenfoot.getRandomNumber(700),Greenfoot.getRandomNumber(100));
        }
        showText("Time Left :"+ getTimer(),70,50);
        if(jeda>0)jeda--;
        else jeda=100;
        if(jeda==1){
        int randomHeight=Greenfoot.getRandomNumber (getHeight()/3);
        addObject (new ufo2(-(Greenfoot.getRandomNumber (90))), getWidth()+100,randomHeight);
        }
        
        
        if (timer>0)
        {
            timer--;
            if (timer==0) Greenfoot.stop();
        }
        
        
    }
    public BG()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 400, 1,true); 
        setPaintOrder(pesawat.class);
        addObject(new pesawat(),300,360);
        
    }
    
    public int getSkor() {
        return skor;
    }
    
    
    public void updSkor(int x){
        skor+=x;
    }
    
    public int getTimer(){
        return timer/60;
    }
}


