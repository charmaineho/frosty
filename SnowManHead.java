import greenfoot.*;
/**
 * This is the head of the snowman
 * 
 * @Andy, Charmaine, Brice
 * June 2018
 */
public class SnowManHead extends Actor
{
    //Instance Variables
    SnowManBody body;
    int x;
    int y;
    int rotation;

    //Constructor
    public SnowManHead(){
        GreenfootImage image=getImage();
        image.scale(10,10);
        setImage(image);
        //create the image of the head
    }

    //Methods
    public void act(){
        MyWorld world = (MyWorld) getWorld();
        x = getX();
        y = getY();
        rotation = getRotation();
        turn();
        GreenfootSound endgame=new GreenfootSound("endgame.mp3");
        GreenfootSound sun=new GreenfootSound("sun.mp3");
        // the sound effect within the game
        //How player loses by touching itself, the sun, or out of bounds
        if(getIntersectingObjects(SnowManBody.class).size() > 0){
            endgame.play();
            int i = ((MyWorld) getWorld()).score.currentScore();
            int j = ((MyWorld) getWorld()).levelDisplay.currentLevel();
            Greenfoot.setWorld(new EndGame(i,j));
            getWorld().showText("GAME OVER!",27,28);
            return;
        }
        else if(getIntersectingObjects(Sun.class).size() > 0){
            sun.play();
            int i = ((MyWorld) getWorld()).score.currentScore();
            int j = ((MyWorld) getWorld()).levelDisplay.currentLevel();
            Greenfoot.setWorld(new EndGame(i,j));
            getWorld().showText("GAME OVER!",27,28);
            return;
        }
        else if (getX() == 54 || getY() == 56 || getX() == 0 || getY() == 0){
            endgame.play();
            int i = ((MyWorld) getWorld()).score.currentScore();
            int j = ((MyWorld) getWorld()).levelDisplay.currentLevel();
            Greenfoot.setWorld(new EndGame(i, j));
            getWorld().showText("GAME OVER!",27,28);
            return;
        }

        //Rotation of the snowman
        if(getRotation()==0){
            setLocation(getX(), getY()-1);
        }
        else if(getRotation()==90){
            setLocation(getX()+1, getY());
        }
        else if(getRotation()==180){
            setLocation(getX(), getY()+1);
        }
        else if(getRotation()==270){
            setLocation(getX()-1, getY());
        }  

        if(intersects(((MyWorld)(getWorld())).snowflake)){
            (((MyWorld)(getWorld())).snowflake).setLocation(Greenfoot.getRandomNumber(50)+1,Greenfoot.getRandomNumber(50)+1);
            addBody();
            Greenfoot.playSound("bloop.mp3");
            ((MyWorld)(getWorld())).score.addPoint();
        }
        if(body!=null){
            body.move(x,y,rotation);
            //gets longer and plays a sound when eating the snowflake
        }
    }   

    public void addBody(){
        if(body==null)
        {
            body=new SnowManBody();
            if(getRotation()==0){
                getWorld().addObject(body, getX(), getY()+1);
            }
            if(getRotation()==90){
                getWorld().addObject(body, getX()-1, getY());
            }
            if(getRotation()==180){
                getWorld().addObject(body, getX(), getY()-1);
            }
            if(getRotation()==270){
                getWorld().addObject(body, getX()+1, getY());
            }
        }
        else if(body!=null){
            body.addBody();
            body.body.addBody();
            body.body.body.addBody();
        }
        //becoming longer
    }

    private void turn(){
        if(Greenfoot.isKeyDown("down") && this.getRotation() != 180 && this.getRotation() !=0){
            this.setRotation(180);
        }
        else if(Greenfoot.isKeyDown("up") && this.getRotation() !=0 && this.getRotation() !=180){
            this.setRotation(0);
        }
        else if(Greenfoot.isKeyDown("left") && this.getRotation() !=270 && this.getRotation() !=90){
            this.setRotation(270);
        }
        else if(Greenfoot.isKeyDown("right") && this.getRotation() !=90 && this.getRotation() !=270){
            this.setRotation(90);
        }
        //changing direction
    }
}