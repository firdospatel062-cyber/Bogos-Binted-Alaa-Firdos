import greenfoot.*;

public class Document extends Collectible
{
    public Document()
    {
        GreenfootImage img = new GreenfootImage(40, 40);
        img.setColor(new Color(255, 245, 170));
        img.fillOval(0, 0, 40, 40);
        img.setColor(Color.BLACK);
        img.drawOval(0, 0, 39, 39);

        // Paper with text lines
        img.setColor(Color.WHITE);
        img.fillRect(11, 7, 18, 26);
        img.setColor(Color.BLACK);
        img.drawRect(11, 7, 18, 26);
        img.setColor(Color.GRAY);
        img.drawLine(14, 14, 26, 14);
        img.drawLine(14, 19, 26, 19);
        img.drawLine(14, 24, 26, 24);
        setImage(img);
    }
}