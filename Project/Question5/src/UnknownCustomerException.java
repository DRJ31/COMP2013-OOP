public class UnknownCustomerException extends Exception {
    public UnknownCustomerException(String name) {
        super(String.format("Customer %s unknown", name));
    }
}
