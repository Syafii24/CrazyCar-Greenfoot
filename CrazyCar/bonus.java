import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bonus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bonus extends Actor
{
    // Membuat variabel images.
    private GreenfootImage[] images;
    // Membuat variabel kecepatan. Kecepatan antara 2 - 6.
    private int speed = Greenfoot.getRandomNumber(5)+2;
    // Waktu minimum yang dibutuhkan untuk mengganti gambar.
    private static final int imageChangeTime = 7;
    private int imageChangeDelayTime = 0;
    /**
     * Konstruktor untuk objek dari class Ambulance.
     */
    public bonus()
    {
        images = new GreenfootImage[2];
        images[0] = new GreenfootImage("smiley2.png");
        images[1] = new GreenfootImage("balloon3.png");
        // Menetapkan gambar awal dengan menggunakan variabel di atas.
        setImage(images[1]);
    }
    /**
     * Objek akan bergerak dari atas ke bawah.
     * Jika sudah berada di bawah layar, objek akan menghilang.
     */
    public boolean atWorldEdge()
    {
        if(getY() > getWorld().getHeight())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    /**
     * Mengganti gambar sehingga membuat sebuah animasi.
     */
    private void animate()
    {
        imageChangeDelayTime++;
        if(getImage() == images[0] && imageChangeDelayTime >= imageChangeTime)
        {
            setImage(images[1]);
            imageChangeDelayTime = 0;
        }
        if(getImage() == images[1] && imageChangeDelayTime >= imageChangeTime)
        {
            setImage(images[0]);
            imageChangeDelayTime = 0;
        }
    }
    /**
     * Ketika dijalankan, method ini akan menggerakkan objek dari atas ke bawah.
     */
    private void moving()
    {
        setLocation(getX(), getY()+speed);
    }
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
            // Memanggil method animate().
            animate();
            // Memanggil method moving().
            moving();
        }
    }
}    