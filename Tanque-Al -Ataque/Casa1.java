import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Casa1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Casa1 extends Objeto

{
    boolean Obs=true;
    /**
     * Act - do whatever the Casa1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    if(isTouching(Tanque.class))
        {
            Obs=false;
        }
        else
        {Obs=true;}
        if(Obs)
        {
          if(Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY()+5);
          }
        }
       
        if( getY()== 649 )
        {
            setLocation(Greenfoot.getRandomNumber(200),0);
            removeTouching(Casa1.class);
    }    
   }
}
