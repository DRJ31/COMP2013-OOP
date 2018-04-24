public class BadRadiusException extends Exception {
    public BadRadiusException() {
        super("Radius must be positive!");
    }
}
