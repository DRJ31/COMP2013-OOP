import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ViewCreate extends View {
    private ControllerCreate c;
    private JTextField t1;
    private JTextField t2;
    private JComboBox<String> cb;

    public ViewCreate(Bank m, ControllerCreate c) {
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
        this.setTitle("Create Account");
        this.setLayout(new GridLayout(4, 1));
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        cb = new JComboBox<String>(new String[]{"credit account", "student account"});
        JPanel jp1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel jp2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton b = new JButton("Create");
        jp1.add(new JLabel("Name: "));
        jp1.add(t1);
        jp2.add(new JLabel("Amount: "));
        jp2.add(t2);
        b.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String msg = c.create(t1.getText(), t2.getText(), cb.getSelectedIndex());
                if (msg.length() > 0)
                    JOptionPane.showMessageDialog(null, msg);
            }
        });
        this.add(jp1);
        this.add(jp2);
        this.add(cb);
        this.add(b);
        this.setVisible(true);
    }

    @Override
    public void update() {

    }
}
