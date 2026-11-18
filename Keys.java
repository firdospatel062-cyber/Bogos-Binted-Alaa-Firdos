import greenfoot.*;

public class Keys extends Collectible
{
    public Keys()
    {
        GreenfootImage img = new GreenfootImage(40, 40);
        img.setColor(new Color(255, 245, 170));
        img.fillOval(0, 0, 40, 40);
        img.setColor(Color.BLACK);
        img.drawOval(0, 0, 39, 39);

        // Gold key
        img.setColor(new Color(230, 160, 0));
        img.fillOval(8, 9, 14, 14);
        img.fillRect(20, 14, 14, 5);
        img.fillRect(28, 19, 4, 5);
        setImage(img);
    }
}