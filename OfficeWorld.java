import greenfoot.*;

public class OfficeWorld extends World
{
    public OfficeWorld()
    {
        super(800, 600, 1);
        drawFloor();
        prepare();
    }

    private void drawFloor()
    {
        GreenfootImage bg = new GreenfootImage(800, 600);

        Color[] woods = {
            new Color(196, 150, 100),
            new Color(186, 140, 92),
            new Color(205, 160, 110),
            new Color(178, 132, 86)
        };
        Color seam = new Color(130, 92, 58);
        Color grain = new Color(165, 120, 78);

        for (int row = 0; row < 15; row++)
        {
            int y = row * 40;
            int offset = (row % 3) * 55;

            for (int x = -offset; x < 800; x += 160)
            {
                int col = (x + offset) / 160;
                bg.setColor(woods[(row * 3 + col * 5) % 4]);
                bg.fillRect(x, y, 160, 40);

                bg.setColor(grain);
                bg.drawLine(x + 6, y + 13, x + 150, y + 13);
                bg.drawLine(x + 20, y + 27, x + 140, y + 27);

                bg.setColor(seam);
                bg.drawLine(x, y, x + 159, y);
                bg.drawLine(x, y, x, y + 39);
            }
        }
        setBackground(bg);
    }

    private void prepare()
    {
        // Outer walls
        addWall(400, 10, 800, 20);
        addWall(400, 590, 800, 20);
        addWall(10, 300, 20, 600);
        addWall(790, 300, 20, 600);

        // Desks (style, x, y, width, height)
        addFurniture("desk", 200, 140, 180, 50);
        addFurniture("desk", 520, 140, 180, 50);
        addFurniture("desk", 690, 230, 50, 180);
        addFurniture("desk", 200, 310, 180, 50);
        addFurniture("desk", 500, 310, 180, 50);
        addFurniture("desk", 200, 490, 180, 50);
        addFurniture("desk", 560, 490, 180, 50);

        // Chairs
        addFurniture("chair", 200, 190, 30, 30);
        addFurniture("chair", 520, 190, 30, 30);
        addFurniture("chair", 200, 360, 30, 30);
        addFurniture("chair", 500, 360, 30, 30);
        addFurniture("chair", 200, 540, 30, 30);
        addFurniture("chair", 560, 540, 30, 30);

        // Filing cabinet and plants
        addFurniture("cabinet", 360, 235, 40, 60);
        addFurniture("plant", 55, 545, 40, 40);
        addFurniture("plant", 750, 545, 40, 40);

        // Collectibles
        addObject(new Collectible("coffee"), 60, 300);
        addObject(new Collectible("badge"), 360, 90);
        addObject(new Collectible("document"), 740, 100);
        addObject(new Collectible("keys"), 380, 420);
        addObject(new Collectible("drink"), 720, 480);

        addObject(new Alien(), 60, 100);
        updateScore(0);
    }

    private void addWall(int x, int y, int width, int height)
    {
        addObject(new Wall(width, height), x, y);
    }

    private void addFurniture(String style, int x, int y, int width, int height)
    {
        addObject(new Wall(style, width, height), x, y);
    }

    public void updateScore(int count)
    {
        showText("Items: " + count, 80, 40);
    }

    public void showWin()
    {
        removeObjects(getObjects(null));
        showText(null, 80, 40);

        GreenfootImage bg = new GreenfootImage(800, 600);
        bg.setColor(new Color(35, 48, 70));
        bg.fill();
        setBackground(bg);

        setPaintOrder(WinBanner.class, Confetti.class);

        for (int i = 0; i < 90; i++)
        {
            addObject(new Confetti(),
                      Greenfoot.getRandomNumber(800),
                      Greenfoot.getRandomNumber(600));
        }

        addObject(new WinBanner(), 400, 300);
    }
}