import javax.swing.*;
import java.awt.*;


public class CLOUDS {

    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public CLOUDS(final int x, final int y, final int width, final int height, final Color color) {
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

        //облака
        g.setColor(new Color(236, 232, 232));
        g.fillOval((int)(this.x +100 ), (int)(this.y - 50 ), (210),(80));
        g.setColor(new Color(0, 0, 0));
        g.drawOval((int)(this.x +100 ), (int)(this.y - 50 ), (210),(80));

        g.setColor(new Color(236, 232, 232));
        g.fillOval((int)(this.x +400), (int)(this.y - 40 ), (180),(70));
        g.setColor(new Color(0, 0, 0));
        g.drawOval((int)(this.x +400), (int)(this.y - 40 ), (180),(70));

        g.setColor(new Color(236, 232, 232));
        g.fillOval((int)(this.x +290 ), (int)(this.y - 20 ), (160),(60));
        g.setColor(new Color(0, 0, 0));
        g.drawOval((int)(this.x +290 ), (int)(this.y - 20 ), (160),(60));

        g.setColor(new Color(236, 232, 232));
        g.fillOval((int)(this.x + 1100 ), (int)(this.y - 50 ), (210),(80));
        g.setColor(new Color(0, 0, 0));
        g.drawOval((int)(this.x +1100 ), (int)(this.y - 50 ), (210),(80));

        g.setColor(new Color(236, 232, 232));
        g.fillOval((int)(this.x +1400), (int)(this.y - 40 ), (180),(70));
        g.setColor(new Color(0, 0, 0));
        g.drawOval((int)(this.x +1400), (int)(this.y - 40 ), (180),(70));

        g.setColor(new Color(236, 232, 232));
        g.fillOval((int)(this.x +1290 ), (int)(this.y - 20 ), (160),(60));
        g.setColor(new Color(0, 0, 0));
        g.drawOval((int)(this.x +1290 ), (int)(this.y - 20 ), (160),(60));

        g.setColor(new Color(236, 232, 232));
        g.fillOval((int)(this.x -500 ), (int)(this.y - 50 ), (210),(80));
        g.setColor(new Color(0, 0, 0));
        g.drawOval((int)(this.x -500 ), (int)(this.y - 50 ), (210),(80));

        g.setColor(new Color(236, 232, 232));
        g.fillOval((int)(this.x -700), (int)(this.y - 40 ), (180),(70));
        g.setColor(new Color(0, 0, 0));
        g.drawOval((int)(this.x -700), (int)(this.y - 40 ), (180),(70));

        g.setColor(new Color(236, 232, 232));
        g.fillOval((int)(this.x -590 ), (int)(this.y - 20 ), (160),(60));
        g.setColor(new Color(0, 0, 0));
        g.drawOval((int)(this.x -590 ), (int)(this.y - 20 ), (160),(60));

    }
}
