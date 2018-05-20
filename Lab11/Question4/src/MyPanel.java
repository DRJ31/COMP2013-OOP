import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class MyPanel extends JPanel {
    private ArrayList<Point> points;

    public MyPanel() {
        super();
        points = new ArrayList<Point>();
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    Point p = new Point(e.getX(), e.getY());
                    points.add(p);
                    System.out.printf("X: %d Y: %d\n", p.x, p.y);
                    repaint();
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        for (int i = 0; i < points.size(); i++) {
            g.drawRect(points.get(i).x, points.get(i).y, 1, 1);
            if (i > 0) {
                g.drawLine(points.get(i).x, points.get(i).y, points.get(i - 1).x, points.get(i - 1).y);
            }
        }
    }
}
