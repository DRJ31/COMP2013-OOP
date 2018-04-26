public class Door {
    private boolean isOpen;

    public Door() {
        isOpen = false;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void open() {
        isOpen = true;
    }

    public void close() {
        isOpen = false;
    }

    public static void testDoor() {
        Door boyNext = new Door();
        System.out.println(boyNext.isOpen() == false);
        boyNext.open();
        System.out.println(boyNext.isOpen() == true);
        boyNext.close();
        System.out.println(boyNext.isOpen() == false);
    }
}
