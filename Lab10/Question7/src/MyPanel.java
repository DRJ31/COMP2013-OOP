import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    public MyPanel(LayoutManager layout) {
        super(layout);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Color red = new Color(220, 53, 69);
        Color blue = new Color(0, 123, 255);
        //Draw cube
        g.setColor(red);
        g.drawRect(30, 10, 50, 50);
        g.drawRect(10, 20, 50, 50);
        g.drawLine(30, 10, 10, 20);
        g.drawLine(80, 10, 60, 20);
        g.drawLine(30, 60, 10, 70);
        g.drawLine(80, 60, 60, 70);
        //Draw cylinder
        g.setColor(blue);
        g.drawOval(100, 10, 50, 10);
        g.drawOval(100, 60, 50, 10);
        g.drawLine(100, 15, 100, 65);
        g.drawLine(150, 15, 150, 65);
    }
}
