import javax.swing.*;
import java.awt.*;


public class VAZ2107 {


    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public VAZ2107(final int x, final int y, final int width, final int height, final Color color) {
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

        g.setStroke(new BasicStroke(1.0F));

        //кузов
        g.setColor(new Color(1, 121, 3));
        g.fillRect((int)(this.x + 0.2 * this.width), (int)(this.y - 0.04 * this.height), (425), (80));
        g.fillRect((int)(this.x + 0.6 * this.width), (int)(this.y - 0.25 * this.height), (180), (70));

        g.setColor(new Color(12, 12, 12));
        g.fillRect((int)(this.x + 0.13 * this.width), (int)(this.y + 0.15 * this.height),30,20);

        g.setColor(new Color(12, 12, 12));
        g.fillRect((int)(this.x + 2.22 * this.width), (int)(this.y + 0.15 * this.height),30,15);


        //переднее колесо
        g.setColor(new Color(26, 25, 25));
        g.fillOval((int)(this.x + 0.5 * this.width), (int)(this.y + 0.16 * this.height), (60),(60));
        g.setColor(new Color(119, 115, 115));
        g.fillOval((int)(this.x + 0.535 * this.width), (int)(this.y + 0.185 * this.height), (45),(45));

        //заднее колесо
        g.setColor(new Color(26, 25, 25));
        g.fillOval((int)(this.x + 1.75 * this.width), (int)(this.y + 0.16 * this.height), (60),(60));
        g.setColor(new Color(119, 115, 115));
        g.fillOval((int)(this.x + 1.785 * this.width), (int)(this.y + 0.185 * this.height), (45),(45));


        //стекло1
        g.setColor(new Color(1, 121, 3));
        g.fillPolygon(new int[] {this.x + 350 , this.x + 300 , this.x +300}, new int[] {this.y-0 ,this.y -65,this.y - 0}, 3);
        g.setColor(new Color(8, 170, 211));
        g.fillPolygon(new int[] {this.x + 350 , this.x + 300 , this.x +330}, new int[] {this.y-11 ,this.y -65,this.y - 11}, 3);
        g.setColor(new Color(0, 0, 0));
        g.drawPolygon(new int[] {this.x + 350 , this.x + 300 , this.x +330}, new int[] {this.y-11 ,this.y -65,this.y - 11}, 3);

        //стекло2
        g.setColor(new Color(1, 121, 3));
        g.fillPolygon(new int[] {this.x + 90 , this.x + 120 , this.x +120}, new int[] {this.y-11 ,this.y -65,this.y - 11}, 3);
        g.setColor(new Color(8, 170, 211));
        g.fillPolygon(new int[] {this.x + 90 , this.x + 120 , this.x +105}, new int[] {this.y-11 ,this.y -65,this.y - 11}, 3);
        g.setColor(new Color(0, 0, 0));
        g.drawPolygon(new int[] {this.x + 90 , this.x + 120 , this.x +105}, new int[] {this.y-11 ,this.y -65,this.y - 11}, 3);

        //стекло3
        g.setColor(new Color(8, 170, 211));
        g.fillRect((int)(this.x + 1.09 * this.width), (int)(this.y - 0.225 * this.height),80,50);
        g.setColor(new Color(9, 8, 8));
        g.drawRect((int)(this.x + 1.09 * this.width), (int)(this.y - 0.225 * this.height),80,50);

        //стекло4
        g.setColor(new Color(8, 170, 211));
        g.fillRect((int)(this.x + 0.736 * this.width), (int)(this.y - 0.225 * this.height),60,50);
        g.setColor(new Color(0, 0, 0));
        g.drawRect((int)(this.x + 0.736 * this.width), (int)(this.y - 0.225 * this.height),60,50);

        //стекло5
        g.setColor(new Color(8, 170, 211));
        g.fillPolygon(new int[] {this.x + 132 , this.x + 142 , this.x +142}, new int[] {this.y-9 ,this.y -58,this.y - 9}, 3);
        g.setColor(new Color(0, 0, 0));
        g.drawPolygon(new int[] {this.x + 132 , this.x + 142 , this.x +142}, new int[] {this.y-9 ,this.y -58,this.y - 9}, 3);

        //стекло6
        g.setColor(new Color(8, 170, 211));
        g.fillPolygon(new int[] {this.x + 317 , this.x + 297 , this.x + 297}, new int[] {this.y-9 ,this.y -58,this.y - 9}, 3);
        g.setColor(new Color(0, 0, 0));
        g.drawPolygon(new int[] {this.x + 317 , this.x + 297 , this.x + 297}, new int[] {this.y-9 ,this.y -58,this.y - 9}, 3);

        //поворотники, фары, боковое зеркало
        g.setColor(new Color(253, 136, 3));
        g.fillRect((int)(this.x + 2.2 * this.width), (int)(this.y + 0.05 * this.height),8,6);

        g.setColor(new Color(185, 4, 4));
        g.fillRect((int)(this.x + 2.32 * this.width), (int)(this.y - 0.01 * this.height),2,15);

        g.setColor(new Color(253, 136, 3));
        g.fillRect((int)(this.x + 0.175 * this.width), (int)(this.y + 0.05 * this.height),6,8);

        g.setColor(new Color(185, 4, 4));
        g.fillRect((int)(this.x + 0.175 * this.width), (int)(this.y + 0.023 * this.height),6,8);

        g.setColor(new Color(0, 0, 0));
        g.fillOval((int)(this.x + 1.5 * this.width), (int)(this.y - 0.08 * this.height), (17),(12));

        //резинки
        g.setColor(new Color(0x030303));
        g.fillRect((int)(this.x + 142), (int)(this.y - 60), (156),(4));
        g.setColor(new Color(0x030303));
        g.fillRect((int)(this.x + 143.5), (int)(this.y - 60), (4),(53));
        g.setColor(new Color(0x030303));
        g.fillRect((int)(this.x + 210), (int)(this.y - 60), (6),(53));
        g.setColor(new Color(0x262525));
        g.fillRect((int)(this.x + 208), (int)(this.y - 56), (2),(49));
        g.setColor(new Color(0x262525));
        g.fillRect((int)(this.x + 216), (int)(this.y - 56), (2),(49));
        g.setColor(new Color(0x030303));
        g.fillRect((int)(this.x + 130), (int)(this.y - 8), (190),(3));
        g.setColor(new Color(0x030303));
        g.drawLine((int)(this.x + 130), (int)(this.y - 7),(int)(this.x + 141), (int)(this.y - 59));
        g.setColor(new Color(0x030303));
        g.drawLine((int)(this.x + 299), (int)(this.y - 59),(int)(this.x + 319), (int)(this.y - 9));
        g.setColor(new Color(0x030303));
        g.fillRect((int)(this.x + 168), (int)(this.y +60), (177),(3));

        //двери
        g.setColor(new Color(0x131313));
        g.drawLine((int)(this.x + 319), (int)(this.y - 9),(int)(this.x + 319), (int)(this.y + 58));
        g.setColor(new Color(0x131313));
        g.drawLine((int)(this.x + 319), (int)(this.y + 58),(int)(this.x + 175), (int)(this.y + 58));
        g.setColor(new Color(0x131313));
        g.drawLine((int)(this.x + 213), (int)(this.y + -7),(int)(this.x + 213), (int)(this.y + 58));
        g.setColor(new Color(0x131313));
        g.drawLine((int)(this.x + 130), (int)(this.y + -7),(int)(this.x + 130), (int)(this.y + 30));
        g.setColor(new Color(0x131313));
        g.drawArc((int)(this.x + 77), (int)(this.y +30),120,260,52,45);

        //ручки и замок
        g.setColor(new Color(0x131313));
        g.fillRect((int)(this.x + 140), (int)(this.y +5), (15),(6));
        g.setColor(new Color(0x3D3D3D));
        g.fillRect((int)(this.x + 141), (int)(this.y +6), (13),(2));
        g.setColor(new Color(0x131313));
        g.fillRect((int)(this.x + 223), (int)(this.y +5), (15),(6));
        g.setColor(new Color(0x3D3D3D));
        g.fillRect((int)(this.x + 224), (int)(this.y +6), (13),(2));

        g.setColor(new Color(0x252525));
        g.fillRect((int)(this.x + 223), (int)(this.y +15), (3),(3));
    }
}

