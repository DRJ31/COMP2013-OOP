import javax.swing.*;

public class ViewNumber extends View {
    private Controller c;
    private JLabel label;

    public ViewNumber(Model m, Controller c) {
        super(m);
        this.c = c;
        label = new JLabel("0", JLabel.CENTER);
        this.add(label);
        this.setTitle("Number of Points");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void update() {
        label.setText(Integer.toString(m.getPoints().size()));
    }
}
