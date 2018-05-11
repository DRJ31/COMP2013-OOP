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
        //Only the second button showed
        JButton btn1 = new JButton("Cancel");
        JButton btn2 = new JButton("Accept");
        this.add(btn1);
//        this.add(btn1);
        //Add the same object twice will only display it once
        this.add(btn2);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
