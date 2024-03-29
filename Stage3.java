import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Stage3 extends MyWorld
{
   boolean stopSpawn = false;
   int level = 1;
   public Stage3() {
        super();
        createMap();
    }

    public void createMap() {
        int[][] map = {
            {1, 1, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 3, 1, 1, 2, 0},
            {0, 0, 1, 0, 0, 1, 0, 0, 1, 0},
            {0, 0, 3, 1, 1, 4, 0, 0, 1, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
            {6, 1, 1, 1, 1, 1, 1, 1, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
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
                    addObject(new Jack(), 1, 30);
                }else if(level == 2){
                    addObject(new Girl(), 1, 30);
                }else if(level == 3){
                    addObject(new Indiana(), 1, 30);
                }
            }
            if(worldTime % 350 == 0){
                level++;
            }
            if(worldTime == 1200){
                stopSpawn = true;
            }
        }
}
