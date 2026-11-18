import greenfoot.*;

public class Door extends Wall
{
    public Door()
    {
        super(70, 20, new Color(150, 90, 40));
        GreenfootImage img = getImage();

        // Gold lock in the middle of the door
        img.setColor(Color.YELLOW);
        img.fillRect(30, 4, 10, 12);
        img.setColor(Color.BLACK);
        img.drawRect(30, 4, 10, 12);
    }
}