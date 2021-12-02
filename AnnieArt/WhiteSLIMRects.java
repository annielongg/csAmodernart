package AnnieArt;

import java.awt.*;

public class WhiteSLIMRects {
    private int rectX, rectY, rectW, rectH;

    public WhiteSLIMRects(int rectX, int rectY, int rectW) {
        this.rectX = rectX;
        this.rectY = rectY;
        this.rectW = rectW;
        rectH = rectW;
    }


//    public void randomShifts(Graphics2D g2){
//        for (int i = 0; i < 5; i++) {
//            g2.rotate(Math.toRadians(-48+(i*10)));
//            g2.setColor(Color.white);
//            g2.fillRect(100,460,250,500);
//            g2.rotate(Math.toRadians(48));
//        }
//
//    }

    public void slimRect(Graphics2D g2, Color color) {
        int[] xCoordinates = new int[4];
        int[] yCoordinates = new int[4];
        xCoordinates[0] = rectX;
        xCoordinates[1] = rectX + rectW;
        xCoordinates[2] = rectX;
        xCoordinates[3] = rectX - rectW;

        yCoordinates[0] = rectY + rectH;
        yCoordinates[1] = rectY;
        yCoordinates[2] = rectY - rectH;
        yCoordinates[3] = rectY;

        g2.setColor(color);
        g2.fillPolygon(xCoordinates, yCoordinates, 4);

    }

}