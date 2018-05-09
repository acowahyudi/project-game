import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BG extends World
{
    private int skor;
    private int jeda=0;
    public void act()
    {
        if(jeda>0)jeda--;
        else jeda=100;
        if(jeda==1){
        int randomHeight=Greenfoot.getRandomNumber (getHeight()/3);
        addObject (new ufo2(-(Greenfoot.getRandomNumber (90))), getWidth()+100,randomHeight);
        }
    }
    public BG()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 400, 1); 
        setPaintOrder(pesawat.class);
        addObject(new pesawat(),300,360);
    }
    
    public int getSkor() {
        return skor;
    }
    
    
    public void updSkor(int x){
        skor+=x;
    }
    
}


