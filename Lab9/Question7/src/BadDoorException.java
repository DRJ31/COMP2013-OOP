public class BadDoorException extends Exception {
    public BadDoorException(int num) { //num is the number of the nonexistent door
        super("Door " + num + " does not exist!");
    }
}
