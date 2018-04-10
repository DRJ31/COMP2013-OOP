public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(double x, double y, double width, double length) {
        super(x, y);
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }

    public static void testRectangle() {
        Rectangle rectangle = new Rectangle(2, 1, 3, 4);
        System.out.println(rectangle.getX() == 2);
        System.out.println(rectangle.getY() == 1);
        System.out.println(rectangle.area() == 12);
    }
    
    @Override
    public String toString() {
        return this.getClass().getName() + " has area " + area();
    }
}
