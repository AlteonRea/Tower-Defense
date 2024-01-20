import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class Zombie extends Enemy
{
    int speed = 2;
    public Zombie(){
        super(10000, 10);
    }
    public void changeImage() {
        String imageName = "ZombieW" + animationNumber + ".png";
        GreenfootImage zombieImage = new GreenfootImage(imageName);
        zombieImage.scale(60, 60);
        setImage(zombieImage);
    
        if (animationNumber == 10) {
            animationNumber = 1;
        }
    
        if (timeLapse % 20 == 0) {
            animationNumber++;
        }
    }  
}
