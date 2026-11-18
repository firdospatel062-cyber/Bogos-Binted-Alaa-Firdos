import greenfoot.*;

public class Confetti extends Actor
{
    public Confetti()
    {
        GreenfootImage img = new GreenfootImage(10, 10);
        img.setColor(new Color(Greenfoot.getRandomNumber(256),
                               Greenfoot.getRandomNumber(256),
                               Greenfoot.getRandomNumber(256)));
        img.fill();
        setImage(img);
    }

    public void act()
    {
        setLocation(getX(), getY() + 3);
        if (getY() >= 599)
        {
            setLocation(getX(), 0);
        }
    }
}