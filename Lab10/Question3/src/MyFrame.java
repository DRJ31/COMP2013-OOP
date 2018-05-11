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
        FlowLayout f1 = new FlowLayout(FlowLayout.LEFT, 20, 40);
        this.setLayout(f1);
        JButton btn1 = new JButton("Cancel");
        JButton btn2 = new JButton("Accept");
        JLabel l = new JLabel("Enter your name: ");
        JTextField tx = new JTextField("Type Text Here");
        JCheckBox cb = new JCheckBox("I agree");
        JRadioButton rb = new JRadioButton("Yes");
        JComboBox<String> cb1 = new JComboBox<String>(new String[]{"Red", "Green", "Blue"});
        JComboBox<Integer> cb2 = new JComboBox<Integer>(new Integer[]{2, 7, -3, 24});
        //When we resize the window, the components will automatically change its position.
        this.add(l);
        this.add(btn1);
        this.add(btn2);
        this.add(tx);
        this.add(cb);
        this.add(rb);
        this.add(cb1);
        this.add(cb2);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
