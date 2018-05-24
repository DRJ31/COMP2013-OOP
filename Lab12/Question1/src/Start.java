public class Start {
    public static void main(String[] args) {
        Model m = new Model();
        ControllerClicks clicks = new ControllerClicks(m);
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MyFrame frame = new MyFrame(m, clicks);
                m.addListener(frame);
            }
        });
    }
}