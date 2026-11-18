import greenfoot.*;

public class Wall extends Actor
{
    public Wall(int width, int height, Color color)
    {
        GreenfootImage img = new GreenfootImage(width, height);
        img.setColor(color);
        img.fill();
        img.setColor(Color.DARK_GRAY);
        img.drawRect(0, 0, width - 1, height - 1);
        setImage(img);
    }
}