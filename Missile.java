import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Missile extends Projectile
{
    public Missile(){
        this.speed = 2;
    }
    public void act()
    {
        bulletMove();
    }
}
