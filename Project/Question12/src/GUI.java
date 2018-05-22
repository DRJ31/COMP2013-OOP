import javax.swing.*;

public class GUI {
    public static void main(String[] args) {
        Bank bank = new Bank("UIC Bank");
        ControllerSimple c1 = new ControllerSimple(bank);
        ControllerGetMoney c2 = new ControllerGetMoney(bank);
        ControllerWithdraw c3 = new ControllerWithdraw(bank);
        ControllerCreate c4 = new ControllerCreate(bank);
        ControllerHistory c5 = new ControllerHistory(bank);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ViewSimple simple = new ViewSimple(bank, c1);
                ViewGetMoney getMoney = new ViewGetMoney(bank, c2);
                ViewWithdraw withdraw = new ViewWithdraw(bank, c3);
                ViewCreate create = new ViewCreate(bank, c4);
                ViewHistory history = new ViewHistory(bank, c5);
                bank.addListener(simple);
                bank.addListener(history);
            }
        });
    }
}
