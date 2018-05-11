import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        //If the constructor doesn't have setTitle, the title of frame would be empty
        this.setTitle("MyFrame");
        //If comment out the setSize, the size of frame would be too small
        this.setSize(400, 300);
        //If comment setDefaultCloseOperation, the program will still running even if we click close button
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        //The frame will go to the middle of screen
        this.setVisible(true);
    }
}
