import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        //Change the UI to the same as current system
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        this.setTitle("MyFrame");
        this.setSize(400, 300);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        //Buttons
        JPanel jp1 = new JPanel(new FlowLayout());
        MyPanel mp = new MyPanel();
        JButton b1 = new JButton("Btn1");
        JButton b2 = new JButton("Btn2");
        jp1.add(b1);
        jp1.add(b2);
        this.add(jp1, BorderLayout.PAGE_START);
        this.add(mp, BorderLayout.CENTER);
        this.setVisible(true);
    }
}
