import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<IAccount> accounts;
    private ArrayList<ModelListener> modelListeners;
    private ArrayList<Integer> history;

    public Bank(String name) {
        this.name = name;
        accounts = new ArrayList<IAccount>();
        modelListeners = new ArrayList<ModelListener>();
        history = new ArrayList<Integer>();
        history.add(0);
    }

    private void notifyListeners() {
        for (ModelListener ml : modelListeners) {
            ml.update();
        }
    }

    public void addListener(ModelListener modelListener) {
        modelListeners.add(modelListener);
    }

    public void addAccount(IAccount account) {
        accounts.add(account);
        history.add(totalMoney());
        notifyListeners();
    }

    public int totalMoney() {
        int total = 0;
        for (IAccount account : accounts) {
            total += account.getMoney();
        }
        return total;
    }

    public int getMoney(String name) throws UnknownCustomerException {
        for (IAccount account : accounts) {
            if (account.getName().equals(name)) {
                return account.getMoney();
            }
        }
        throw new UnknownCustomerException(name);
    }

    public void withdraw(String name, int amount) throws UnknownCustomerException, NotEnoughMoneyException {
        for (IAccount account : accounts) {
            if (account.getName().equals(name)) {
                account.withdraw(amount);
                history.add(totalMoney());
                notifyListeners();
                return;
            }
        }
        throw new UnknownCustomerException(name);
    }

    public ArrayList<Integer> getHistory() {
        return history;
    }

    public static void testBank() {
        Bank icbc = new Bank("ICBC");
        CreditAccount ca = new CreditAccount("Max", 6666);
        icbc.addAccount(ca);
        System.out.println(icbc.totalMoney() == 6666);
        //Test getMoney
        try {
            System.out.println(icbc.getMoney("Max"));
            System.out.println(icbc.getMoney("Andrew"));
        }
        catch (UnknownCustomerException e) {
            System.out.println(e.getMessage());
        }
        //Test withdraw
        try {
            icbc.withdraw("Max", 2333);
            System.out.println(icbc.getMoney("Max"));
        }
        catch (UnknownCustomerException | NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        }
    }
}
