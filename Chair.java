import greenfoot.*;

public class Chair extends Wall
{
    public Chair()
    {
        super(30, 30, Color.WHITE);
        GreenfootImage img = getImage();
        img.clear();
        img.setColor(new Color(60, 110, 160));
        img.fillOval(2, 2, 26, 26);
        img.setColor(Color.DARK_GRAY);
        img.drawOval(2, 2, 26, 26);
    }
}