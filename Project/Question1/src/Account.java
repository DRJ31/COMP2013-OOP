abstract class Account implements IAccount {
    private String name;
    private int money;

    public Account(String name, int money) {
        this.name = name;
        this.money = money;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMoney() {
        return money;
    }

    protected void setMoney(int money) {
        this.money = money;
    }
    
    public static void testAccount() {
    		System.out.println("Account class is abstract and cannot be initialized.");
    }
}
