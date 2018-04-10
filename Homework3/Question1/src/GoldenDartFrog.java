public class GoldenDartFrog extends Animal {
    public GoldenDartFrog() {
        super("gold");
    }

    @Override
    public boolean isEdible() {
        return false;
    }

    public static void testGoldenDartFrog() {
        GoldenDartFrog frog = new GoldenDartFrog();
        //Test GoldenDartFrog
        System.out.println(frog.isEdible() == false);
        System.out.println(frog.getColor() == "gold");
    }
}
