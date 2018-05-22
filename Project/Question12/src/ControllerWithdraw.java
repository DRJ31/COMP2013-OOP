public class ControllerWithdraw extends Controller {
    public ControllerWithdraw(Bank m) {
        super(m);
    }

    public String withdraw(String name, String amount) {
        try {
            m.withdraw(name, Integer.parseInt(amount));
        }
        catch (UnknownCustomerException | NotEnoughMoneyException | NumberFormatException e) {
            return e.getMessage();
        }
        return "";
    }
}
