import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
    
    private static final Color transparent = new Color(0, 0, 0, 0);
    private int delayTime = 0;
    private int sizeX = 400;
    private int sizeY = 600;
    public GameOver(int score)
    {
        GreenfootImage image = new GreenfootImage(sizeX, sizeY);
        image.setColor(new Color(0, 0, 0, 192));
        image.fill();
        GreenfootImage text1 = new GreenfootImage("GAME OVER!", 40, Color.WHITE, transparent);
        GreenfootImage text2 = new GreenfootImage("PRESS ENTER TO PLAY AGAIN", 30, Color.WHITE, transparent);
        GreenfootImage text3 = new GreenfootImage("YOUR SCORE: "+score, 40, Color.WHITE, transparent);
        image.drawImage(text1, sizeX/2-(text1.getWidth()/2), 400);
        image.drawImage(text2, sizeX/2-(text2.getWidth()/2), 450);
        image.drawImage(text3, sizeX/2-(text3.getWidth()/2), 330);
        setImage(image);
    }

    public void act() 
    {
        delayTime++;
        if(Greenfoot.isKeyDown("enter") && delayTime >= 20)
        {
            Greenfoot.setWorld(new Background());
        }
    }
}    