import javax.swing.*;

class MyThread implements Runnable {
    @Override
    public void run() {
        new MyFrame();
    }
}

public class Start {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        SwingUtilities.invokeLater(t);
    }
}
