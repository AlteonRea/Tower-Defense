import greenfoot.*;
import java.util.List;

public class CannonTower extends Tower
{
    public CannonTower() {
        super(50);
        getImage().scale(60, 60);
    }

    @Override
    public void attackTarget(Enemy target) {
        if (getFireRate() > 13) {
            Projectile projectile = new CannonBullet();
            getWorld().addObject(projectile, getX(), getY());
            projectile.turnTowards(target.getX(), target.getY());
            setFireRate(0);
            turnTowards(target.getX(), target.getY());
        }
    }
}
