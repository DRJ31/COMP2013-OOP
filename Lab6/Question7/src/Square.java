//Square does not need its own area method because it is the same way as rectangle
public class Square extends Rectangle {
    public Square(double x, double y, double sideLength) {//Square have same width and length as side length
        super(x, y, sideLength, sideLength);
    }

    public static void testSquare() {
        Square square = new Square(1, 2, 3);
        System.out.println(square.getX() == 1);
        System.out.println(square.getY() == 2);
        System.out.println(square.area() == 9);
    }
    
    @Override
    public String toString() {
        return this.getClass().getName() + " has area " + area();
    }
}
