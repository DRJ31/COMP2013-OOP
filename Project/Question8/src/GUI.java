import javax.swing.*;

public class GUI {
    public static void main(String[] args) {
        Bank bank = new Bank("UIC Bank");
        ControllerSimple c = new ControllerSimple(bank);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ViewSimple view1 = new ViewSimple(bank, c);
                bank.addListener(view1);
            }
        });
    }
}
