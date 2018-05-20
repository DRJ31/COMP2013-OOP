import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseAdapter extends MouseAdapter {
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1)
            System.out.println("Left button was clicked.");
        else
            System.out.println(e.getButton());
        System.out.printf("X: %d Y: %d\n", e.getX(), e.getY());
    }
}
