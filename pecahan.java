import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class pecahan extends Actor
{
     public int vx=0,vy=1,rot=2;
    public pecahan(GreenfootImage img)
    {
    GreenfootImage image=new GreenfootImage(10,10);
    image.drawImage(img,-Greenfoot.getRandomNumber(img.getWidth()),-Greenfoot.getRandomNumber(img.getHeight()));
    setImage(image);
    }
    public void addToWorld(World BG)
    {
        vx=-5+Greenfoot.getRandomNumber(40);
        vy=-5+Greenfoot.getRandomNumber(10);
        rot=-10+Greenfoot.getRandomNumber(20);
        if(vx==0)vx=1;
        if(vy==0)vy=1;
        
    }
    public void act() 
    {
        setLocation(getX()+vx,getY()+vy);
        setRotation(getRotation()+rot);
        if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }    
}
