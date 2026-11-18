import greenfoot.*;

public class Desk extends Wall
{
    public Desk()
    {
        super(180, 50, new Color(245, 245, 240));
        GreenfootImage img = getImage();

        // Three monitors
        img.setColor(new Color(45, 50, 60));
        img.fillRect(19, 6, 32, 8);
        img.fillRect(79, 6, 32, 8);
        img.fillRect(139, 6, 32, 8);

        // Three keyboards
        img.setColor(new Color(190, 196, 204));
        img.fillRect(21, 20, 28, 10);
        img.fillRect(81, 20, 28, 10);
        img.fillRect(141, 20, 28, 10);
    }
}