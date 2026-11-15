import greenfoot.*;

public class Alien extends Actor
{
    private int speed = 3;
    private int itemsCollected = 0;

    public Alien()
    {
        GreenfootImage img = getImage();
        img.scale(32, 48);
        removeWhiteBackground(img);
        setImage(img);
    }

    public void act()
    {
        handleMovement();
        checkCollect();
    }

    private void checkCollect()
    {
        Collectible item = (Collectible) getOneIntersectingObject(Collectible.class);
        if (item != null)
        {
            Greenfoot.playSound("collect.wav");
            OfficeWorld world = (OfficeWorld) getWorld();
            world.removeObject(item);
            itemsCollected++;
            world.updateScore(itemsCollected);

            if (world.getObjects(Collectible.class).isEmpty())
            {
                world.showWin();
            }
        }
    }

    private void removeWhiteBackground(GreenfootImage img)
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

    private void handleMovement()
    {
        int dx = 0;
        int dy = 0;

        if (Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up"))    dy -= speed;
        if (Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("down"))  dy += speed;
        if (Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left"))  dx -= speed;
        if (Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")) dx += speed;

        tryMove(dx, 0);
        tryMove(0, dy);
    }

    private void tryMove(int dx, int dy)
    {
        setLocation(getX() + dx, getY() + dy);
        if (isTouching(Wall.class))
        {
            setLocation(getX() - dx, getY() - dy);
        }
    }
}