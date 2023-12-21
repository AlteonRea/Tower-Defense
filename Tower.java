import greenfoot.*;
import java.util.List;

public abstract class Tower extends Actor
{
    private int fireRate = 0;
    private int price;
    
    public Tower(int price){
        this.price = price;
        getImage().scale(60,60);
    }

    public void act() {
        enemyDetector();
    }

    // Abstract method to be implemented by subclasses
    public abstract void attackTarget(Enemy target);

    public void enemyDetector() {
        fireRate++;
        List<Enemy> enemies = getObjectsInRange(100, Enemy.class);
        for (Enemy eachEnemy : enemies) {
            attackTarget(eachEnemy);
        }
    }

    public int getFireRate() {
        return fireRate;
    }

    public void setFireRate(int rate) {
        fireRate = rate;
    }
    
     public int getTowerPrice() {
        return price;
    }
}
