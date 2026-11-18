import greenfoot.*;

public class Badge extends Collectible
{
    public Badge()
    {
        GreenfootImage img = new GreenfootImage(40, 40);
        img.setColor(new Color(255, 245, 170));
        img.fillOval(0, 0, 40, 40);
        img.setColor(Color.BLACK);
        img.drawOval(0, 0, 39, 39);

        // ID card
        img.setColor(new Color(40, 120, 230));
        img.fillRect(12, 8, 16, 24);
        img.setColor(Color.WHITE);
        img.fillRect(15, 12, 10, 8);
        setImage(img);
    }
}