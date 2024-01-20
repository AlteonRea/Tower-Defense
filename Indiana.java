import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Indiana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Indiana extends Enemy
{
      int speed = 4;
    public Indiana(){
        super(15, 150);
    }
    public void changeImage() {
        String imageName = "IndianaW" + animationNumber + ".png";
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