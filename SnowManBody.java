import greenfoot.*;
/**
 * This is the body class of the snake
 * 
 * @Andy, Charmaine, Brice
 * June 2018
 */ 
public class SnowManBody extends Actor
{
    //Instance Variables
    SnowManBody body;
    int nx;
    int ny;
    int nrotation;

    //Constructor
    public SnowManBody(){
        GreenfootImage image=getImage();
        image.scale(8,8);
        setImage(image);
    }

    //Methods
    public void move(int x, int y, int rotation){
        nx = getX();
        ny = getY();
        nrotation = getRotation();
        setLocation(x,y);
        setRotation(rotation);
        if(body != null){
            body.move(nx,ny,nrotation);
        }
        //the body follows the head's motion
    }

    public void addBody(){
        if(body == null){
            body = new SnowManBody();
            if(getRotation() == 0){
                getWorld().addObject(body, getX(), getY()+1);
            }
            else if(getRotation() == 90){
                getWorld().addObject(body, getX()-1, getY());
            }
            else if(getRotation() == 180){
                getWorld().addObject(body, getX(), getY()-1);
            }
            else if(getRotation() == 270){
                getWorld().addObject(body, getX()+1, getY());
            }
        }
        else{
            body.addBody();
        }
        //how the snake becomes longer and longer
    }
}