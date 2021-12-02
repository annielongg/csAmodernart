package AnnieArt;

import java.awt.*;

public class BlackCircle {
    private int bCircleX, bCircleY, bCircleWidth;
            private double bCircleHeight;

    public int Color; java.awt.Color getRandomColor(){
        int red = 8;
        int green = 157;
        int blue = 133;

        int alpha = (int)(Math.random()*256);

        if(alpha % 3 ==0){
            return new Color(255,255,255);
        }else{
            return new Color(red, green, blue, alpha);
        }

    }

    public BlackCircle(int bCircleX, int bCircleY, int bCircleWidth) {
        this.bCircleX = bCircleX;
        this.bCircleY = bCircleY;
        this.bCircleWidth = bCircleWidth;
        bCircleHeight = bCircleWidth * 0.854;
    }

    public void createBlackCircle(Graphics2D g2){
        g2.setColor(getRandomColor());
        g2.fillOval(bCircleX,bCircleY,bCircleWidth, (int) bCircleHeight);
    }

    public void createStrictBlackCircle(Graphics2D g2){
        Color black = new Color(48,39,50);
        g2.setColor(black);
        g2.fillOval(bCircleX,bCircleY,bCircleWidth, (int) bCircleHeight);
    }



}
