public class Start {
    public static void main(String[] args) {
        Model m = new Model();
        ControllerClicks clicks = new ControllerClicks(m);
        Controller c = new Controller(m);
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MyFrame frame = new MyFrame(m, clicks);
                ViewNumber number = new ViewNumber(m, c);
                m.addListener(frame);
                m.addListener(number);
            }
        });
    }
}