import javax.swing.*;
import java.awt.*;


public class BACK{

    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public BACK(final int x, final int y, final int width, final int height, final Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    void draw(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;

        //небо
        g.setColor(new Color(2, 186, 255));
        g.fillRect(0,0,2048,300);

        //вода
        g.setColor(new Color(4, 72, 138));
        g.fillRect(0,300,2048,300);

        //пляж
        g.setColor(new Color(245, 189, 5));
        g.fillRect(0,500,2048,200);

        for(int x=0, i=0; i<500; x=x+140) {
            g.setColor(new Color(141, 141, 141));
            g.fillRect(x+40, 520, 2, 2);
            g.setColor(new Color(141, 141, 141));
            g.fillRect(x, 600, 3, 3);

            g.setColor(new Color(141, 141, 141));
            g.fillRect(x+80, 680, 4, 4);
            i++;
        }


        //дорога
        g.setColor(new Color(66, 66, 66));
        g.fillRect(0,700,2048,900);

        g.setColor(new Color(222, 221, 221));
        g.fillRect(0,950,2048,10);
        g.setColor(new Color(222, 221, 221));
        g.fillRect(0,710,2048,5);

        for(int x=0, i=0; i<500; x=x+40) {
            g.setColor(new Color(222, 221, 221));
            g.fillRect(x, 800, 20, 5);
            i++;
        }
        for(int x=0, i=0; i<500; x=x+100) {
            g.setColor(new Color(40, 40, 40));
            g.fillRect(x, 950, 10, 35);
            g.setColor(new Color(255, 0, 0));
            g.fillRect(x+3, 952, 5, 3);
            g.setColor(new Color(0, 0, 0));
            g.drawRect(x, 950, 10, 35);
            i++;
        }

        //табличка
        for(int x=100, i=0; i<500; x=x+700) {
            g.setColor(new Color(141, 65, 24));
            g.fillRect(x, 670, 7, 35);
            g.setColor(new Color(0, 0, 0));
            g.drawRect(x, 670, 7, 35);
            g.setColor(new Color(141, 65, 24));
            g.fillRect(x-29, 635, 62, 35);
            g.setColor(new Color(0, 0, 0));
            g.drawRect(x-29, 635, 62, 35);
            g.setFont(new Font("Times",Font.PLAIN, 11));
            g.drawString("  Купание",x-26, 648);
            g.setFont(new Font("Times",Font.PLAIN, 11));
            g.drawString("запрещено!",x-26, 660);
            i++;
        }

        //пирс

        g.setColor(new Color(98, 39, 3));
        g.fillRect(1137,440,8,40);
        g.setColor(new Color(0, 0, 0));
        g.drawRect(1137,440,8,40);

        g.setColor(new Color(98, 39, 3));
        g.fillRect(1100,420,30,80);
        g.setColor(new Color(0, 0, 0));
        g.drawRect(1100,420,30,80);

        g.setColor(new Color(98, 39, 3));
        g.fillPolygon(new int[] {1100,1100,1080},new int[] {500,420,500},3);
        g.setColor(new Color(0, 0, 0));
        g.drawPolygon(new int[] {1100,1100,1080},new int[] {500,420,500},3);
        g.setColor(new Color(98, 39, 3));
        g.fillPolygon(new int[] {1101,1101,1081},new int[] {499,421,499},3);

        g.setColor(new Color(98, 39, 3));
        g.fillPolygon(new int[] {1130,1130,1150},new int[] {420,500,420},3);
        g.setColor(new Color(0, 0, 0));
        g.drawPolygon(new int[] {1130,1130,1150},new int[] {420,500,420},3);
        g.setColor(new Color(98, 39, 3));
        g.fillPolygon(new int[] {1129,1129,1149},new int[] {421,499,421},3);

        g.setColor(new Color(0, 0, 0));
        g.drawLine(1090,500,1110,420);
        g.drawLine(1100,500,1120,420);
        g.drawLine(1110,500,1130,420);
        g.drawLine(1120,500,1140,420);

        //солнце
        g.setColor(new Color(255, 173, 0));
        g.fillOval(-100,-100,200,200);

        //пальма1
        g.setColor(new Color(98, 39, 3));
        g.fillRect(450,520,15,150);
        g.setColor(new Color(98, 39, 3));
        g.fillPolygon(new int[] {465,465,490},new int[] {670,520,670},3);
        g.setColor(new Color(2, 98, 16));
        g.setStroke(new BasicStroke(6.0F));
        g.drawLine(460,520,400,550);
        g.drawLine(460,520,510,560);
        g.drawLine(460,520,520,515);
        g.drawLine(460,520,445,580);
        g.drawLine(455,520,410,490);
        g.drawLine(460,520,490,470);

        //пальма2
        g.setColor(new Color(98, 39, 3));
        g.fillRect(1750,520,15,150);
        g.setColor(new Color(98, 39, 3));
        g.fillPolygon(new int[] {1765,1765,1790},new int[] {670,520,670},3);
        g.setColor(new Color(2, 98, 16));
        g.setStroke(new BasicStroke(6.0F));
        g.drawLine(1760,520,1700,550);
        g.drawLine(1760,520,1810,560);
        g.drawLine(1760,520,1820,515);
        g.drawLine(1760,520,1745,580);
        g.drawLine(1755,520,1710,490);
        g.drawLine(1760,520,1790,470);
    }
}