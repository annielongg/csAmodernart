package AnnieArt;// package AnnieArt;

import javax.swing.*;


import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;
import java.util.TimerTask;


public class MyPanel extends JPanel {

    public static void main(String[] args) {
        JFrame window = new JFrame("Graphics!");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        int width = 1024, height = 682;
        window.setBounds(0,0,width,height+10);
        JPanel panel = new MyPanel(width, height);

        panel.setFocusable(true);
        panel.grabFocus();
        window.add(panel);
        window.setVisible(true);


    }

    private void clicker(){
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                repaint();
                System.out.println(e.getX());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }


    public MyPanel(int width, int height) {
        setSize(width, height);
        clicker();

        Timer timer = new Timer();
        new java.util.Timer().schedule(new TimerTask(){
            @Override
            public void run() {
                System.out.println("Executed...");
                repaint();
                //your code here
                //1000*5=5000 mlsec. i.e. 5 seconds. u can change accordngly
            }
        },1000*5,1000*5);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;


//
        //background color
        Color offWhite = new Color(255,255,240);
        Color darkBlue = new Color(57,147,182);
        g2.setColor(offWhite);
        g2.fillRect(0,0,1920,1080);


        //red - laying foundation
        WhiteRects leftRed = new WhiteRects(0,200,400);
        Color red = new Color(228,30,41);
        leftRed.createRect(g2,red);

        WhiteRects lastTry = new WhiteRects(800,280,420);
        Color asianYellow = new Color(241,195,73);
        lastTry.createRect(g2,asianYellow);

        //slim white rect

        BlackCircle beneathWAboveR = new BlackCircle(330,80,270);
        beneathWAboveR.createBlackCircle(g2);

        BlackCircle onSlimRectMid = new BlackCircle(570,260,240);
        onSlimRectMid.createBlackCircle(g2);

        BlackCircle onSlimRectRight = new BlackCircle(780,430,270);
        onSlimRectRight.createBlackCircle(g2);

        WhiteRects newTest = new WhiteRects(420,0,250);
        newTest.createRect(g2,darkBlue);



        WhiteRects blueActLine = new WhiteRects(1055,120,490);
        blueActLine.createRect(g2,darkBlue);

        WhiteRects redRightUpper = new WhiteRects(1060,100,490);
        redRightUpper.createRect(g2,red);

        WhiteRects lightBlueUpper = new WhiteRects(1130,60,490);
        Color blueTwo = new Color(8,157,133);
        lightBlueUpper.createRect(g2,blueTwo);


        WhiteRects leftOffWhite = new WhiteRects(330,620,460);
        leftOffWhite.createRect(g2,darkBlue);


//        AnnieArt.WhiteRects slimRect = new AnnieArt.WhiteRects(700,400,300);
//        slimRect.uniqueRect(g2,Color.white,300);


        // black circles on the biggest blue square, and black recs that aren't on top of lighter blues
        BlackCircle mostLeft = new BlackCircle(-20,190,240);
        mostLeft.createBlackCircle(g2);

        /*forloops

         */



        //trying something new for slim white rect
//        AnnieArt.WhiteSLIMRects test = new AnnieArt.WhiteSLIMRects(600,300,200);
//        test.slimRect(g2,Color.white);

//        AnnieArt.WhiteRects testTwo = new AnnieArt.WhiteRects(350,300,200);
//        testTwo.uniqueRect(g2,Color.white,400);

        BlackCircle bigWhite = new BlackCircle(205,319,270);
        bigWhite.createBlackCircle(g2);

        WhiteRects lightBlueHalf = new WhiteRects(300,700,500);
        lightBlueHalf.createRect(g2,blueTwo);

        BlackCircle semiCirc = new BlackCircle(260,430,260);
        semiCirc.createBlackCircle(g2);

        WhiteRects smallRed = new WhiteRects(460,700,340);
        smallRed.createRect(g2,red);

        WhiteRects lightestBlue = new WhiteRects(1380,600,600);
        Color blueThree = new Color(199,229,236);
        lightestBlue.createRect(g2,blueThree);

        BlackCircle onLightBlue = new BlackCircle(875,490,240);
        onLightBlue.createBlackCircle(g2);

//        AnnieArt.WhiteRects purple = new AnnieArt.WhiteRects(500,250,400);
//        Color colorPurple = new Color(63,1,64, 120F);
//        purple.createRect(g2,colorPurple);

        //two white things on the biggest blue square


        //black circle (that looks like a semi circle)

        //red square (background color)

        // purple low opacity square


        //this had a problem running - fix it
//        PurpleRect onlyPurpRect = new PurpleRect(500,800,60,90);
//        onlyPurpRect.makePurpleRect(g2);


        //lightest blue object

        //last black circle

        //white square top

    }


    }
