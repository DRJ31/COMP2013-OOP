import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ViewGetMoney extends View {
     private ControllerGetMoney c;
     private JTextField t;

    public ViewGetMoney(Bank m, ControllerGetMoney c) {
        super(m);
        this.c = c;
        //Set UI to fit system
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        this.setSize(400, 300);
        this.setLayout(new GridLayout(2, 1));
        t = new JTextField();
        JButton b = new JButton("Get");
        b.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, c.getMoney(t.getText()));
            }
        });
        this.add(t);
        this.add(b);
        this.setTitle("Get Money");
        this.setVisible(true);
    }

    @Override
    public void update() {

    }
}
