import greenfoot.*;

public class Drink extends Collectible
{
    public Drink()
    {
        GreenfootImage img = new GreenfootImage(40, 40);
        img.setColor(new Color(255, 245, 170));
        img.fillOval(0, 0, 40, 40);
        img.setColor(Color.BLACK);
        img.drawOval(0, 0, 39, 39);

        // Energy drink can
        img.setColor(new Color(60, 200, 80));
        img.fillRect(13, 8, 14, 26);
        img.setColor(Color.GRAY);
        img.fillRect(13, 8, 14, 4);
        img.setColor(Color.BLACK);
        img.drawRect(13, 8, 14, 26);
        setImage(img);
    }
}