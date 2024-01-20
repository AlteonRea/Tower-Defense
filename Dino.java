import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Dino extends Enemy
{
  int speed = 4;
  public Dino(){
        super(7, 30);
    }
    public void changeImage() {
        String imageName = "DinoW" + animationNumber + ".png";
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
