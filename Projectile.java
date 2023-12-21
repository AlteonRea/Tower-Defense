import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public abstract class Projectile extends Actor
{
    int speed;
    
    public void bulletMove(){
        move(speed);
    }
    public void act()
    {
        // Add your action code here.
    }
}
