package ru.vsu.cs.lobtsov_d_a.kg.task_1;

import java.awt.*;


public class Cloud {

    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public Cloud(final int x, final int y, final int width, final int height) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


    void draw(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;

        //облака

        for(int i=0; i < 5; this.x=this.x-900,i++) {

            g.setColor(new Color(236, 232, 232));
            g.fillOval((int) (this.x + 1100), (int) (this.y - 50), (210), (80));
            g.setColor(new Color(0, 0, 0));
            g.drawOval((int) (this.x + 1100), (int) (this.y - 50), (210), (80));

            g.setColor(new Color(236, 232, 232));
            g.fillOval((int) (this.x + 1400), (int) (this.y - 40), (180), (70));
            g.setColor(new Color(0, 0, 0));
            g.drawOval((int) (this.x + 1400), (int) (this.y - 40), (180), (70));

            g.setColor(new Color(236, 232, 232));
            g.fillOval((int) (this.x + 1290), (int) (this.y - 20), (160), (60));
            g.setColor(new Color(0, 0, 0));
            g.drawOval((int) (this.x + 1290), (int) (this.y - 20), (160), (60));
        }
    }
}
