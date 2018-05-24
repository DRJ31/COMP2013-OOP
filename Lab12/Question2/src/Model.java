import java.awt.*;
import java.util.ArrayList;

public class Model {
    private ArrayList<Point> points;
    private ArrayList<ModelListener> listeners;

    public Model() {
        points = new ArrayList<Point>();
        listeners = new ArrayList<ModelListener>();
    }

    public void addListener(ModelListener l) {
        listeners.add(l);
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    public void addPoint(Point p) {
        points.add(p);
        notifyListeners();
    }

    public void clearAllPoints() {
        points.clear();
        notifyListeners();
    }

    public void deleteLastPoint() {
        points.remove(points.size() - 1);
        notifyListeners();
    }

    public void notifyListeners() {
        for (ModelListener ml : listeners) {
            ml.update();
        }
    }

    public static void testModel() {
        Model model = new Model();
        ArrayList<Point> points;
        model.addPoint(new Point(1, 2));
        model.addPoint(new Point(3, 6));
        points = model.getPoints();
        System.out.println("After adding 2 points.");
        for (Point p : points)
            System.out.println(p);
        System.out.println();
        model.deleteLastPoint();
        points = model.getPoints();
        System.out.println("After deleting 1 point.");
        for (Point p : points)
            System.out.println(p);
        System.out.println();
        model.clearAllPoints();
        System.out.println("After clear all points.");
        for (Point p : points)
            System.out.println(p);
    }
}
