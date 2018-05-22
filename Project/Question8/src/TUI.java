import java.util.InputMismatchException;
import java.util.Scanner;

public class TUI {
    private static String readLine(String s) {
        System.out.print(s);
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        return str;
    }

    private static int readPosInt(String s) {
        System.out.print(s);
        Scanner input = new Scanner(System.in);
        int num;
        try {
            num = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You muse type an integer!");
            num = readPosInt(s);
        }
        while (num < 0) {
            System.out.println("Positive integers only!");
            num = readPosInt(s);
        }
        input.nextLine();
        return num;
    }

    private static void addAccount(Bank bank) { //Add account to the bank
        int type = readPosInt("Type the account type (credit: 1  student:2): ");
        if (type < 1 || type > 2) {
            System.out.println("Unknown type of account!");
            return;
        }
        String name = readLine("Enter the name of the customer: ");
        int money = readPosInt("Enter the initial amount of money: ");
        if (type == 1) {
            bank.addAccount(new CreditAccount(name, money));
            System.out.printf("Credit account for %s with %d yuan has been added\n", name, money);
        }
        else {
            try {
                bank.addAccount(new StudentAccount(name, money));
                System.out.printf("Student account for %s with %d yuan has been added\n", name, money);
            }
            catch (NotEnoughMoneyException e) {
                System.out.println("BUG! This muse never happen!");
                System.exit(1);
            }
        }
    }

    private static void list(Bank bank) { //List the amount of money in the account of a given customer
        String name = readLine("Enter the name of the customer: ");
        try {
            System.out.printf("%s has %d yuan in the bank.\n", name, bank.getMoney(name));
        }
        catch (UnknownCustomerException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void withdraw(Bank bank) {
        String name = readLine("Enter the name of the customer: ");
        int amount = readPosInt("Enter the amount of money to withdraw: ");
        try {
            bank.withdraw(name, amount);
        }
        catch (UnknownCustomerException | NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void deposit(Bank bank) {
        String name = readLine("Enter the name of the customer: ");
        int amount = readPosInt("Enter the amount of money to deposit: ");
        try {
            bank.withdraw(name, -amount);
        }
        catch (UnknownCustomerException e) {
            System.out.println(e.getMessage());
        }
        catch (NotEnoughMoneyException e) {
            System.out.println("BUG! This must never happen!");
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank("UIC Bank");
        while (true) {
            int num = readPosInt("Type an action (total:1 add:2 list:3 withdraw:4 deposit:5 quit:6): ");
            if (num < 1 || num > 6) {
                System.out.println("Unknown action!");
                continue;
            }
            switch (num) {
                case 1:
                    System.out.println("Total amount of money in the bank: " + bank.totalMoney());
                    break;
                case 2:
                    addAccount(bank);
                    break;
                case 3:
                    list(bank);
                    break;
                case 4:
                    withdraw(bank);
                    break;
                case 5:
                    deposit(bank);
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    System.exit(0);
                    default:
                        System.out.println("Unknown action!");

            }
        }
    }
}
