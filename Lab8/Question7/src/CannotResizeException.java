public class CannotResizeException extends Exception {
    public CannotResizeException() {
        super("Cannot resize a dot!");
    }

    public CannotResizeException(String message) {
        super(message);
    }
}
