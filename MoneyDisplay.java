import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MoneyDisplay extends Menu
{
    MyWorld game;
    public MoneyDisplay(){
        setImage(new GreenfootImage("Money: "+ game.money, 40,Color.BLACK, new Color(0,0,0,0)));
    }
    public void act()
    {
        setImage(new GreenfootImage("Money: " + game.money, 40,Color.BLACK, new Color(0,0,0,0)));
        if(Greenfoot.mouseClicked(this)) game.money = 100;
    }
}
