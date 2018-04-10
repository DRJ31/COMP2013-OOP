import java.util.ArrayList;

public class ManyShapes {
    private ArrayList<Shape> allShapes;

    public ManyShapes() {
        allShapes = new ArrayList<>();
    }

    public void addShapes(Shape s) {
        allShapes.add(s);
    }

    public void listAllShapes() {
        int len = allShapes.size();//Get the size of ArrayList
        for (int i = 0; i < len; i++) {
            System.out.println(allShapes.get(i));
        }
    }

    public static void testManyShapes() {
        ManyShapes m = new ManyShapes();
        m.addShapes(new Circle(1.2, 3.4, 4.0));
        m.addShapes(new Dot(1.2, 3.4));
        m.addShapes(new Rectangle(1.2, 3.4, 4.0, 5.0));
        m.addShapes(new Shape(1.2, 3.4));
        m.addShapes(new Square(1.2, 3.4, 5.0));
        m.listAllShapes();
    }
}
