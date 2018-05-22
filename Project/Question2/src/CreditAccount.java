public class CreditAccount extends Account {
    public CreditAccount(String name, int money) {
        super(name, money);
    }

    @Override
    public void withdraw(int amount) {
        super.setMoney(super.getMoney() - amount);
    }
    
    public static void testCreditAccount() {
    		CreditAccount ca = new CreditAccount("CMB", 8848);
        ca.withdraw(9999);
        System.out.println(ca.getName());
        System.out.println(ca.getMoney() == -1151);
    }
}
