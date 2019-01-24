import greenfoot.*; 
/**
 * This is the exit button
 * 
 * @Andy, Charmaine, Brice
 * June 2018
 */ 
public class Exit extends Actor
{
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new TitleScreen());
        }
    }  

    public Exit(){
        //Constructor
        GreenfootImage image=getImage();
        image.scale(125,100);
        setImage(image);
    }    
}
