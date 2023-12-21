import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jack extends Enemy
{
    int speed = 2;
    public Jack(){
        super(10);
    }
    public void changeImage() {
        String imageName = "JackW" + animationNumber + ".png";
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
