public class BadCarException extends Exception {
    public BadCarException() {
        super("A car must have at least one door!");
    }
}
