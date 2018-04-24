public abstract class Shape {
    private double x;
    private double y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public abstract double area();

    public abstract void resize(double newSize) throws Exception;

    public static void testShape() {
        System.out.println("Shape is an abstract class and cannot be initialized.");
    }
}
