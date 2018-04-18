public class Fish {
    private String name;
    private Fish friend;

    public Fish(String name, Fish friend) {
        this.name = name;
        this.friend = friend;
    }

    public String getName() {
        return name;
    }

    public Fish getFriend() {
        return friend;
    }

    public static void testFish() {
        System.out.println("It is impossible to create a new object of Fish.");
    }
}
