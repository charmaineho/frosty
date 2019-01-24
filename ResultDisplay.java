import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This displays the final statement the player receives based on the score
 * 
 * @Andy, Charmaine, Brice
 * June 2018
 */
public class ResultDisplay extends Actor
{
    public ResultDisplay (int point, int level)
    {
        setImage (new GreenfootImage("Your Score is " + point + " ended level " + level, 35, Color.WHITE, new Color(0,0,0,0)));
    }
    //output the statement
}
