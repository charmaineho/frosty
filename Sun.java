import greenfoot.*; 
/**
 * This is the sun in the game
 * 
 * @Andy, Charmaine, Brice
 * June 2018
 */
public class Sun extends Actor
{
    
    //Constructor
    public Sun(){
        GreenfootImage image=getImage();
        image.scale(15,15);
        setImage(image);
        // create the image
    }    
    
    //Methods
    public void act(){
        moveAround();
    }
    public void moveAround(){
        move(1);
        if(getX()<=1|| getX()>=getWorld().getWidth()-1){
                turn(180);
        }
    }
    //it moves horizontally between the two end
}