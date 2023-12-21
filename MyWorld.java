import greenfoot.*;

public class MyWorld extends World {
    public static int health = 10;
    public static int money = 100;
    int basicTowerPrice = 50;
    public static int worldTime = 0;
    int waveNumber = 1;
    int cannonTowerPrice = new CannonTower().getTowerPrice();
    int machineGunTowerPrice = new MGTower().getTowerPrice();
    int missileLauncherTowerPrice = new MLTower().getTowerPrice();
    boolean stopSpawn;
    boolean stageSet = false;

    public MyWorld() {    
        super(840, 600, 1); 
        Menu menu = new Menu();
        addObject(menu, 720, 300);
        addObject(new MoneyDisplay(), 720, 30);
        addObject(new LifeDisplay(), 720, 90);
        addObject(new CannonDisplay(), 720, 150);
        addObject(new MGDisplay(), 720, 210);
        addObject(new MLDisplay(), 720, 270);
        resetLife();
    }

    public void resetLife() {
        health = 10;
    }

    public void act() {
        worldTime++;
        addInTowers();
        spawnWave();

        if (health < 1) {
            setGameOver();
        }
        
        if (worldTime == 1 && !stageSet) {
            Greenfoot.setWorld(new Stage1());
            stageSet = true;
        } else if (worldTime == 1300 && !stageSet) {
            money = 200;
            Greenfoot.setWorld(new Stage2());
            stageSet = true;
        } else if (worldTime == 3000 && !stageSet){
            money = 1000;
            Greenfoot.setWorld(new Stage3());
            stageSet = true;
        }
    }

    // Common method structure, to be overridden by subclasses
    protected void createMap() {
        // Provide a default or common implementation here
    }

    public void setGameOver() {
        Greenfoot.stop();
        showGameOver();
    }

    public void showGameOver() {
        showText("Game Over", getWidth() / 2, 30);
    }

    public void addInTowers() {
        if (Greenfoot.mouseClicked(null) &&
            Greenfoot.getMouseInfo().getActor() != null &&
            money >= basicTowerPrice) {
            Actor clickedActor = Greenfoot.getMouseInfo().getActor();

            if (clickedActor instanceof CannonDisplay && money >= cannonTowerPrice) {
                deployTower(new CannonTower(), Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
            } else if (clickedActor instanceof MGDisplay && money >= machineGunTowerPrice) {
                deployTower(new MGTower(), Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
            } else if (clickedActor instanceof MLDisplay && money >= missileLauncherTowerPrice) {
                deployTower(new MLTower(), Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
            }
        }
    }

    private void deployTower(Tower tower, int x, int y) {
        addObject(tower,
                (x / 60) * 60 + 30,
                (y / 60) * 60 + 30);
        money -= tower.getTowerPrice();
    }

    public void spawnWave(){
        // Provide a common implementation or leave it empty
    }
}
