import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        // Memanggil method moveCar().
       moveCar();
       checkbonus();
       checkCollision();
       
    }
    /**
     * Memeriksa tombol apa yang ditekan,
     * kemudian melakukan perintah berdasarkan tombol yang ditekan tersebut.
     */
    private void moveCar()
    {
    // Add your action code here.
    if(Greenfoot.isKeyDown("right"))
        {
            // Menggerakkan objek ke kanan sebesar 2 cell.
            if(getX() < getWorld().getWidth()) 
            setLocation(getX()+2, getY());
        }
    if(Greenfoot.isKeyDown("left"))
        {
         // Jika posisi objek (sumbu x) lebih besar dari 0.
         if(getX() > 0)
         {
             // Menggerakkan objek ke kiri sebesar 2 cell.
             setLocation(getX()-2, getY());
         }
        }
    }
    /**
     * Memeriksa objek yang bersinggungan/tabrakan.
     * Jika tabrakan dengan objek dari class Enemies atau subclass-nya,
     * maka permainan akan selesai.
     */
    private void checkCollision()
    {
        Enemies a = (Enemies)getOneIntersectingObject(Enemies.class);
        if(a != null)
        {
            ((Background)getWorld()).lose();
            Greenfoot.playSound("loose.mp3");
        }
    }
        /**
     * Memeriksa objek yang bersinggungan.
     * Jika bersinggungan dengan objek Bonus,
     * maka score akan bertambah dan objek Bonus tersebut akan menghilang.
     */
    private void checkbonus()
    {
        bonus b = (bonus)getOneIntersectingObject(bonus.class);
        if(b != null)
        {
            ((Background)getWorld()).addScore();
            getWorld().removeObject(b);
            //Greenfoot.playSound("Bonus.wav");
            return;
        }
    }
    
}