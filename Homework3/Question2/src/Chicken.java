public class Chicken extends Bird {
    public Chicken(String color, int numberOfFeathers) {
        super(color, numberOfFeathers);
    }

    public Chicken(String color) {
        this(color, 8000);
    }

    public static void testChicken() {
        Chicken chick1 = new Chicken("yellow", 2160);
        Chicken chick2 = new Chicken("red");
        //Test chick1
        System.out.println(chick1.getColor() == "yellow");
        System.out.println(chick1.getNumberOfFeathers() == 2160);
        System.out.println(chick1.isEdible() == true);
        //Test chick2
        System.out.println(chick2.getColor() == "red");
        System.out.println(chick2.getNumberOfFeathers() == 8000);
        System.out.println(chick2.isEdible() == true);
    }
}
