import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PacmanWorld extends World
{

    private static final int WIDTH_WALL = 28;
    private static final int HEIGHT_WALL = 28;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public PacmanWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Wall wall = new Wall();
        int widthWall = wall.getImage().getWidth();

        for(int x = 50; x < 550; x+= WIDTH_WALL){
            wall = new Wall();
            addObject(wall,x,30);

            wall = new Wall();
            addObject(wall,x,350);
        }

        for(int y = 50; y < 200; y+= HEIGHT_WALL){
            wall = new Wall();
            addObject(wall,50,y);

            wall = new Wall();
            addObject(wall,525,y);
        }

        SmallBall smallBall = new SmallBall();
        addObject(smallBall,278,175);
        Strawberry strawberry = new Strawberry();
        addObject(strawberry,153,268);
        Banana banana = new Banana();
        addObject(banana,397,99);
        Bigball bigball = new Bigball();
        addObject(bigball,426,270);
        Cherry cherry = new Cherry();
        addObject(cherry,549,272);
        SmallBall smallBall2 = new SmallBall();
        addObject(smallBall2,453,80);
        SmallBall smallBall3 = new SmallBall();
        addObject(smallBall3,88,292);
        Banana banana2 = new Banana();
        addObject(banana2,198,80);
        Bigball bigball2 = new Bigball();
        addObject(bigball2,246,308);
        SmallBall smallBall4 = new SmallBall();
        addObject(smallBall4,497,308);
        Strawberry strawberry2 = new Strawberry();
        addObject(strawberry2,423,182);
        Bigball bigball3 = new Bigball();
        addObject(bigball3,191,158);
        Ballon ballon = new Ballon();
        addObject(ballon,332,278);
        SmallBall smallBall5 = new SmallBall();
        addObject(smallBall5,286,68);
        SmallBall smallBall6 = new SmallBall();
        addObject(smallBall6,112,211);
        SmallBall smallBall7 = new SmallBall();
        addObject(smallBall7,564,167);
        
        PacmanHud hud = new PacmanHud();
        addObject(hud, 0, 0);
        
        Pacman pacman = new Pacman(hud);
        addObject(pacman,90,70);
    }
}
