import greenfoot.*;

public class Coworker extends Actor
{
    public Coworker()
    {
        GreenfootImage img = new GreenfootImage(40, 44);

        // Head
        img.setColor(new Color(240, 200, 160));
        img.fillOval(8, 0, 24, 24);

        // Eyes
        img.setColor(Color.BLACK);
        img.fillOval(14, 9, 4, 4);
        img.fillOval(23, 9, 4, 4);

        // Blue shirt
        img.setColor(new Color(60, 110, 160));
        img.fillRect(5, 24, 30, 20);

        setImage(img);
    }
}