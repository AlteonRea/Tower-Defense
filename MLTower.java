import greenfoot.*;
import java.util.List;

public class MLTower extends Tower
{
    public MLTower() {
        super(200);
        getImage().scale(60, 60);
    }

    @Override
    public void attackTarget(Enemy target) {
        if (getFireRate() > 14) {
            Projectile projectile = new Missile();
            getWorld().addObject(projectile, getX(), getY());
            projectile.turnTowards(target.getX(), target.getY());
            setFireRate(0);
            turnTowards(target.getX(), target.getY());
        }
    }
}
