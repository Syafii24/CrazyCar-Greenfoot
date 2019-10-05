import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Objek pada class ini bergerak dari atas ke bawah.
 * Kecepatan tiap objek berbeda-beda.
 * @author (YK) 
 * @version (20 April 2017)
 */
public class Car extends Enemies
{
    // Membuat variabel images.
    private GreenfootImage[] images;
    // Membuat variabel kecepatan. Kecepatan antara 2 - 6.
    private int speed = Greenfoot.getRandomNumber(5)+2;
    /**
     * Konstruktor untuk objek dari class Car.
     */
    public Car()
    {
        images = new GreenfootImage[3];
        images[0] = new GreenfootImage("ambulance-n.png");
        images[1] = new GreenfootImage("car03-n.png");
        images[2] = new GreenfootImage("car02-n.png");
        // Menetapkan gambar tampilan dengan menggunakan variabel di atas.
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