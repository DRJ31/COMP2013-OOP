public class ControllerGetMoney extends Controller {
    public ControllerGetMoney(Bank m) {
        super(m);
    }

    public String getMoney(String name) {
        String result;
        try {
            result = name + " has " + Integer.toString(m.getMoney(name)) + " yuan in the bank";
        }
        catch (UnknownCustomerException e) {
            result = e.getMessage();
        }
        return result;
    }
}
