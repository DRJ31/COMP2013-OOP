
public class StudentAccount extends Account {
    public StudentAccount(String name, int money) throws NotEnoughMoneyException {
        super(name, money);
        if (money < 0)
            throw new NotEnoughMoneyException("Cannot create student account with negative amount of money");
    }

    @Override
    public void withdraw(int amount) throws NotEnoughMoneyException {
        if (amount > super.getMoney())
            throw new NotEnoughMoneyException(String.format("Cannot withdraw %d yuan from account, only %d yuan is available", amount, super.getMoney()));
        super.setMoney(super.getMoney() - amount);

    }

    public static void testStudentAccount() {
        try {
            StudentAccount sa = new StudentAccount("BOA", 2160);
            sa.withdraw(3840);
        }
        catch (NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        }
    }
}
