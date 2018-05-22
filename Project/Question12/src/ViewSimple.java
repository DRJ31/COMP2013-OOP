import javax.swing.*;
import java.awt.*;

public class ViewSimple extends View {
    ControllerSimple c;
    JLabel label;

    public ViewSimple(Bank m, ControllerSimple c) {
        super(m);
        this.c = c;
        label = new JLabel("0", JLabel.CENTER);
        this.add(label);
        this.setSize(400, 300);
        this.setTitle("Total Money");
        this.setLocationRelativeTo(null);
        label.setText(Integer.toString(m.totalMoney()));
        this.setVisible(true);
    }

    @Override
    public void update() {
        label.setText(Integer.toString(m.totalMoney()));
    }
}
