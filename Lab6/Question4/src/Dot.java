public class Dot extends Shape{
    public Dot(double x, double y) {
        super(x, y);
    }

    @Override
    public double area() {
        return 0;
    }

    public static void testDot() {
        Dot dot = new Dot(1, 2);
        //Test attributes of dot
        System.out.println(dot.getX() == 1);
        System.out.println(dot.getY() == 2);
        System.out.println(dot.area() == 0);
    }
}
