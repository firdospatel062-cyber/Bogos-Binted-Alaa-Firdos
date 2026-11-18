import greenfoot.*;

public class WinWorld extends World
{
    public WinWorld()
    {
        super(800, 600, 1);

        Color navy = new Color(35, 48, 70);
        GreenfootImage bg = getBackground();
        bg.setColor(navy);
        bg.fill();

        // Speech bubble
        bg.setColor(Color.WHITE);
        bg.fillOval(100, 30, 600, 130);
        bg.setColor(Color.BLACK);
        bg.drawOval(100, 30, 600, 130);

        // Little tail pointing down at the coworker
        int[] tailX = {370, 430, 395};
        int[] tailY = {150, 150, 215};
        bg.setColor(Color.WHITE);
        bg.fillPolygon(tailX, tailY, 3);
        bg.setColor(Color.BLACK);
        bg.drawLine(370, 150, 395, 215);
        bg.drawLine(430, 150, 395, 215);

        // Bubble text
        GreenfootImage words = new GreenfootImage("Finally! You brought the photos!", 30, Color.BLACK, Color.WHITE);
        bg.drawImage(words, 400 - words.getWidth() / 2, 80);

        // Coworker: shirt, head, eyes, smile
        bg.setColor(new Color(60, 110, 160));
        bg.fillRect(355, 310, 90, 80);
        bg.setColor(new Color(240, 200, 160));
        bg.fillOval(365, 235, 70, 70);
        bg.setColor(Color.BLACK);
        bg.fillOval(382, 258, 8, 8);
        bg.fillOval(410, 258, 8, 8);
        bg.drawLine(385, 285, 415, 285);

        // Desk with photos on it
        bg.setColor(new Color(150, 100, 60));
        bg.fillRect(280, 380, 240, 60);
        bg.setColor(Color.WHITE);
        bg.fillRect(330, 395, 40, 30);
        bg.fillRect(380, 395, 40, 30);
        bg.setColor(new Color(90, 170, 240));
        bg.fillRect(335, 400, 30, 14);
        bg.fillRect(385, 400, 30, 14);

        // YOU WIN text
        GreenfootImage win = new GreenfootImage("YOU WIN!", 80, Color.WHITE, navy);
        bg.drawImage(win, 400 - win.getWidth() / 2, 470);

        // Confetti
        for (int i = 0; i < 60; i++)
        {
            addObject(new Confetti(),
                      Greenfoot.getRandomNumber(800),
                      Greenfoot.getRandomNumber(600));
        }
    }
}