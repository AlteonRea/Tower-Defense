import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public abstract class Enemy extends Actor
{
    MyWorld world;
    public int hp;
    int animationNumber = 1;
    int timeLapse = 0;
    boolean remove = false;
    int moneyDrop;
    public Enemy(int hp, int moneyDrop){
        this.hp = hp;
        this.moneyDrop = moneyDrop;
    }
    
    public void act()
    {
        timeLapse++;
        changeImage();
        moveAlongPath();
        hitByProjectile();
        if(remove){
            removeObj();
        }
    }
    
    public void removeObj(){
        getWorld().removeObject(this);
    }
    public abstract void changeImage();
    public void moveAlongPath(){
        move(3);
        List <Road> road90 = getObjectsAtOffset(-30, 0, Road.class);
        for(Road roads: road90){
            if(roads.straight == false && getRotation() == 0){
                setRotation(roads.turn);
            }
        }
        List <Road> road0 = getObjectsAtOffset(0, -30, Road.class);
        for(Road roads: road0){
            if(roads.straight == false && getRotation() == 90){
                setRotation(roads.turn);
            }
        }
        List <Road> road180 = getObjectsAtOffset(0, 30, Road.class);
        for(Road roads: road180){
            if(roads.straight == false && getRotation() == 270){
                setRotation(roads.turn);
            }
        }
        List <Road> road270 = getObjectsAtOffset(30, 0, Road.class);
        for(Road roads: road270){
            if(roads.straight == false && getRotation() == 180){
                setRotation(roads.turn);
            }
        }
        
        List<Road> roadList = getIntersectingObjects(Road.class);
        for (Road roads : roadList) {
            if (roads.getTurn() == 6) {
                world.health--;
                remove = true;
            }
        }
    }
    
    public void hitByProjectile(){
        Actor projectile = getOneIntersectingObject(Projectile.class);
        if(projectile != null){
            hp -= ((Projectile) projectile).getDamage();
            getWorld().removeObject(projectile);
        }
        if(hp < 1){
            world.money += moneyDrop;
            getWorld().removeObject(this);
        }
    }
    
}
