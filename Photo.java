import greenfoot.*;

public class Photo extends Collectible
{
    public Photo()
    {
        GreenfootImage img = new GreenfootImage(40, 40);

        // Yellow circle behind the item
        img.setColor(new Color(255, 245, 170));
        img.fillOval(0, 0, 40, 40);
        img.setColor(Color.BLACK);
        img.drawOval(0, 0, 39, 39);

        // Photo with white border, blue sky, and green grass
        img.setColor(Color.WHITE);
        img.fillRect(8, 9, 24, 22);
        img.setColor(Color.BLACK);
        img.drawRect(8, 9, 24, 22);
        img.setColor(new Color(90, 170, 240));
        img.fillRect(11, 12, 18, 11);
        img.setColor(new Color(70, 180, 90));
        img.fillRect(11, 23, 18, 5);

        setImage(img);
    }
}