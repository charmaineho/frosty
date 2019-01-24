import greenfoot.*;
/**
 * This is the where the score of the player will be kept track of
 * 
 * @Andy, Charmaine, Brice
 * June 2018
 */
public class Score extends Actor
{
    //Instance Variables
    private int score = 0;
    private String text;
    private int prevScore;
    private int stringLength;
    public Sun sun;

    //Constructor
    public Score(){
        text = "Score: ";
        stringLength = (text.length() + 2) * 10;
        setImage(new GreenfootImage(stringLength, 16));
        GreenfootImage image = getImage();
        image.setColor(Color.WHITE);
        updateImage();
        //display the score
    }

    //Methods
    public void addPoint(){
        score += 1;
        updateImage();
        int [] speed = {38,39,41,42,44,45,47,48,50,51};
        if(score %5 ==0 && score<= 50){           
            Greenfoot.setSpeed(speed[score/5]);
            addSun();
        }
        ((MyWorld)(getWorld())).levelDisplay.display(); 
        //adding points
        //add items to the game once the player reaches certain score
    }

    public void addSun(){
        sun=new Sun();
        getWorld().addObject(sun, Greenfoot.getRandomNumber(50)+1, Greenfoot.getRandomNumber(5)+1);
        //method for add a sun to the game
    }

    private void updateImage(){
        GreenfootImage image = getImage();
        image.clear();
        image.drawString(text + score, 1, 14);
        //updating the score
    }

    public int currentScore()
    {
        return score;
        //method to obstain current score
    }
}