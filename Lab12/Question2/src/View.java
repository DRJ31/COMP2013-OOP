import javax.swing.*;

abstract class View extends JFrame implements ModelListener {
    protected Model m;

    public View(Model m) {
        this.m = m;
    }

    public abstract void update();
}
