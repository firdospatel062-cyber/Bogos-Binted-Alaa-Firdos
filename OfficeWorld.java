import greenfoot.*;

public class OfficeWorld extends World
{
    private boolean started = false;

    public OfficeWorld()
    {
        super(800, 600, 1);
        showTitle();
    }

    public void act()
    {
        if (!started && Greenfoot.isKeyDown("space"))
        {
            startGame();
        }
    }

    private void showTitle()
    {
        Color navy = new Color(35, 48, 70);
        GreenfootImage bg = getBackground();
        bg.setColor(navy);
        bg.fill();

        GreenfootImage title = new GreenfootImage("BOGOS BINTED", 70, Color.WHITE, navy);
        bg.drawImage(title, 150, 180);

        GreenfootImage info = new GreenfootImage("Click Run, then press SPACE to start", 30, Color.YELLOW, navy);
        bg.drawImage(info, 160, 340);
    }

    private void startGame()
    {
        started = true;

        drawFloor();
        buildWalls();
        buildBreakRoom();
        buildMeetingRoom();
        buildPrinterRoom();
        buildSecurity();
        buildWorkspace();
        buildCoworkerOffice();
        placeItems();

        // Player
        addObject(new Alien(), 60, 400);

        showText("Items: 0 / 4", 80, 40);
        showText("Collect coffee, badge, documents, photos", 400, 40);
    }


    private void drawFloor()
    {
        GreenfootImage floor = getBackground();

        Color concrete = new Color(205, 208, 210);
        Color cream = new Color(248, 240, 222);
        Color sage = new Color(176, 200, 176);
        Color sand = new Color(232, 222, 200);
        Color beige = new Color(228, 212, 185);
        Color steel = new Color(200, 208, 215);
        Color woodFloor = new Color(205, 170, 125);

        // Corridor and everything else
        floor.setColor(concrete);
        floor.fill();

        // Room floors (x, y, width, height)
        paint(floor, 20, 20, 240, 220, cream);
        paint(floor, 280, 20, 240, 220, sage);
        paint(floor, 540, 20, 240, 220, sand);
        paint(floor, 20, 360, 270, 220, beige);
        paint(floor, 310, 360, 240, 220, steel);
        paint(floor, 570, 360, 210, 220, woodFloor);

        // Glowing green strip down the corridor
        floor.setColor(new Color(120, 235, 170));
        floor.fillRect(30, 298, 740, 4);

        // Glowing landing pad where the alien starts
        floor.setColor(new Color(150, 190, 165));
        floor.fillOval(26, 366, 68, 68);
        floor.setColor(new Color(90, 230, 140));
        floor.drawOval(26, 366, 67, 67);
        floor.drawOval(34, 374, 51, 51);

        // Room names
        label(floor, "BREAK ROOM", 100, 216, cream);
        label(floor, "MEETING ROOM", 350, 216, sage);
        label(floor, "PRINTER ROOM", 600, 216, sand);
        label(floor, "WORKSPACE", 110, 366, beige);
        label(floor, "SECURITY", 395, 366, steel);
        label(floor, "COWORKER'S OFFICE", 605, 366, woodFloor);
    }

    private void paint(GreenfootImage floor, int x, int y, int w, int h, Color color)
    {
        floor.setColor(color);
        floor.fillRect(x, y, w, h);
    }

    private void label(GreenfootImage floor, String text, int x, int y, Color roomColor)
    {
        GreenfootImage words = new GreenfootImage(text, 16, new Color(90, 90, 90), roomColor);
        floor.drawImage(words, x, y);
    }


    private void buildWalls()
    {
        Color wall = new Color(62, 66, 74);

        // Outer walls
        addWall(400, 10, 800, 20, wall);
        addWall(400, 590, 800, 20, wall);
        addWall(10, 300, 20, 600, wall);
        addWall(790, 300, 20, 600, wall);

        // Wall between the top rooms and the corridor (doorways left open)
        addWall(65, 250, 90, 20, wall);
        addWall(275, 250, 170, 20, wall);
        addWall(535, 250, 190, 20, wall);
        addWall(740, 250, 80, 20, wall);

        // Wall between the corridor and the bottom rooms (doorways left open)
        addWall(70, 350, 100, 20, wall);
        addWall(290, 350, 180, 20, wall);
        addWall(540, 350, 160, 20, wall);
        addWall(740, 350, 80, 20, wall);

        // Walls between rooms
        addWall(270, 130, 20, 220, wall);
        addWall(530, 130, 20, 220, wall);
        addWall(300, 470, 20, 220, wall);
        addWall(560, 470, 20, 220, wall);

        // Locked door to the printer room
        addObject(new Door(), 665, 250);
    }

    private void buildBreakRoom()
    {
        Color wood = new Color(130, 90, 55);
        Color metal = new Color(150, 158, 166);
        Color dark = new Color(45, 50, 60);
        Color glow = new Color(90, 230, 140);

        addWall(45, 110, 40, 60, metal);   // fridge
        addWall(70, 170, 60, 50, wood);    // table
        addWall(190, 45, 120, 40, wood);   // counter
        addWall(150, 45, 24, 30, dark);    // coffee machine
        addWall(150, 35, 6, 6, glow);      // machine light
    }

    private void buildMeetingRoom()
    {
        Color wood = new Color(130, 90, 55);

        addWall(400, 100, 160, 70, wood);  // conference table
        addObject(new Chair(), 340, 160);
        addObject(new Chair(), 460, 160);
        addObject(new Chair(), 300, 100);
        addObject(new Chair(), 500, 100);
    }

    private void buildPrinterRoom()
    {
        Color metal = new Color(150, 158, 166);
        Color paper = new Color(240, 240, 235);
        Color glow = new Color(90, 230, 140);

        addWall(720, 70, 80, 50, metal);   // printer
        addWall(720, 52, 40, 6, glow);     // printer screen
        addWall(590, 60, 40, 30, paper);   // paper tray
    }

    private void buildSecurity()
    {
        Color metal = new Color(150, 158, 166);
        Color glow = new Color(90, 230, 140);

        addWall(430, 460, 120, 40, metal); // security desk
        addWall(430, 448, 24, 8, glow);    // scanner light
        addObject(new Plant(), 525, 400);
    }

    private void buildWorkspace()
    {
        addObject(new Desk(), 150, 540);
        addObject(new Chair(), 150, 490);
        addObject(new Plant(), 265, 555);
    }

    private void buildCoworkerOffice()
    {
        addObject(new Desk(), 680, 540);
        addObject(new Coworker(), 690, 490);
        addObject(new Plant(), 590, 420);
    }


    private void placeItems()
    {
        addObject(new Coffee(), 215, 150);    // break room
        addObject(new Document(), 305, 215);  // meeting room
        addObject(new Badge(), 430, 540);     // security
        addObject(new Photo(), 740, 190);     // printer room (locked)
        addObject(new Keys(), 255, 440);      // workspace
    }

    // Adds a solid block (wall, furniture...) to the world
    private void addWall(int x, int y, int width, int height, Color color)
    {
        addObject(new Wall(width, height, color), x, y);
    }
}