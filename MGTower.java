import greenfoot.*;
import java.util.List;

public class MGTower extends Tower
{
    public MGTower() {
        super(100);
        getImage().scale(60, 60);
    }

    @Override
    public void attackTarget(Enemy target) {
        if (getFireRate() > 4) {
            Projectile projectile = new MGBullet();
            getWorld().addObject(projectile, getX(), getY());
            projectile.turnTowards(target.getX(), target.getY());
            setFireRate(0);
            turnTowards(target.getX(), target.getY());
        }
    }
}
