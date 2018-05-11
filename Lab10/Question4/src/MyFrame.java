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
//        GridLayout g1 = new GridLayout(0, 0);
//        FlowLayout f1 = new FlowLayout(FlowLayout.LEFT, 20, 40);
        BorderLayout b1 = new BorderLayout();
        this.setLayout(b1);
        //The program didn't use the number of rows that I specified
        //The layout didn't change even if I resize the frame with mouse
        //When set the number to 0, the program threw Illegal Argument Exception
        JLabel l = new JLabel("Enter your name: ");
        JTextField tx = new JTextField("Type Text Here");
        JCheckBox cb = new JCheckBox("I agree");
        JRadioButton rb = new JRadioButton("Yes");
        JComboBox<String> cb1 = new JComboBox<String>(new String[]{"Red", "Green", "Blue"});
        JComboBox<Integer> cb2 = new JComboBox<Integer>(new Integer[]{2, 7, -3, 24});
        //When we resize the window, the components will automatically change its position.
        this.add(l, BorderLayout.PAGE_START);
        this.add(tx, BorderLayout.CENTER);
        this.add(cb, BorderLayout.LINE_START);
        this.add(rb, BorderLayout.PAGE_END);
        this.add(cb1, BorderLayout.LINE_END);
//        this.add(cb2, BorderLayout.LINE_END);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        //When add more than one component to one of the five areas, it will be covered by the last added component
        //When one of the five areas does not contain any component, others will not be affected
    }
}
