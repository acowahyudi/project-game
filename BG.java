import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BG extends World
{
    int skor;
    private int jeda=0;
    private int timer=3600;
    private int speed=5;
    public void act()
    {
        if(timer==2400 || timer==1200)
        {
            setPaintOrder(ufo3.class);
            addObject(new ufo3(),Greenfoot.getRandomNumber(10),Greenfoot.getRandomNumber(getHeight()/4)+106);//106=jarak tempat tulisan +lebar ufo3
        }
        showText("SKOR :"+ getSkor(),350,20);
        showText("Time Left :"+ getTimer(),350,40);
        
        ufo3 my =new ufo3();
        showText("Speed Boss Ufo :" + getSpeed(),350,60);
        
        if(jeda>0)jeda--;
        else jeda=100;
        if(jeda==1){
        int randomHeight=Greenfoot.getRandomNumber (getHeight()/3);
        addObject (new ufo2(Greenfoot.getRandomNumber (90)), -(getWidth()),randomHeight+94); //94=jarak tempat tulisan + lebar ufo
        Greenfoot.delay(5);
        addObject (new ufo2(-(Greenfoot.getRandomNumber (180))), getWidth(),randomHeight+100); //100 agar ada perbedaan 6 px jarak dari ufo kiri
        }
        
        
        if (timer>0)
        {
            timer--;
            if (timer==0) {
                BG_Awal BGAwal = new BG_Awal();
                BGAwal.bgmusic.stop();
                Greenfoot.setWorld(new BG_End());
            }
   
       }    
    }
    public BG()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 460, 1,true); 
        setPaintOrder(pesawat.class);
        addObject(new pesawat(),300,420);
        
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
    public void tambahTimer(int y){
        timer+=y;
    }
    
    public int getSpeed()
    {
        return speed;
    }
    public void tambahSpeed(int z)
    {
        speed+=z;
    }
}


