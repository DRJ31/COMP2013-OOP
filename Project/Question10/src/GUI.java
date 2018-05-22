import javax.swing.*;

public class GUI {
    public static void main(String[] args) {
        Bank bank = new Bank("UIC Bank");
        ControllerSimple c1 = new ControllerSimple(bank);
        ControllerGetMoney c2 = new ControllerGetMoney(bank);
        ControllerWithdraw c3 = new ControllerWithdraw(bank);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                bank.addAccount(new CreditAccount("Umi", 1000));
                try {
                    bank.addAccount(new StudentAccount("Misaka", 2000));
                }
                catch (NotEnoughMoneyException e) {
                    System.out.println(e.getMessage());
                }
                ViewSimple simple = new ViewSimple(bank, c1);
                ViewGetMoney getMoney = new ViewGetMoney(bank, c2);
                ViewWithdraw withdraw = new ViewWithdraw(bank, c3);
                bank.addListener(simple);
            }
        });
    }
}
