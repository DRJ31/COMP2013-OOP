/*
 * Square do not need its own area and resize method because the resize method always makes it a square
 * and area method calculate the right area of square
 */
public class Square extends Rectangle {
    public Square(double x, double y, double size) {
        super(x, y, size, size);
    }

    @Override
    public void resize(double newWidth, double newLength) throws CannotResizeException {
        if (newWidth != newLength)
            throw new CannotResizeException("Cannot resize a square into a rectangle!");
        else
            resize(newWidth, newLength);
    }

    public static void testSquare() {
        Square square = new Square(1, 2, 3);
        System.out.println(square.area() == 9);
        System.out.println(square.getX() == 1);
        System.out.println(square.getY() == 2);
        square.move(3, 4);
        System.out.println(square.getX() == 4);
        System.out.println(square.getY() == 6);
        square.resize(5);
        System.out.println(square.area() == 25);
        try {
            square.resize(2, 3);
        }
        catch (CannotResizeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
