import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Girl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Girl extends Enemy
{
    int speed = 3;
    public Girl(){
        super(7);
    }
    public void changeImage() {
        String imageName = "GirlW" + animationNumber + ".png";
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
