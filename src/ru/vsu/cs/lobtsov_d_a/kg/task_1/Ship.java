package ru.vsu.cs.lobtsov_d_a.kg.task_1;

import java.awt.*;


public class Ship {
    private String name = "Кот";

    private int x;
    private int y;
    public Ship(final int x, final int y, final int width, final int height) {
        this.x = x;
        this.y = y;

    }

    public void setX(int x) {
        this.x = x;
    }

    void draw(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;

        //корпус

        g.setColor(new Color(207, 208, 207));
        g.fillRect((int)(this.x + 1760), (int)(this.y - 30), (8), (30));
        g.setColor(new Color(0, 0, 0));
        g.drawRect((int)(this.x + 1760), (int)(this.y - 30), (8), (30));

        g.setColor(new Color(207, 208, 207));
        g.fillRect((int)(this.x + 1700), (int)(this.y), (80), (20));
        g.setColor(new Color(0, 0, 0));
        g.drawRect((int)(this.x + 1700), (int)(this.y), (80), (20));

        g.setColor(new Color(207, 208, 207));
        g.fillRect((int)(this.x + 1725), (int)(this.y - 15), (50), (15));
        g.setColor(new Color(0, 0, 0));
        g.drawRect((int)(this.x + 1725), (int)(this.y - 15), (50), (15));

        g.setColor(new Color(207, 208, 207));
        g.fillPolygon(new int[] {this.x + 1680 , this.x + 1700 , this.x +1700}, new int[] {this.y ,this.y,this.y +20 }, 3);
        g.setColor(new Color(0, 0, 0));
        g.drawPolygon(new int[] {this.x + 1680 , this.x + 1700 , this.x +1700}, new int[] {this.y ,this.y,this.y +20 }, 3);
        g.setColor(new Color(207, 208, 207));
        g.fillPolygon(new int[] {this.x + 1681 , this.x + 1701 , this.x +1701}, new int[] {this.y+1 ,this.y+1,this.y +19 }, 3);

        //обвес

        g.setColor(new Color(0, 0, 0));
        g.fillOval((this.x + 1735), (int)(this.y-11), 7,7);
        g.fillOval((this.x + 1745), (int)(this.y-11), 7,7);
        g.fillOval((this.x + 1755), (int)(this.y-11), 7,7);

        g.setColor(new Color(192, 4, 4));
        g.fillOval((this.x + 1710), (int)(this.y+5), 7,7);

        g.setFont(new Font("Судно",Font.PLAIN, 8));
        g.drawString(this.name,(this.x + 1740), (int)(this.y+10));
    }
}
