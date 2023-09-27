package ru.vsu.cs.lobtsov_d_a.kg.task_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawPanel extends JPanel implements ActionListener {

    private final int PANEL_WIDTH;
    private final int PANEL_HEIGHT;
    private final int TIMER_DELAY;
    private Timer timer;

    //начальное положение
    private int ticksFromStart1 = 0;
    private int ticksFromStart2 = 0;
    private int ticksFromStart3 = 0;

    private VAZ2107 vaz;

    private Cloud cloud;

    private Back back;

    private Ship ship;

    private Tablet tablet;

    private Pillar pillar;

    public DrawPanel(final int width, final int height, final int timerDelay) {
        this.PANEL_WIDTH = width;
        this.PANEL_HEIGHT = height;
        this.TIMER_DELAY = timerDelay;
        timer = new Timer(timerDelay, this);
        timer.start();


        this.cloud = new Cloud(ticksFromStart1, 100, 200, 260);
        this.vaz = new VAZ2107(ticksFromStart2, 800, 200, 260);
        this.back = new Back(ticksFromStart2, 800, 200, 260);
        this.tablet = new Tablet(ticksFromStart2, 100, 200, 260);
        this.pillar = new Pillar(ticksFromStart2 , 295, 200, 260);
        this.ship = new Ship(ticksFromStart3 , 295, 200, 260);


    }

    @Override
    public void paint(final Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //скорость движения

        back.setX(ticksFromStart2 * 0);
        back.draw(gr);

        vaz.setX((int) (ticksFromStart2 * 1));
        vaz.draw(gr);

        ship.setX((int) (ticksFromStart3 * 0.6));
        ship.draw(gr);

        tablet.setX(ticksFromStart2 * 0);
        tablet.draw(gr);

        pillar.setX(ticksFromStart2 * 0);
        pillar.draw(gr);

        cloud.setX((int) (ticksFromStart1 * 0.4));
        cloud.draw(gr);


    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == timer) {
            repaint();
            ++ticksFromStart1;
            ++ticksFromStart2;
            --ticksFromStart3;
        }
    }
}
