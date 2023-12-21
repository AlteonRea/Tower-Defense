import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Stage2 extends MyWorld
{
    boolean stopSpawn = false;
    int level = 1;
    public Stage2() {
        super();
        createMap();
    }

    public void createMap() {
        int[][] map = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 1, 1, 1, 1, 2, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
            {0, 0, 0, 0, 0, 2, 1, 1, 5, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 2, 1, 1, 5, 0, 0, 0, 0},
            {0, 0, 6, 0, 0, 0, 0, 0, 0, 0}
        };

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (map[j][i] == 1) {
                    addObject(new Road(true), 30 + i * 60, 30 + j * 60);
                } else if (map[j][i] == 2) {
                    addObject(new Road(90), 30 + i * 60, 30 + j * 60);
                } else if (map[j][i] == 3) {
                    addObject(new Road(0), 30 + i * 60, 30 + j * 60);
                } else if (map[j][i] == 4) {
                    addObject(new Road(270), 30 + i * 60, 30 + j * 60);
                } else if (map[j][i] == 5) {
                    addObject(new Road(180), 30 + i * 60, 30 + j * 60);
                } else if (map[j][i] == 6) {
                    addObject(new Road(6), 30 + i * 60, 30 + j * 60);
                }
            }
        }
    }
    
      public void spawnWave(){
            if(worldTime % 20 == 0 && stopSpawn == false){
                if(level == 1){
                    addObject(new Zombie(), 1, 90);
                }else if(level == 2){
                    addObject(new Dino(), 1, 90);
                }else if(level == 3){
                    addObject(new Jack(), 1, 90);
                }
            }
            if(worldTime % 300 == 0){
                level++;
            }
            if(worldTime == 1000){
                stopSpawn = true;
            }
        }
}
