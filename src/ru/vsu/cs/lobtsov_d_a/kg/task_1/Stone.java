package ru.vsu.cs.lobtsov_d_a.kg.task_1;

import java.awt.*;

public class Stone {

    private int x;
    private int y;

    public Stone(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void draw(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setColor(new Color(100, 98, 98));
        g.fillRect(this.x ,this.y ,3 ,3);
    }
}

