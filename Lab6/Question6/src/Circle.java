public class Circle extends Shape{
    private double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    public static void testCircle() {
        Circle circle = new Circle(2, 4, 3);
        //Test attributes of circle
        System.out.println(circle.getX() == 2);
        System.out.println(circle.getY() == 4);
        System.out.println(circle.area() == 9 * Math.PI);
    }
}
