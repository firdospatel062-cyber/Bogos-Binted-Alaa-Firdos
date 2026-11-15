import greenfoot.*;

public class Wall extends Actor
{
    // Plain wall (used for the outer border)
    public Wall(int width, int height)
    {
        this("wall", width, height);
    }

    // Furniture: "desk", "chair", "plant", "cabinet", or "wall"
    public Wall(String style, int width, int height)
    {
        GreenfootImage img = new GreenfootImage(width, height);

        if (style.equals("desk"))         drawDesk(img, width, height);
        else if (style.equals("chair"))   drawChair(img);
        else if (style.equals("plant"))   drawPlant(img);
        else if (style.equals("cabinet")) drawCabinet(img, width, height);
        else                              drawWall(img, width, height);

        setImage(img);
    }

    private void drawWall(GreenfootImage img, int w, int h)
    {
        img.setColor(new Color(45, 62, 85));
        img.fill();
        img.setColor(new Color(75, 98, 128));
        img.fillRect(2, 2, w - 4, h - 4);

        img.setColor(new Color(0, 180, 170));
        if (w >= h)
        {
            img.fillRect(4, h / 2 - 1, w - 8, 3);
        }
        else
        {
            img.fillRect(w / 2 - 1, 4, 3, h - 8);
        }
    }

    private void drawDesk(GreenfootImage img, int w, int h)
    {
        // Light desk top
        img.setColor(new Color(242, 242, 236));
        img.fill();

        Color monitor = new Color(45, 50, 60);
        Color keyboard = new Color(190, 196, 204);

        if (w >= h)
        {
            for (int x = 15; x + 40 <= w - 5; x += 60)
            {
                img.setColor(monitor);
                img.fillRect(x + 4, 6, 32, 8);
                img.setColor(keyboard);
                img.fillRect(x + 6, 20, 28, 10);
            }
        }
        else
        {
            for (int y = 15; y + 40 <= h - 5; y += 60)
            {
                img.setColor(monitor);
                img.fillRect(6, y + 4, 8, 32);
                img.setColor(keyboard);
                img.fillRect(20, y + 6, 10, 28);
            }
        }

        // Dark edge
        img.setColor(new Color(90, 95, 105));
        img.drawRect(0, 0, w - 1, h - 1);
        img.drawRect(1, 1, w - 3, h - 3);
    }

    private void drawChair(GreenfootImage img)
    {
        // Seat
        img.setColor(new Color(60, 110, 160));
        img.fillOval(2, 2, 26, 26);
        img.setColor(new Color(35, 65, 100));
        img.drawOval(2, 2, 26, 26);
        // Backrest
        img.setColor(new Color(40, 75, 115));
        img.fillRect(5, 23, 20, 5);
    }

    private void drawPlant(GreenfootImage img)
    {
        // Pot
        img.setColor(new Color(150, 90, 50));
        img.fillOval(8, 8, 24, 24);
        // Leaves
        img.setColor(new Color(60, 160, 80));
        img.fillOval(2, 10, 16, 16);
        img.fillOval(22, 10, 16, 16);
        img.fillOval(10, 2, 16, 16);
        img.fillOval(10, 22, 16, 16);
        img.setColor(new Color(85, 195, 105));
        img.fillOval(13, 13, 14, 14);
    }

    private void drawCabinet(GreenfootImage img, int w, int h)
    {
        img.setColor(new Color(150, 160, 170));
        img.fill();
        img.setColor(new Color(90, 100, 112));
        img.drawRect(0, 0, w - 1, h - 1);
        img.drawLine(2, h / 3, w - 3, h / 3);
        img.drawLine(2, 2 * h / 3, w - 3, 2 * h / 3);
        img.setColor(new Color(60, 65, 75));
        img.fillRect(w / 2 - 6, h / 6, 12, 3);
        img.fillRect(w / 2 - 6, h / 2, 12, 3);
        img.fillRect(w / 2 - 6, 5 * h / 6, 12, 3);
    }
}