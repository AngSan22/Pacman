import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PacmanHud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PacmanHud extends Actor
{
    private int score;
    private int level;
    private int lifes;
    
    public void act(){
        refresh();
    }
    
    private void refresh(){
        getWorld().showText("Level: " + level, 100, 30);
        getWorld().showText("Lifes: " + lifes, 250, 30);
        getWorld().showText("Score: " + score, 400, 30);
    }
    
    public void setScore(int score){
        this.score = score;
    }
}
