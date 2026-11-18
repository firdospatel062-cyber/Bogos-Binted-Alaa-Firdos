import greenfoot.*;

public class Coffee extends Collectible
{
    public Coffee()
    {
        GreenfootImage img = new GreenfootImage(40, 40);
        img.setColor(new Color(255, 245, 170));
        img.fillOval(0, 0, 40, 40);
        img.setColor(Color.BLACK);
        img.drawOval(0, 0, 39, 39);

        // Cup, handle, and steam
        img.setColor(new Color(120, 70, 30));
        img.fillRect(11, 14, 16, 16);
        img.drawOval(25, 18, 8, 8);
        img.setColor(Color.GRAY);
        img.drawLine(15, 6, 15, 11);
        img.drawLine(21, 6, 21, 11);
        setImage(img);
    }
}