    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    public abstract class Projectile extends Actor
    {
        int speed;
        int damage;
        int timer = 60;
    
        public Projectile(int damage){
            this.damage = damage;
        }
    
        public void bulletMove(){
            move(speed);
        }
    
        public int getDamage(){
            return damage;
        }
    
        public void act()
        {
            bulletMove();
            if (timer > 0) {
                timer--;
            } else {
                getWorld().removeObject(this);
            }
        }
    }
