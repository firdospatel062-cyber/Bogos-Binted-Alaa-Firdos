import greenfoot.*;

public class Collectible extends Actor
{
    private String type;

    public Collectible(String type)
    {
        this.type = type;
        GreenfootImage img = new GreenfootImage(32, 32);

        if (type.equals("coffee"))        drawCoffee(img);
        else if (type.equals("badge"))    drawBadge(img);
        else if (type.equals("document")) drawDocument(img);
        else if (type.equals("keys"))     drawKeys(img);
        else if (type.equals("drink"))    drawDrink(img);

        setImage(img);
    }

    public String getType()
    {
        return type;
    }

    private void drawCoffee(GreenfootImage img)
    {
        img.setColor(new Color(120, 120, 120));
        img.drawLine(11, 2, 11, 8);
        img.drawLine(17, 1, 17, 7);
        img.setColor(Color.BLACK);
        img.drawOval(21, 13, 8, 9);
        img.setColor(Color.WHITE);
        img.fillRect(6, 10, 17, 18);
        img.setColor(new Color(150, 90, 40));
        img.fillRect(6, 15, 17, 8);
        img.setColor(Color.BLACK);
        img.drawRect(6, 10, 17, 18);
    }

    private void drawBadge(GreenfootImage img)
    {
        img.setColor(new Color(40, 120, 220));
        img.fillRect(14, 0, 4, 8);
        img.setColor(Color.WHITE);
        img.fillRect(6, 7, 20, 23);
        img.setColor(Color.BLACK);
        img.drawRect(6, 7, 20, 23);
        img.setColor(new Color(40, 120, 220));
        img.fillRect(10, 11, 12, 9);
        img.setColor(Color.GRAY);
        img.fillRect(10, 23, 12, 2);
        img.fillRect(10, 26, 8, 2);
    }

    private void drawDocument(GreenfootImage img)
    {
        img.setColor(Color.WHITE);
        img.fillRect(7, 3, 18, 26);
        img.setColor(Color.BLACK);
        img.drawRect(7, 3, 18, 26);
        img.setColor(Color.GRAY);
        for (int y = 9; y <= 23; y += 5)
        {
            img.fillRect(10, y, 12, 2);
        }
    }

    private void drawKeys(GreenfootImage img)
    {
        img.setColor(new Color(150, 150, 150));
        img.drawOval(3, 3, 12, 12);
        img.drawOval(4, 4, 10, 10);
        img.setColor(new Color(230, 190, 40));
        img.fillOval(4, 14, 10, 10);
        img.fillRect(12, 17, 16, 4);
        img.fillRect(22, 21, 3, 4);
        img.fillRect(26, 21, 3, 4);
        img.setColor(Color.BLACK);
        img.fillOval(7, 17, 4, 4);
    }

    private void drawDrink(GreenfootImage img)
    {
        img.setColor(new Color(190, 190, 190));
        img.fillRect(9, 2, 14, 3);
        img.fillRect(9, 28, 14, 2);
        img.setColor(new Color(25, 25, 25));
        img.fillRect(9, 5, 14, 23);
        img.setColor(new Color(120, 255, 60));
        int[] xs = {19, 12, 16, 13, 21, 17, 20};
        int[] ys = {8, 18, 18, 26, 15, 15, 8};
        img.fillPolygon(xs, ys, 7);
    }
}