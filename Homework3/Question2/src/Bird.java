public class Bird extends Animal {
    private int numberOfFeathers;

    public Bird(String color, int numberOfFeathers) {
        super(color);
        this.numberOfFeathers = numberOfFeathers;
    }

    public int getNumberOfFeathers() {
        return numberOfFeathers;
    }

    @Override
    public boolean isEdible() {
        return true;
    }

    public static void testBird() {
        Bird bird = new Bird("orange", 8700);
        //Test attributes of bird
        System.out.println(bird.getNumberOfFeathers() == 8700);
        System.out.println(bird.isEdible() == true);
        System.out.println(bird.getColor() == "orange");
    }
}
