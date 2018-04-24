public class Circle extends Shape {
    private double radius;

    public Circle(double x, double y, double radius) throws BadRadiusException {
        super(x, y);
        if (radius < 0)
            throw new BadRadiusException();
        else
            this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void resize(double newRadius) throws BadRadiusException {
        if (newRadius < 0)
            throw new BadRadiusException();
        else
            radius = newRadius;
    }

    public static void testCircle() {
        Circle circle;
        try {
            circle = new Circle(1, 0, 4);
            System.out.println(circle.area() == 16 * Math.PI);
            System.out.println(circle.getX() == 1);
            System.out.println(circle.getY() == 0);
            circle.move(2, 1);
            System.out.println(circle.getX() == 3);
            System.out.println(circle.getY() == 1);
            circle.resize(-1);
            System.out.println(circle.area() == 4 * Math.PI);
        }
        catch (BadRadiusException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
