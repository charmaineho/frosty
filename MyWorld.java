import greenfoot.*;
/**
* This is the world where the player plays the game
* 
* @Andy, Charmaine, Brice
* June 2018
*/
public class MyWorld extends World
{
    //Instance Variables
    public SnowManHead head;
    public SnowFlake snowflake;
    public Score score;
    public LevelDisplay levelDisplay;
    //Constructors
    public MyWorld()
    {    
        super(55, 57, 9);
        head = new SnowManHead();
        addObject(head, 26, 26);
        snowflake = new SnowFlake();
        addObject(snowflake, Greenfoot.getRandomNumber(50)+1, Greenfoot.getRandomNumber(50)+1);
        score = new Score();
        addObject(score,6,1);
        levelDisplay = new LevelDisplay();
        addObject(levelDisplay, 4, 4);
        Greenfoot.setSpeed(38);
    }
    //add all of the objects in the game screen after the player started the game
}