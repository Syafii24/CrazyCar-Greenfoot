import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pohon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pohon extends Enemies
{
      // Membuat variabel images.
    private GreenfootImage[] images;
    // Membuat variabel kecepatan.
    private int speed = Greenfoot.getRandomNumber(5)+2;
    /**
    * Konstruktor untuk objek dari class Pohon.
    */
   public Pohon()
    {
        images = new GreenfootImage[3];
        images[0] = new GreenfootImage("car03-n.png");
        images[1] = new GreenfootImage("car03-n1.png");
        images[2] = new GreenfootImage("car03-n2.png");
        // Menetapkan gambar awal dengan menggunakan variabel di atas.
        setImage(images[Greenfoot.getRandomNumber(3)]);
    }
    /**
     * Objek akan bergerak dari atas ke bawah.
     * Jika sudah berada di bawah layar, objek akan menghilang.
     */
    public void act() 
    {
        if(atWorldEdge())
        {
            // Menghapus objek dari layar.
            getWorld().removeObject(this);
            return;
        }
        else
        {
            // Memanggil method moving().
            moving();
        }
    }
    /**
     * Ketika dijalankan, method ini akan menggerakkan objek dari atas ke bawah.
     */
    private void moving()
    {
        setLocation(getX(), getY()+speed);
    }
}    