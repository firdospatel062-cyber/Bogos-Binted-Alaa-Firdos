import greenfoot.*;

public class WinBanner extends Actor
{
    public WinBanner()
    {
        Color navy = new Color(35, 48, 70);
        Color teal = new Color(0, 150, 140);
        Color clear = new Color(255, 255, 255, 0);

        GreenfootImage img = new GreenfootImage(560, 220);
        img.setColor(Color.WHITE);
        img.fill();
        img.setColor(new Color(0, 180, 170));
        img.drawRect(0, 0, 559, 219);
        img.drawRect(2, 2, 555, 215);

        GreenfootImage title = new GreenfootImage("YOU WIN!", 72, navy, clear);
        img.drawImage(title, (560 - title.getWidth()) / 2, 25);

        GreenfootImage sub = new GreenfootImage("All 5 items collected!", 28, teal, clear);
        img.drawImage(sub, (560 - sub.getWidth()) / 2, 118);

        GreenfootImage hint = new GreenfootImage("Click Reset to play again", 20, Color.GRAY, clear);
        img.drawImage(hint, (560 - hint.getWidth()) / 2, 170);

        setImage(img);
    }
}