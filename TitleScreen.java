import greenfoot.*; 
public class TitleScreen extends World
{
    /**
     * This is the title screen of the game
     * 
     * @Andy, Charmaine, Brice
     * June 2018
     */
    //Instance Variables
    public GameTitle title;
    public Instructions instructions;
    GreenfootSound titleMusic=new GreenfootSound("backgroundMusic.mp3");
    //Constructor
    public TitleScreen()
    {    
        super(55, 57, 9);
        title = new GameTitle();
        addObject(title, 27, 8);
        instructions = new Instructions();
        addObject(instructions, 27, 34);
        titleMusic.play();
        titleMusic.playLoop();
        //create the title and start an infinite loop of the music
    }

    public void act(){
        //Open main world
        if(Greenfoot.isKeyDown("space")){
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
