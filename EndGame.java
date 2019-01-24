import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
public class EndGame extends World
{
    /**
    * This is the world when the player loses the game
    * 
    * @Andy, Charmaine, Brice
    * June 2018
    */
    //Instance Variables
    public Retry retry;
    public Exit exit;
    public GameOver over;
    HashMap<Integer,String> result = new HashMap<Integer,String>();
    //Constructors
    public EndGame(int score, int level)
    {    
        super(55, 57, 9); 
        for (int i=0; i < 10; i ++)
        {
            result.put(i,"You can do better!!!");
        }
        for (int i=10; i < 20; i ++)
        {
            result.put(i,"No bad!!!");
        }
        for (int i=20; i < 30; i ++)
        {
            result.put(i,"Great Job!!!");
        }
        result.put(30,"WOW! Amazing!!!");
        int item = score;
        if (score >= 30)
        {
            item = 30;
        }
        over = new GameOver();
        addObject(over, 27 , 8);
        retry = new Retry();
        addObject(retry, 15, 46);
        exit = new Exit();
        addObject(exit, 38, 46);
        ResultDisplay resultDisplay = new ResultDisplay(score, level);
        addObject(resultDisplay,26,24);
        GameOverDisplay gameover = new GameOverDisplay(result.get(item));
        addObject(gameover,26,29);
    }
    //Used a hashmap to isolate each score with corresponding message, and add the objects on 
    //the ending screen

    public void act(){
        //Retry or end game buttons
        if(Greenfoot.mouseClicked(retry)){
            Greenfoot.setWorld(new MyWorld());
        }
        if(Greenfoot.mouseClicked(exit)){
            Greenfoot.stop();
        }
    }
}
