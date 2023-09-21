package ru.vsu.cs.lobtsov_d_a.kg.task_1;

import java.awt.*;


public class Tablet {

    private int x;
    private int y;
    public Tablet(final int x, final int y, final int width, final int height) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    void draw(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;

        //табличка
        for(int x=100, i=0; i<6; x=x+700, i++) {
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
    }
}
