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
    
    public void resize(double newWidth, double newLength) {
        width = newWidth;
        length = newLength;
    }
    //The square class may be turn into a rectangle when it use another resize function

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
        rectangle.resize(2, 3);
        System.out.println(rectangle.area() == 6);
    }
}
