import greenfoot.*;

public class Confetti extends Actor
{
    private int fallSpeed;
    private int spin;
    private int phase;

    public Confetti()
    {
        Color[] palette = {
            new Color(0, 180, 170),
            new Color(255, 140, 0),
            new Color(255, 210, 0),
            new Color(90, 170, 255),
            new Color(240, 100, 100),
            Color.WHITE
        };

        int w = 6 + Greenfoot.getRandomNumber(6);
        int h = 10 + Greenfoot.getRandomNumber(6);
        GreenfootImage img = new GreenfootImage(w, h);
        img.setColor(palette[Greenfoot.getRandomNumber(palette.length)]);
        img.fill();
        setImage(img);

        fallSpeed = 2 + Greenfoot.getRandomNumber(4);
        spin = Greenfoot.getRandomNumber(11) - 5;
        phase = Greenfoot.getRandomNumber(360);
    }

    public void act()
    {
        phase += 6;
        int sway = (int) (Math.sin(Math.toRadians(phase)) * 2);
        setLocation(getX() + sway, getY() + fallSpeed);
        turn(spin);

        if (getY() >= getWorld().getHeight() - 1)
        {
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()), 0);
        }
    }
}