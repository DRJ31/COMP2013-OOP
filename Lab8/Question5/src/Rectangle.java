/*
* Resize need its own area and resize method because area and resize is abstract in its super class
 */
public class Rectangle extends Shape {
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

    @Override
    public void resize(double newSize) {
        width = newSize;
        length = newSize;
    }
    
    public static void testRectangle() {
        Rectangle rectangle = new Rectangle(1, 2, 3, 4);
        System.out.println(rectangle.area() == 12);
        System.out.println(rectangle.getX() == 1);
        System.out.println(rectangle.getY() == 2);
        rectangle.move(3, 4);
        System.out.println(rectangle.getX() == 4);
        System.out.println(rectangle.getY() == 6);
        rectangle.resize(5);
        System.out.println(rectangle.area() == 25);
    }
}
