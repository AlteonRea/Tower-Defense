import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

class CannonBullet extends Projectile
{

    public CannonBullet(){
        this.speed = 4;
    }
 
    public void act()
    {
        bulletMove();
    }
}
