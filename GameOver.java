import greenfoot.*; 
import java.util.*;
/**
 * This is the image GAME OVER image
 * 
 * @Andy, Charmaine, Brice
 * June 2018
 */
public class GameOver extends Actor
{
    public void act() 
    {
        GreenfootImage image=getImage();
        image.scale(175,125);
        setImage(image);
    }
    // open the image is display it
}
