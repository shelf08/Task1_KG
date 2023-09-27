package ru.vsu.cs.lobtsov_d_a.kg.task_1;

import java.awt.*;


public class Back {


    private int x;
    private int y;
    private int width;
    private int height;

    private Stone[] stones = new Stone[250];

    public Back(final int x, final int y, final int width, final int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        for (int i = 0; i < stones.length; i++) {
            stones[i] = new Stone(getRandom(0,2048),getRandom(510,690));
        }
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

        for (Stone stone: stones) {
            stone.draw(gr);

        }

        //дорога
        g.setColor(new Color(66, 66, 66));
        g.fillRect(0,700,2048,900);

        g.setColor(new Color(222, 221, 221));
        g.fillRect(0,950,2048,10);
        g.setColor(new Color(222, 221, 221));
        g.fillRect(0,710,2048,5);

        for(int x=0, i=0; i<48; x=x+40) {
            g.setColor(new Color(222, 221, 221));
            g.fillRect(x, 800, 20, 5);
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
        g.drawArc(410, 520,120,260,52,45);
        g.drawArc(400, 520,120,260,92,45);
        g.drawArc(410, 520,100,260,52,45);
        g.drawArc(430, 520,70,260,92,45);
        g.drawArc(440, 520,40,280,52,45);

        //пальма2
        g.setColor(new Color(98, 39, 3));
        g.fillRect(1750,520,15,150);
        g.setColor(new Color(98, 39, 3));
        g.fillPolygon(new int[] {1765,1765,1790},new int[] {670,520,670},3);
        g.setColor(new Color(2, 98, 16));
        g.setStroke(new BasicStroke(6.0F));
        g.drawArc(1710, 520,120,260,52,45);
        g.drawArc(1700, 520,120,260,92,45);
        g.drawArc(1710, 520,100,260,52,45);
        g.drawArc(1730, 520,70,260,92,45);
        g.drawArc(1740, 520,40,280,52,45);


    }
    public static int getRandom(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}