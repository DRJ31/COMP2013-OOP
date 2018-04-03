
public class Bird extends Animal{
    private double altitude;

    public Bird(String name, double weight, double altitude) {
        super(name, weight);
        this.altitude = altitude;
    }

    public double getAltitude() {
        return altitude;
    }

    public static void testBird() {
        Bird bird = new Bird("Nougat", 1.0, 1080);
        System.out.println(bird.getAltitude() == 1080);
    }
}
