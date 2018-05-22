public class ControllerCreate extends Controller {
    public ControllerCreate(Bank m) {
        super(m);
    }

    public String create(String name, String amount, int type) {
        if (type == 0) {
            try {
                m.addAccount(new CreditAccount(name, Integer.parseInt(amount)));
            }
            catch (NumberFormatException e) {
                return e.getMessage();
            }
        }
        else if (type == 1) {
            try {
                m.addAccount(new StudentAccount(name, Integer.parseInt(amount)));
            }
            catch (NotEnoughMoneyException | NumberFormatException e) {
                return e.getMessage();
            }
        }
        return "";
    }
}
