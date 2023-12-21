import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MGBullet extends Projectile
{
    public MGBullet(){
        this.speed = 7;
    }

    public void act()
    {
        bulletMove();
    }
}
