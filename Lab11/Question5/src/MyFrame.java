import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
        JButton b1 = new JButton("Reset");
        JButton b2 = new JButton("Btn2");
        MyPanel mp = new MyPanel();
        jp1.add(b1);
        jp1.add(b2);
        b1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mp.clearAllPoints();
            }
        });
        this.add(jp1, BorderLayout.PAGE_START);
        this.add(mp, BorderLayout.CENTER);
        this.setVisible(true);
    }
}
