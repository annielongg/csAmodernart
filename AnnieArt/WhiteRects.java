package AnnieArt;

import java.awt.*;

import javax.swing.text.AttributeSet.ColorAttribute;

public class WhiteRects {
    private int rectX, rectY, rectW, rectH;

    public WhiteRects(int rectX, int rectY, int rectW) {
        this.rectX = rectX;
        this.rectY = rectY;
        this.rectW = rectW;
        rectH = rectW*3/4;
    }

    public void createRect(Graphics2D g2, Color color){
        int[] xCoordinates = new int[4];
        int[] yCoordinates = new int[4];
        xCoordinates[0] = rectX;
        xCoordinates[1] = rectX+rectW;
        xCoordinates[2] = rectX;
        xCoordinates[3] = rectX-rectW;

        yCoordinates[0] = rectY+rectH;
        yCoordinates[1] = rectY;
        yCoordinates[2] = rectY-rectH;
        yCoordinates[3] = rectY;

        g2.setColor(color);
        g2.fillPolygon(xCoordinates,yCoordinates,4);

    }

    public void uniqueRect(Graphics2D g2, Color color,int uniqueHeight){
        int[] xCoordinates = new int[4];
        int[] yCoordinates = new int[4];
        xCoordinates[0] = rectX;
        xCoordinates[1] = rectX+rectW;
        xCoordinates[2] = rectX;
        xCoordinates[3] = rectX-rectW;

        yCoordinates[0] = rectY+uniqueHeight;
        yCoordinates[1] = rectY;
        yCoordinates[2] = rectY-uniqueHeight;
        yCoordinates[3] = rectY;

        g2.setColor(color);
        g2.fillPolygon(xCoordinates,yCoordinates,4);

    }

//    public void whiteRect(Graphics2D g2){
//        g2.setColor(Color.white);
//        g2.fillOval(rectX,rectY,rectWidth,rectHeight);
    }
