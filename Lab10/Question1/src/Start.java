import javax.swing.*;
//With 2 MyFrame object, the program will have 2 windows when running
//When we click one of the close buttons in this 2 windows, all of them will close
class MyThread implements Runnable {
    @Override
    public void run() {
        new MyFrame();
        new MyFrame();
    }
}

public class Start {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        SwingUtilities.invokeLater(m1);
    }
}
