public abstract class Bird extends Animal implements Flyer{
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
    
    @Override
    public boolean isDangerous() {
    	return false;
    }

    public static void testBird() {
    	System.out.println("Bird is an abstract class, and cannot be initialize.");
    }
}
