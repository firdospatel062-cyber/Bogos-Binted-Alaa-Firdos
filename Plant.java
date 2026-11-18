import greenfoot.*;

public class Plant extends Wall
{
    public Plant()
    {
        super(40, 40, Color.WHITE);
        GreenfootImage img = getImage();
        img.clear();
        img.setColor(new Color(60, 170, 80));
        img.fillOval(2, 2, 36, 36);
        img.setColor(new Color(150, 90, 50));
        img.fillOval(12, 12, 16, 16);
    }
}