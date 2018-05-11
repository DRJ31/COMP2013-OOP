import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        //Set style to fit current system
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //If the constructor doesn't have setTitle, the title of frame would be empty
        this.setTitle("MyFrame");
        //If comment out the setSize, the size of frame would be too small
        this.setSize(400, 300);
        //If comment setDefaultCloseOperation, the program will still running even if we click close button
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JButton btn1 = new JButton("Cancel");
        JButton btn2 = new JButton("Accept");
        JLabel l = new JLabel("Enter your name: ");
        JTextField tx = new JTextField("Type Text Here");
        JCheckBox cb = new JCheckBox("I agree");
        JRadioButton rb = new JRadioButton("Yes");
        JComboBox<String> cb1 = new JComboBox<String>(new String[]{"Red", "Green", "Blue"});
        JComboBox<Integer> cb2 = new JComboBox<Integer>(new Integer[]{2, 7, -3, 24});
        this.setLayout(new BorderLayout());
        this.add(p1, BorderLayout.PAGE_START);
        this.add(p2, BorderLayout.CENTER);
        this.add(p3, BorderLayout.PAGE_END);
        p1.setLayout(new BorderLayout());
        p1.add(btn1, BorderLayout.LINE_START);
        p1.add(btn2, BorderLayout.LINE_END);
        p2.setLayout(new FlowLayout(FlowLayout.CENTER));
        p2.add(l);
        p2.add(tx);
        p3.setLayout(new GridLayout(2,2));
        p3.add(cb1);
        p3.add(cb2);
        p3.add(cb);
        p3.add(rb);
        p1.setBackground(new Color(0, 123, 255));
        p2.setBackground(new Color(30, 126, 52));
        p3.setBackground(new Color(189, 33, 48));
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
