import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ViewWithdraw extends View {
    private ControllerWithdraw c;
    private JTextField t1;
    private JTextField t2;

    public ViewWithdraw(Bank m, ControllerWithdraw c) {
        super(m);
        this.c = c;
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        //Set UI to fit system
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        this.setSize(400, 300);
        JLabel l1 = new JLabel("Name: ");
        JLabel l2 = new JLabel("Amount: ");
        JPanel jp1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel jp2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton b = new JButton("Withdraw");
        b.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String msg = c.withdraw(t1.getText(), t2.getText()); //Get message from controller
                if (msg.length() > 0)
                    JOptionPane.showMessageDialog(null, msg);
            }
        });
        jp1.add(l1);
        jp1.add(t1);
        jp2.add(l2);
        jp2.add(t2);
        this.setLayout(new GridLayout(3, 1));
        this.add(jp1);
        this.add(jp2);
        this.add(b);
        this.setTitle("Withdraw");
        this.setVisible(true);
    }

    @Override
    public void update() {

    }
}
