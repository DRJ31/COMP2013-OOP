/*
* We have to modify Shape class because resize in dot need to throw Exception.
* We don't need to modify Circle because the resize of circle do not throw Exception.
 */
public class Dot extends Shape {
    public Dot(double x, double y) {
        super(x, y);
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public void resize(double newSize) throws CannotResizeException {
        throw new CannotResizeException();
    }

    public static void testDot() {
        Dot dot = new Dot(2, 1);
        System.out.println(dot.area() == 0);
        System.out.println(dot.getX() == 2);
        System.out.println(dot.getY() == 1);
        dot.move(1, 2);
        System.out.println(dot.getX() == 3);
        System.out.println(dot.getY() == 3);
        try {
            dot.resize(13);
        }
        catch (CannotResizeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
