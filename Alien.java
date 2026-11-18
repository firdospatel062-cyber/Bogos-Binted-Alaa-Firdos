import greenfoot.*;

public class Alien extends Actor
{
    private int speed = 3;
    private int score = 0;

    public Alien()
    {
        GreenfootImage img = getImage();
        img.scale(32, 48);
        removeWhite(img);
        setImage(img);
    }

    public void act()
    {
        moveAround();
        collect();
        talkToCoworker();
    }

    private void moveAround()
    {
        if (Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY() - speed);
            if (isTouching(Wall.class))
            {
                setLocation(getX(), getY() + speed);
            }
        }
        if (Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + speed);
            if (isTouching(Wall.class))
            {
                setLocation(getX(), getY() - speed);
            }
        }
        if (Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - speed, getY());
            if (isTouching(Wall.class))
            {
                setLocation(getX() + speed, getY());
            }
        }
        if (Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + speed, getY());
            if (isTouching(Wall.class))
            {
                setLocation(getX() - speed, getY());
            }
        }
    }

    private void collect()
    {
        // The keys open the locked door (they don't count as an item)
        if (isTouching(Keys.class))
        {
            getWorld().removeObjects(getWorld().getObjects(Door.class));
            removeTouching(Keys.class);
            Greenfoot.playSound("collect.wav");
            getWorld().showText("Door unlocked!", 400, 40);
        }

        // Coffee, badge, document, and photo each count as 1 item
        if (isTouching(Collectible.class))
        {
            removeTouching(Collectible.class);
            Greenfoot.playSound("collect.wav");
            score++;
            getWorld().showText("Items: " + score + " / 4", 80, 40);

            if (score == 4)
            {
                getWorld().showText("Take everything to your coworker!", 400, 40);
            }
        }
    }

    private void talkToCoworker()
    {
        if (isTouching(Coworker.class))
        {
            if (score == 4)
            {
                Greenfoot.setWorld(new WinWorld());
            }
            else
            {
                getWorld().showText("Bring coffee, badge, documents and photos!", 400, 40);
            }
        }
    }

    // Makes the white background of the alien picture see-through.
    // You don't need to change this part.
    private void removeWhite(GreenfootImage img)
    {
        for (int x = 0; x < img.getWidth(); x++)
        {
            for (int y = 0; y < img.getHeight(); y++)
            {
                Color c = img.getColorAt(x, y);
                if (c.getRed() > 220 && c.getGreen() > 220 && c.getBlue() > 220)
                {
                    img.setColorAt(x, y, new Color(255, 255, 255, 0));
                }
            }
        }
    }
}