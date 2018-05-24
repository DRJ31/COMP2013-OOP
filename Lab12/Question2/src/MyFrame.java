import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFrame extends View {
    private ControllerClicks c;

    public MyFrame(Model m, ControllerClicks c) {
        super(m);
        this.c = c;
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        this.setTitle("MyFrame Title");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        //The panel which show the drawing
        MyPanel centerPanel = new MyPanel(m, c);
        this.add(centerPanel, BorderLayout.CENTER);
        //The panel which contain buttons
        JPanel topPanel = new JPanel();
        this.add(topPanel, BorderLayout.PAGE_START);
        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        //Reset button
        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.resetClicked();
            }
        });
        topPanel.add(resetButton);

        //Undo button
        JButton undoButton = new JButton("Undo");
        undoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.undoClicked();
            }
        });
        topPanel.add(undoButton);
        this.setVisible(true);
    }

    @Override
    public void update() {
        repaint();
    }
}
