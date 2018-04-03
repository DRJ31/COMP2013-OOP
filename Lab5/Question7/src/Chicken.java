public class Chicken extends Bird {
    public Chicken(String name) {
        super(name, 5.0, 0.0);
    }

    public static void testChicken() {
        Chicken chick = new Chicken("Chick");
        //Test attributes of chickens
        System.out.println(chick.getAltitude() == 0.0);
        System.out.println(chick.getName() == "Chick");
        System.out.println(chick.getWeight() == 5.0);
    }
}
