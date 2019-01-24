import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class displays what level the user is at
 * 
 * @Andy, Charmaine, Brice
 * June 2018
 */
public class LevelDisplay extends Actor
{
    public int level = 1;
    public LevelDisplay()
    {
        setImage (new GreenfootImage("Level " + level , 14, Color.WHITE, new Color(0,0,0,0)));
    }

    public void display() 
    {
        MyWorld world = (MyWorld) getWorld();
        if (((MyWorld) getWorld()).score.currentScore()%5==0 && level < 10)
        {
            level ++;
        }
        // the max level is 10 
        setImage (new GreenfootImage("Level " + level , 14, Color.WHITE, new Color(0,0,0,0)));
    }
    //update the level

    public int currentLevel()
    {
        return level;
    }
    //return the current level
}
