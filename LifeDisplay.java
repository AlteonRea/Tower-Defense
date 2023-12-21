import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LifeDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LifeDisplay extends Menu
{
    MyWorld game;
    public LifeDisplay(){
        setImage(new GreenfootImage("Life: "+ game.health, 40,Color.BLACK, new Color(0,0,0,0)));
    }
    public void act()
    {
        setImage(new GreenfootImage("Life: " + game.health, 40,Color.BLACK, new Color(0,0,0,0)));
    }
}
