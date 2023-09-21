package ru.vsu.cs.lobtsov_d_a.kg.task_1;

import java.awt.*;


public class Pillar {

    private int x;
    private int y;
    public Pillar(final int x, final int y, final int width, final int height) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    void draw(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;

        //столбик

        for(int x=0, i=0; i < 40; x=x+100, i++) {
            g.setColor(new Color(40, 40, 40));
            g.fillRect(x, 950, 10, 35);
            g.setColor(new Color(255, 0, 0));
            g.fillRect(x+3, 952, 5, 3);
            g.setColor(new Color(0, 0, 0));
            g.drawRect(x, 950, 10, 35);
            i++;
        }
    }
}
