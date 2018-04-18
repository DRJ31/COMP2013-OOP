public abstract class Bird extends Animal {
    private int numOfEggs;

    public Bird(String name, int numOfEggs) {
        super(name);
        this.numOfEggs = numOfEggs;
    }

    public int getNumOfEggs() {
        return numOfEggs;
    }

    @Override
    public int getLegs() {
    	return 2;
    }

    public static void testBird() {
        System.out.println("Bird is an abstract class, and cannot be initialize.");
    }
}
