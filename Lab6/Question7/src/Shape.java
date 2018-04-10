public class Shape {
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

    public double area() {
        System.out.println("An unknown shape has an unknown area!");
        return 0;
    }
    
    @Override
    public String toString() {
    	return "Shape has area 0.0";
    }
    
    public static void testShape() {
        Shape shape = new Shape(1, 2);
        //Test attributes of shape
        System.out.println(shape.getX() == 1);
        System.out.println(shape.getY() == 2);
        System.out.println(shape.area() == 0);
    }
}
