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

    private CLOUDS cloud;

    private BACK back;

    private SHIP ship;

    public DrawPanel(final int width, final int height, final int timerDelay) {
        this.PANEL_WIDTH = width;
        this.PANEL_HEIGHT = height;
        this.TIMER_DELAY = timerDelay;
        timer = new Timer(timerDelay, this);
        timer.start();

        this.cloud = new CLOUDS(ticksFromStart1, 100, 200, 260, Color.RED);
        this.vaz = new VAZ2107(ticksFromStart2, 800, 200, 260, Color.RED);
        this.back = new BACK(ticksFromStart2, 800, 200, 260, Color.RED);
        this.ship = new SHIP(ticksFromStart3 , 295, 200, 260, Color.RED);
    }

    @Override
    public void paint(final Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //скорость движения

        back.setX(ticksFromStart2 * 0);
        back.draw(gr);

        vaz.setX(ticksFromStart2 * 5);
        vaz.draw(gr);

        ship.setX(ticksFromStart3 * 3);
        ship.draw(gr);

        cloud.setX(ticksFromStart1 * 2);
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
