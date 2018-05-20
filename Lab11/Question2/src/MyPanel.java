import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyPanel extends JPanel {
    private int x;
    private int y;

    public MyPanel() {
        super();
        x = -1;
        y = -1;
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    x = e.getX();
                    y = e.getY();
                    System.out.printf("X: %d Y: %d\n", x, y);
                    repaint();
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.drawRect(this.x, this.y, 1,1);
    }
}
