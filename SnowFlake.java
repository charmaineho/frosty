import greenfoot.*;
/**
 * This is the snow flake that the player tries to get
 * 
 * @Andy, Charmaine, Brice
 * June 2018
 */
public class SnowFlake extends Actor
{

    public SnowFlake(){
        GreenfootImage image=getImage();
        image.scale(15,15);
        setImage(image);
    }
    // the image of the flake
}