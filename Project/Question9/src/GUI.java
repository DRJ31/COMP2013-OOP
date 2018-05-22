import javax.swing.*;

public class GUI {
    public static void main(String[] args) {
        Bank bank = new Bank("UIC Bank");
        ControllerSimple c1 = new ControllerSimple(bank);
        ControllerGetMoney c2 = new ControllerGetMoney(bank);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                bank.addAccount(new CreditAccount("Max", 1000));
                ViewSimple viewSimple = new ViewSimple(bank, c1);
                ViewGetMoney viewGetMoney = new ViewGetMoney(bank, c2);
                bank.addListener(viewSimple);
            }
        });
    }
}
