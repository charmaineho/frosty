import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is what the creator leave for the player
 * 
 * @Andy, Charmaine, Brice
 * June 2018
 */ 
public class GameOverDisplay extends Actor
{
    /**
     * Act - do whatever the GameOverDisplay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public String conclusion = "";
    public GameOverDisplay (String result)
    {
        conclusion = result;
    }

    public void act() 
    {
        setImage (new GreenfootImage(conclusion, 35, Color.WHITE, new Color(0,0,0,0)));
    }
    //output the message
}